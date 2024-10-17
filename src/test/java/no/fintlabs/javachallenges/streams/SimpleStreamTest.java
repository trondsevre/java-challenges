package no.fintlabs.javachallenges.streams;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleStreamTest {

    // Finn tall større enn 5
    @Test
    public void testGreaterThanFive() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> greaterThanFive = numbers.stream()
                // løs oppgaven her
                .collect(Collectors.toList());
        assertEquals(Arrays.asList(6, 7, 8, 9, 10), greaterThanFive);
    }

    // Finn partall i en liste
    @Test
    public void testEvenNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers.stream()
                // løs oppgaven her
                .collect(Collectors.toList());
        assertEquals(Arrays.asList(2, 4, 6, 8, 10), evenNumbers);
    }

    // Plukk ut ansatte eldre enn 30 år
    @Test
    public void testEmployeesOlderThan30() {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 25),
                new Employee("Bob", 35),
                new Employee("Charlie", 28),
                new Employee("David", 40)
        );
        List<Employee> filteredEmployees = null; // løs oppgaven her

        assertEquals(2, filteredEmployees.size());
        assertEquals("Bob", filteredEmployees.get(0).getName());
        assertEquals("David", filteredEmployees.get(1).getName());
    }

    // Ganger alle tall i en liste med 3
    @Test
    public void testMultiplyByThree() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        List<Integer> multipliedByThree = null; // løs oppgaven her
        assertEquals(Arrays.asList(3, 6, 9, 12), multipliedByThree);
    }

    // Finn kvadratet til alle tall i en liste
    @Test
    public void testSquareNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        List<Integer> squaredNumbers = null; // løs oppgaven her
        assertEquals(Arrays.asList(1, 4, 9, 16), squaredNumbers);
    }

    // Lag en liste med navnene til ansatte
    @Test
    public void testEmployeeNames() {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 25),
                new Employee("Bob", 35),
                new Employee("Charlie", 28)
        );
        List<String> employeeNames = null; // løs oppgaven her
        assertEquals(Arrays.asList("Alice", "Bob", "Charlie"), employeeNames);
    }

    // Skrive ut hvert element i listen
    @Test
    public void testLoggingExample() {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> result = null; // løs oppgaven her
        assertEquals(names, result);
    }

    // Gi de ansatte lønne ved å kalle på metoden makePayment()
    @Test
    public void testMakePayment() {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 25),
                new Employee("Bob", 35),
                new Employee("Charlie", 28)
        );
        // løs oppgaven her
        // No assertions needed, just verifying that makePayment() is called for each employee
    }
}
