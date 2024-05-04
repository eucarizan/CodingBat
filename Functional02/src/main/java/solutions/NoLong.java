package solutions;

import java.util.List;
import java.util.stream.Collectors;

public class NoLong {
    public static List<String> noLong(List<String> strings) {
        return strings.stream().filter(e -> e.length() < 4).collect(Collectors.toList());
    }
}
