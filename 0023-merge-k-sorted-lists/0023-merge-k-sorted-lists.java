/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
// class Solution {
//   public  ListNode mergeTwoLists(ListNode list1, ListNode list2) {
   
//         ListNode  dummy = new ListNode(0);

//         ListNode i = list1;
//         ListNode j = list2;
//         ListNode k = dummy;
//         while(i != null && j != null){
//             if(i.val <= j.val){
//                k.next =i;
//                i = i.next;
//             }
//             else{
//                 k.next = j;
//                 j = j.next;
//             }
//              k = k.next;
//         }
//        if(i == null ) k.next = j;
//        else k.next = i;
//         return dummy.next;
//     }
//    public ListNode mergeKLists(ListNode[] lists) {
//         if(lists.length == 0) return null;
//         ArrayList<ListNode> arr = new ArrayList<>();
//         for(ListNode n : lists) arr.add(n);
//         while(arr.size()>1){
//             ListNode a = arr.get(arr.size()-1);
//             arr.remove(arr.size()-1);
//             ListNode b =  arr.get(arr.size()-1);
//             arr.remove(arr.size()-1);
//             ListNode c = mergeTwoLists(a , b);
//             arr.add(c);
//         }
//         return arr.get(0);
//     }
// }



// class Solution {
//   public  ListNode mergeTwoLists(ListNode list1, ListNode list2) {
   
//         ListNode  dummy = new ListNode(0);

//         ListNode i = list1;
//         ListNode j = list2;
//         ListNode k = dummy;
//         while(i != null && j != null){
//             if(i.val <= j.val){
//                k.next =i;
//                i = i.next;
//             }
//             else{
//                 k.next = j;       // T.C = O(knlogk)
//                 j = j.next;
//             }
//              k = k.next;
//         }
//        if(i == null ) k.next = j;
//        else k.next = i;
//         return dummy.next;
//     }
//    public ListNode mergeKLists(ListNode[] lists) {
//         if(lists.length == 0) return null;
//         ArrayList<ListNode> arr1 = new ArrayList<>();
//         ArrayList<ListNode> arr2 = new ArrayList<>();
//        for(ListNode n : lists) arr1.add(n);
//          while (arr1.size() > 1) {

//             arr2.clear(); // prepare arr2 for this round

//             // Merge pairs from arr1
//             for (int i = 0; i < arr1.size(); i += 2) {

//                 ListNode a = arr1.get(i);

//                 // If odd number of lists → last one directly goes to arr2
//                 if (i + 1 >= arr1.size()) {
//                     arr2.add(a);
//                 } else {
//                     ListNode b = arr1.get(i + 1);
//                     ListNode merged = mergeTwoLists(a, b);
//                     arr2.add(merged);
//                 }
//             }

//             // swap arr1 and arr2 for next round
//             ArrayList<ListNode> temp = arr1;
//             arr1 = arr2;
//             arr2 = temp;
//         }

//         return arr1.get(0);
//     }
// }

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b) -> a.val - b.val);
        for(ListNode node : lists){
            if(node != null) {
                pq.add(node);
            }
        }
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        while(pq.size()>0) {
            ListNode curr = pq.remove();
            tail.next = curr;
            tail = tail.next;

            if(curr.next != null){
                pq.add(curr.next);
            }
        }
        return dummy.next;
    }
}