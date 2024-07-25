class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] answer = new int[nums.length];
        int even = 0;
        int odd = 1;
        for( int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                answer[even] = nums[i];
                even = even + 2;
            }
            else {
                answer[odd] = nums[i];
                odd = odd +2;
            }
        }
        return answer;
    }
}
