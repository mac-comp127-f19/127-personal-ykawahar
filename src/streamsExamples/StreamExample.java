package streamsExamples;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class StreamExample {

    public static void main(String[] args) {
        List<String> elements = new ArrayList<String>();

        elements.add("hydrogen");
        elements.add("helium");
        elements.add("lithium");
        elements.add("beryllium");
        elements.add("boron");
        elements.add("carbon");
        elements.add("nitrogen");
        elements.add("oxygen");
        elements.add("fluorine");
        elements.add("neon");

        Stream<String> s = elements.stream();
        s.forEach(System.out::println);
        System.out.println("------------------------------");

//        s = elements.stream()
//                    .count();

        List<String> longest = elements.stream()
                .sorted(comparing(d -> -d.length()))
                .limit(1)
                .collect(toList());
        s = longest.stream();
        s.forEach(System.out::println);

        List<String> longNames = elements.stream()
                .filter(d -> d.length() > 5)
                .collect(toList());
        s = longNames.stream();
        s.forEach(System.out::println);
    }

}
