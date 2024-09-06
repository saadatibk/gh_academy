class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
            for(int n : nums) {
                set.add(n);
            }
            int longest_streak = 0;
            for(int n : set) {
                if(!set.contains(n - 1)) {  
                    int streak_start = n;
                    int streak_end = n + 1;
                    while(set.contains(streak_end)) {
                        streak_end++;
                    }
                    longest_streak = Math.max(longest_streak, streak_end - streak_start);
                }
                
            }
            return longest_streak;
        }
    }
