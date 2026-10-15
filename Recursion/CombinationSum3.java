public class CombinationSum3 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>res = new ArrayList<>();
        int[] nums = {1,2,3,4,5,6,7,8,9};
        FindCombinations(k,n,0,nums,res,new ArrayList<>());
        return res;
    }
    private void FindCombinations(int k,int n,int start,int[] nums,List<List<Integer>>res,List<Integer>curr){
        if(n==0 && curr.size()==k){
            res.add(new ArrayList<>(curr));
            return;
        }
        if(n<0 || curr.size()>=k) return;
        for(int i=start;i<nums.length;i++){
            if(nums[i]>n) break;
              curr.add(nums[i]);
              FindCombinations(k,n-nums[i],i+1,nums,res,curr);
              curr.remove(curr.size()-1);
        }
        
    }
}
