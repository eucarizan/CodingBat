package solutions;

import java.util.List;
import java.util.stream.Collectors;

public class NoTeen {
    public static List<Integer> noTeen(List<Integer> nums) {
        return nums.stream().filter(e -> e < 13 || e > 19).collect(Collectors.toList());
    }
}
