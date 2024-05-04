public class MaxTriple {
    public static int maxTriple(int[] nums) {
        int max = nums[0];

        if (nums.length == 1) {
            return max;
        }

        int mid = nums.length / 2;

        return Math.max(Math.max(max, nums[mid]), nums[nums.length - 1]);
    }
}
