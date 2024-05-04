public class MaxEnd3 {
    public static int[] maxEnd3(int[] nums) {
        int max = nums[0];

        if (max < nums[2]) {
            max = nums[2];
        }

        nums[0] = max;
        nums[1] = max;
        nums[2] = max;

        return nums;
    }
}
