import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String message = "подожди,ты забыл свою куртку бро";
        List <String> vocabulary = getTheWords(splitToList.apply(message));
        vocabulary.forEach(System.out::println);
    }

    public static List<String> getTheWords (Collection <String> words) {
        return words.stream()
                .sorted()
                .collect(Collectors.toList());
    }
    public static Function<String, List<String>> splitToList = word -> Arrays.stream(word.split(" |,")).toList();
}
