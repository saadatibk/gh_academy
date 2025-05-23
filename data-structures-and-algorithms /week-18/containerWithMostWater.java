class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int answer = 0;
        while (i < j){
            int w = j - i;
            int h = Math.min(height[i], height[j]);
            int v = w * h;
            answer = Math.max(answer, v);
            if (height[i] < height[j]){
                i++;
            } else {
                j--;
            }
        }
        return answer;
    }
}
