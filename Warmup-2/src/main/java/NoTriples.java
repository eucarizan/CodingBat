public class NoTriples {
    public static boolean noTriples(int[] nums) {
        if (nums.length < 3) {
            return true;
        }

        for (int i = 2; i < nums.length; i++) {
            if (nums[i - 2] == nums[i - 1] && nums[i - 1] == nums[i]) {
                return false;
            }
        }

        return true;
    }
}
