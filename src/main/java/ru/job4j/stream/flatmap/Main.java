package ru.job4j.stream.flatmap;

import java.util.List;
import java.util.stream.Stream;

/**
 * @author Aleksandr Volchkov
 */
public class Main {
    public static void main(String[] args) {
        List<Card> cards = Stream.of(Suit.values())
                .flatMap(s -> Stream.of(Value.values())
                        .map(v -> new Card(s, v)))
                .toList();
    }
}
