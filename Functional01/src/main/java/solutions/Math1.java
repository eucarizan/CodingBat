package solutions;

import java.util.List;
import java.util.stream.Collectors;

public class Math1 {
    public static List<Integer> math1(List<Integer> nums) {
        return nums.stream().map(e -> (e + 1) * 10).collect(Collectors.toList());
    }
}
