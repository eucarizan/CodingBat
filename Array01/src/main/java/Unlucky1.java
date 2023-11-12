public class Unlucky1 {
    public static boolean unlucky1(int[] nums) {
        if (nums.length < 2) {
            return false;
        }

        if (nums.length == 2) {
            return nums[0] == 1 && nums[1] == 3;
        }

        boolean last = nums[0] == 1 && nums[1] == 3
                || nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3;

        if (nums.length == 3) {
            return last;
        }

        return last || nums[1] == 1 && nums[2] == 3;
    }
}
