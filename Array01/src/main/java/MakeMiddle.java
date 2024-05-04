public class MakeMiddle {
    public static int[] makeMiddle(int[] nums) {
        int mid = nums.length / 2;
        return new int[] {nums[mid - 1], nums[mid]};
    }
}
