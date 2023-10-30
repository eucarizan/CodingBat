public class Has271 {
    public static boolean has271(int[] nums) {
        if (nums.length < 2) {
            return false;
        }

        for (int i = 0; i < nums.length - 2; i++) {
            int value = nums[i];
            // if (value+5 == nums[i+1] && (nums[i+2]+2 >= value-1 && nums[i+2]-2 <= value-1)) {
            if (value + 5 == nums[i + 1] && Math.abs(nums[i + 2] - (value - 1)) <= 2) {
                return true;
            }
        }

        return false;
    }
}
