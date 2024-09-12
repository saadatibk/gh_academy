class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> combs = new ArrayList<>();
        combine(combs, new ArrayList<>(), 1, n , k);
        return combs;
    }

    public static void combine (List<List<Integer>> combs, List<Integer> tempComb, int start, int n, int k){
        if( k == 0){
            combs.add(new ArrayList<Integer>(tempComb));
            return;
        }
        for (int i = start; i <= n ; i++){
            tempComb.add(i);
            combine(combs, tempComb, i + 1 , n, k - 1);
            tempComb.remove( tempComb.size() - 1);
        }
    }
}
