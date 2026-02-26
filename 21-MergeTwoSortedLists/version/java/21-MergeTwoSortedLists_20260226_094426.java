// Last updated: 26/02/2026, 09:44:26
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
13         if(list1!=null && list2!=null){
14        if(list1.val<list2.val){
15            list1.next=mergeTwoLists(list1.next,list2);
16            return list1;
17            }
18            else{
19                list2.next=mergeTwoLists(list1,list2.next);
20                return list2;
21        }
22        }
23        if(list1==null)
24            return list2;
25        return list1;
26    }
27}