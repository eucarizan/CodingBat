package solutions;

import java.util.List;
import java.util.stream.Collectors;

public class Doubling {
    public static List<Integer> doubling(List<Integer> nums) {
        return nums.stream()
                .map(e -> e * 2)
                .collect(Collectors.toList());
    }
}
