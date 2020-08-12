package medium;

public class ReorderList {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

      public static ListNode create(ListNode head) {
          ListNode temp = null;
          ListNode tail = null;
          for(int i = 0; i < 4; i++) {
              temp = new ListNode();
              temp.val = i + 1;
              if(head == null) {
                  head = tail = temp;
              }
              tail.next = temp;
              tail = temp;
          }
          return head;
      }
      public static ListNode returnList(ListNode head) {
          ListNode list = null;
          ListNode tail = null;
          while(head != null) {
              ListNode temp = new ListNode();
              if(list == null) {
                  temp.val = head.val;
                  list = tail = temp;
              }
              else{
                  temp.val = head.val;
                  tail.next = temp;
                  tail = temp;
              }
              head = head.next;
          }
          return list;
      }
      public static void reorderList(ListNode head) {
          ListNode pre = null;
          ListNode temp = null;
          ListNode cur = null;
          ListNode tail;
          int i = 0;
          int j = 0;
          tail = returnList(head);

          while(head != null) {
              temp = head.next;
              head.next = pre;
              pre = head;
              head = temp;
              i++;
          }

          ListNode list = null;
          int flag = 0;
          while(tail != null || pre != null) {
              //System.out.println(j);
              ListNode node = new ListNode();
              if(cur == null && j < i) {
                  node.val = tail.val;
                  cur = list = node;
                  tail = tail.next;
                  j++;
              }
              else {
                  if(j < i && flag == 0) {
                      node.val = pre.val;
                      list.next = node;
                      list = node;
                      pre = pre.next;
                      j++;
                      flag = 1;
                  }
                  else if(j < i && flag == 1) {
                     node.val = tail.val;
                     list.next = node;
                     list = node;
                     tail = tail.next;
                     j++;
                     flag = 0;
                 }
              }
              //System.out.println();
              if(i == j) break;
          }
          while(cur != null) {
              System.out.print(cur.val);
              cur = cur.next;
          }
      }
  }

  public static void main(String[] args) {
        ListNode listNode = null;
        listNode = ListNode.create(listNode);
        ListNode.reorderList(listNode);
  }
}
