public class MakeLast {
    public static int[] makeLast(int[] nums) {
        int[] copyNums = new int[nums.length * 2];
        copyNums[copyNums.length - 1] = nums[nums.length - 1];
        return copyNums;
    }
}
