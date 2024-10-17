package no.fintlabs.javachallenges.streams;

import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class MediumStreamTest {

    // Telle unike tall i en liste
    @Test
    public void countUniqueNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        long uniqueNumberCount = 0; // numbers.stream() osv...

        assertEquals(5, uniqueNumberCount);
    }

    // Telle unike ord i en setning
    @Test
    public void countUniqueWords() {
        String sentence = "Java streams are powerful and Streams are flexible and STREAMS are useful";
        long uniqueWordCount = 0; //Arrays.stream(sentence.split("\\s+")) osv...

        assertEquals(7, uniqueWordCount);
    }

    // Finne det nest høyeste tallet
    @Test
    public void findSpecificNumber() {
        List<Integer> numbers = Arrays.asList(3, 5, 7, 1, 9, 8, 4);
        Optional<Integer> secondLargest = Optional.of(0); // numbers.stream() osv...

        assertTrue(secondLargest.isPresent());
        assertEquals(8, secondLargest.get());
    }

    // Finne produktet med høyest pris
    @Test
    public void findProductByPrice() {
        List<Product> products = Arrays.asList(
                new Product("Laptop", 1200.0),
                new Product("Phone", 800.0),
                new Product("Tablet", 600.0),
                new Product("Monitor", 300.0)
        );
        Optional<Product> secondMostExpensive = Optional.empty(); // løs oppgaven her

        assertTrue(secondMostExpensive.isPresent());
        assertEquals("Laptop", secondMostExpensive.get().getName());
    }

    // Kombinere flere lister til én enkelt liste
    @Test
    public void combineMultipleLists() {
        List<Product> electronics = Arrays.asList(new Product("Laptop", 1200.0), new Product("Phone", 800.0));
        List<Product> accessories = Arrays.asList(new Product("Mouse", 50.0), new Product("Keyboard", 100.0));

        List<Product> combinedList = null; // Stream.of(electronics, accessories) osv...

        assertEquals(4, combinedList.size());
    }

    // Sjekk om alle produkter koster mer enn 500,-
    @Test
    public void checkIfAllProductsAreExpensive() {
        List<Product> products = Arrays.asList(
                new Product("Laptop", 1200.0),
                new Product("Phone", 800.0),
                new Product("Tablet", 600.0)
        );
        boolean allExpensive = false; // products.stream() osv...

        assertTrue(allExpensive);
    }
}
