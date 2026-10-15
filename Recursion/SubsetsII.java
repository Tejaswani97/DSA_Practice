class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>res = new ArrayList<>();
        Arrays.sort(nums);
        NoofSubsets(nums,0,res,new ArrayList<>());
        return res;
    }
    private void NoofSubsets(int[] nums,int start,List<List<Integer>>res,List<Integer>curr){
        res.add(new ArrayList<>(curr));
        for(int i=start;i<nums.length;i++){
            if(i>nums.length) break;
            if(i>start && nums[i-1]==nums[i]) continue;
            curr.add(nums[i]);
            NoofSubsets(nums,i+1,res,curr);
            curr.remove(curr.size()-1);
        }
    }
}