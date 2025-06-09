package Assignment_16;

import java.util.Arrays;

public class find_count_lts {
    
    public static int findNumberOfLIS(int[] nums) {
        int n = nums.length;

        int[] dp = new int[n];
        int[] count = new int[n];
        Arrays.fill(dp, 1);
        Arrays.fill(count, 1);

        int max = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i] && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    count[i] = count[j];
                } else if (nums[j] < nums[i] && dp[j] + 1 == dp[i]) {
                    count[i] += count[j];
                }
            }
            max = Math.max(max, dp[i]);
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            if (dp[i] == max) {
                res += count[i];
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 4, 7};
        int result = findNumberOfLIS(nums);
        System.out.println(result);
    }
}

