class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;
        int answer = -1;
        for (int w : weights) {
            left = Math.max(left, w);
            right += w;
        }
        while (left <= right) {
            int middle = left + (right - left) / 2 ;
            int need = 1;
            int cur = 0;
            for (int w : weights) {
                if (cur + w > middle){
                    need += 1;
                    cur = w;
                } else {
                    cur += w;
                }
            }
            if (need > days){
                left = middle + 1;
            } else {
                answer = middle;
                right = middle - 1;
            }
        }
        return answer;
    }
}
