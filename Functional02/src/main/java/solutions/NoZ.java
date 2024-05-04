package solutions;

import java.util.List;
import java.util.stream.Collectors;

public class NoZ {
    public static List<String> noZ(List<String> strings) {
        return strings.stream().filter(e -> !e.contains("z")).collect(Collectors.toList());
    }
}
