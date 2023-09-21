package java;

public class MergeTwoSortedLists {
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next; // NEXT basically calls for recursive work
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
      // work recursive
      // you do not need to merge them into a NEW list
      ListNode sortList = new ListNode();
      if (list1 != null && list2 != null){
        if (list1.val < list2.val){
          list1.next = (mergeTwoLists(list1.next, list2));
          return list1;
        }
        else {
          list2.next = (mergeTwoLists(list1, list2.next));
          return list2;
        }
      }
      else if (list1 == null){
          return list2;
      }
      else return list1;
    }
}
}

}
