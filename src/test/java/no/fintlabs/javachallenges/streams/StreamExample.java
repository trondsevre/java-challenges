package no.fintlabs.javachallenges.streams;

import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void example() {

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        List<String> upperCaseNames = new ArrayList<>();

        for (int i = 0; i < names.size(); i++) {

            String name = names.get(i);

            if (!StringUtils.hasText(name)) continue;

            if (name.length() > 3) {
                upperCaseNames.add(name.toUpperCase());
            }
        }

        System.out.println(upperCaseNames);
    }
}
