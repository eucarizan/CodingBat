import java.util.List;
import java.util.stream.Collectors;

public class Square {
    public static List<Integer> square(List<Integer> nums) {
        return nums.stream()
                .map(e -> e * e)
                .collect(Collectors.toList());
    }
}
