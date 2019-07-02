/*You are given two non-empty linked lists representing two non-negative integers. 
The digits are stored in reverse order and each of their nodes contain a single digit. 
Add the two numbers and return it as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
	public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ptr1=l1;
        ListNode ptr2=l2;
        int reminder=0;
        ListNode answer=new ListNode((ptr1.val+ptr2.val+reminder)%10);
        reminder= ptr1.val+ptr2.val+reminder >=10 ? 1 : 0;
        ListNode ptr0=answer;
        ptr1=ptr1.next;
        ptr2=ptr2.next; 
        while(true){
        	if (ptr1 == null && ptr2 == null ){
        		if (reminder==1){
        			ptr0.next=new ListNode(1);
        		} 
        		return answer;
        	} else if (ptr1 != null && ptr2 == null){
        		ptr0.next=new ListNode((ptr1.val+reminder)%10);
        		ptr0=ptr0.next;
        		reminder= ptr1.val+reminder >=10 ? 1 :0;
        		ptr1=ptr1.next;
        	} else if (ptr1 == null && ptr2 != null){
        		ptr0.next=new ListNode((ptr2.val+reminder)%10);
        		ptr0=ptr0.next;
        		reminder= ptr2.val+reminder >=10 ? 1 :0;
        		ptr2=ptr2.next;
        	} else if (ptr1 != null && ptr2 != null){
        		ptr0.next=new ListNode((ptr1.val+ptr2.val+reminder)%10);
        		ptr0=ptr0.next;
        		reminder= ptr1.val+ptr2.val+reminder >=10 ? 1 : 0;
        		ptr1=ptr1.next;
        		ptr2=ptr2.next; 
        	}               
    	}
	}

    public static void main(String args[]) {
    	ListNode l1=new ListNode(5);
    	l1.next=new ListNode(6);
    	l1.next.next=new ListNode(7);
    	ListNode l2=new ListNode(5);
    	l2.next=new ListNode(6);
    	l2.next.next=new ListNode(7);
    	Solution sol=new Solution();
    	ListNode answer=sol.addTwoNumbers(l1,l2);
    	while (answer!=null){
    		System.out.println(answer.val);
    		answer=answer.next;
    	}
    	
    }


}