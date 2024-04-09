package solutions;

import java.util.List;
import java.util.stream.Collectors;

public class No9 {
    public static List<Integer> no9(List<Integer> nums) {
        return nums.stream().filter(e -> e % 10 != 9).collect(Collectors.toList());
    }
}
