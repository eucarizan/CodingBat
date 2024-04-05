import java.util.List;
import java.util.stream.Collectors;

public class Copies3 {
    public static List<String> copies3(List<String> strings) {
        return strings.stream()
                .map(e -> String.format("%s%s%s", e, e,e))
                .collect(Collectors.toList());
    }
}
