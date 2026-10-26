class Solution {
    public boolean containsDuplicate(int[] nums) {
        //so basically we will be using hashset here as we will have to see only the element is present or not 
        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(!set.add(num)){
                return true;
            }
        }
        return false;
    }
}