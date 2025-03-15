import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.function.Function;
import java.util.stream.*;

// The main method must be in a class named "Main".
class StringWordCount {
    public static void main(String[] args) {
        String s1 = "india wins a news from india states india wins";
        Map<String, Long> wordCount = Arrays.stream(s1.split(" "))
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(wordCount);
    }
}
