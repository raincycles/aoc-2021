package xyz.raincycles.days;

public class Day01Pt1 {
    public static long solve(String input) {
        int[] nums = input.lines().mapToInt(x -> Integer.parseInt(x, 10)).toArray();

        int last = nums[0];
        int count = 0;

        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] > last) {
                count++;
            }

            last = nums[i];
        }

        return count;
    }
}
