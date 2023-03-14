package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class VacationCalculatorTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/vacationdata.csv")
    public void testBought(int income, int expenses, int threshold, int expected) {
        VacationCalculator service = new VacationCalculator();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void lowExpenses() {
//        VacationCalculator service = new VacationCalculator();
//
//        int expected = 3;
//        int actual = service.calculate(10_000, 3_000, 20_000);
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void highExpenses() {
//        VacationCalculator service = new VacationCalculator();
//
//        int expected = 2;
//        int actual = service.calculate(100_000, 60_000, 150_000);
//
//        Assertions.assertEquals(expected, actual);
//    }
}