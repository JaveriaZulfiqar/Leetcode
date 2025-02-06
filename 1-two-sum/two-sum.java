class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i=0; i<nums.length-1;i++){   //pointer 1
           for (int j=i+1; j<nums.length;j++){     //pointer 2 
                if (nums[i]+ nums[j]== target){
                    return new int [] {i, j};       //returning answer as an array
                }
            }
        }
        return new int[] {};   //incase because of some reason loop doesn't work
    }
}