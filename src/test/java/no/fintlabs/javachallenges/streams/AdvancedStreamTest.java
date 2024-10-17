package no.fintlabs.javachallenges.streams;

import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;

public class AdvancedStreamTest {

    // Hent statistikk for en rekke beløper
    @Test
    public void calculateOrderSummaryStatistics() {
        List<Order> orders = Arrays.asList(
                new Order("ORD1", 150.0),
                new Order("ORD2", 300.0),
                new Order("ORD3", 450.0)
        );
        DoubleSummaryStatistics stats = null; // orders.stream() osv...

        assertEquals(3, stats.getCount());
        assertEquals(900.0, stats.getSum());
        assertEquals(300.0, stats.getAverage());
    }

    // List ord med komma-separasjon
    @Test
    public void joinWordsIntoString() {
        List<String> words = Arrays.asList("java", "streams", "are", "great");
        String joinedString = ""; // løs oppgaven her

        assertEquals("java, streams, are, great", joinedString);
    }

    // Bruk Stream til å generere 5 tilfeldig tall
    @Test
    public void generateRandomNumbers() {
        List<Double> randomNumbers = null; // Løs oppgaven her

        assertEquals(5, randomNumbers.size());
        randomNumbers.forEach(num -> assertTrue(num >= 0.0 && num < 1.0));
    }

    // Bruk Stream til å iterere over de 5 første tallene på eksponenten av 2 (Ikke hardkodet)
    @Test
    public void generateSequenceOfNumbers() {
        List<Integer> sequence = null; // Stream.iterate osv...

        assertEquals(Arrays.asList(2, 4, 8, 16, 32), sequence);
    }

    // Finn gjennomsnittlig lengde på ord
    @Test
    public void calculateAverageWordLength() {
        List<String> words = Arrays.asList("java", "kult", "gøyalt", "enkelt");
        double averageLength = 0; // løs oppgaven her

        assertEquals(5.0, averageLength);
    }

    // Finn gjennomsnittlig ordreverdi
    @Test
    public void calculateAverageOrderValue() {
        List<Order> orders = Arrays.asList(
                new Order("ORD1", 150.0),
                new Order("ORD2", 300.0),
                new Order("ORD3", 450.0)
        );
        double averageOrderValue = 0; // orders.stream() osv...

        assertEquals(300.0, averageOrderValue);
    }

    // Gruppere strenger etter lengde
    @Test
    public void groupWordsByLength() {
        List<String> words = Arrays.asList("apple", "banana", "pear", "kiwi", "mango", "plum");

        Map<Integer, List<String>> groupedByLength = null; // words.stream() osv...

        assertEquals(3, groupedByLength.get(4).size());
        assertEquals(2, groupedByLength.get(5).size());
    }
}