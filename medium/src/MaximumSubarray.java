class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int res = 0;
        int bestResult=nums[0];
        for(int i=0; i < nums.length;i++){
            res+=nums[i];
            if(bestResult<res){
                bestResult = res;
            }
            if(res<0){
                res=0;
            }
        }
        return bestResult;
    }
}