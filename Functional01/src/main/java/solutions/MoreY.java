package solutions;

import java.util.List;
import java.util.stream.Collectors;

public class MoreY {
    public static List<String> moreY(List<String> strings) {
        return strings.stream()
                .map(e -> String.format("y%sy", e))
                .collect(Collectors.toList());
    }
}
