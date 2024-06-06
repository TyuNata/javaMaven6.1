package ru.netology.javaqa.javamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RelaxServiceTest {
    @ParameterizedTest
    @CsvSource({
            "2, 100000, 60000, 150000",
            "3, 10000, 3000, 20000"
    })
    public void testRelax(int expected, int income, int expenses, int threshold) {
        RelaxService service = new RelaxService();
       int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
