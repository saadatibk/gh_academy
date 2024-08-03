public class VerySimpleProblem {
    private static class Solution{
        private void run(InputReader in, PrintWriter out ){
            int n = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();

            int left = 0;
            int right = (int) 1e9;
            int answer = -1;
            n--;
            while (left <= right){
                int middle = left + (right - left) / 2;
                if ( middle / x + middle / y >= n){
                    answer = middle;
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            }

            System.out.println(Math.min(x,y) + answer);
        }
    }
    
}
