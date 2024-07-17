class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int[] counter = new int[3];
        for (int i = 0; i < n; i++){
            if(nums[i] == 0){
               counter[0] += 1;
            }
            else if(nums[i] == 1){
                counter[1] += 1;
            }
            else counter[2] += 1;
        }

       for( int i = 0; i < n; i++){
        if (i < counter[0]) {nums[i] = 0;}
        else if (i < counter[0] + counter[1]) {nums[i] = 1;}
        else {nums[i] = 2;}

       }
    }
}
