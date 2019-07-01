/*Given an array of integers, return indices of the two numbers 
such that they add up to a specific target.
You may assume that each input would have exactly one solution, 
and you may not use the same element twice.*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
    	int[] arr= new int[]{-1,-1};
    	if (nums.length==0 || nums.length==1){
    		return arr;
    	} else {
    		nested:
    		for (int i=0;i<nums.length-1;i++){
    			for (int j =i+1; j<nums.length; j++){
    				if (nums[i]+nums[j]==target){
    					arr[0]=i;
    					arr[1]=j;
    					break nested;
    				}// end if
    			}// end inner loop			
    		}//end of outer for loop
    	}//end of else
    	return arr;
    }//end of twoSum 

    public static void main(String [] args){
    	int arr[]={11,12,2,7};
    	int target=9;
    	Solution sol=new Solution();
    	int solution[];
    	solution=sol.twoSum(arr,target);
    	System.out.println(solution[0]+","+solution[1]);
    }
}