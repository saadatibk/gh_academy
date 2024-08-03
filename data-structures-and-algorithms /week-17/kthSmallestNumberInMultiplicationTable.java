class Solution {
    public int findKthNumber(int m, int n, int k) {
        int left = 0;
        int right = k;

        while (left <= right ){
            int middle = left + (right - left) / 2;
            int totalValues = 0;
            for (int i = 1; i <= n; i++){
                totalValues += Math.min(middle/ i, m);
            }
            if (totalValues >= k){
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return left;
    }
}
