package solutions;

import java.util.List;
import java.util.stream.Collectors;

public class NoX {
    public static List<String> noX(List<String> strings) {
        return strings.stream()
                .map(e -> e.replaceAll("x", ""))
                .collect(Collectors.toList());
    }
}
