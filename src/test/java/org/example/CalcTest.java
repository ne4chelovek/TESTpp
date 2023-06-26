package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @BeforeAll
    public static void setup() {
        System.out.println("before all");
    }

    @BeforeEach
    public void setUpEach() {
        System.out.println("before each");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("after all");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("\nafter each");
    }

    @Test
    @DisplayName("Проверка суммирования 1")
    @Timeout(10)
    @Tag("SUMM")
    void summ1() {
        Calc calc = new Calc();
        int result = calc.summ(1, 6);
        assertEquals(7, result,"Не тот ответ");
    }

    @RepeatedTest(10)
    @DisplayName("Проверка суммирования 2")
    @Timeout(10)
    @Tag("SUMM")
    void summ2() {
        Calc calc = new Calc();
        int result = calc.summ(1, 6);
        assertEquals(7, result,"Не тот ответ");
    }

    @ParameterizedTest(name = "#{index} - сложение {0} и {1}, ожидаем {2}")
    @CsvSource({"1,2,3", "-1, 2, 1", "0,0,0"})
    @DisplayName("Проверка суммирования 3")
    @Tag("SUMM")
    void summ3(int a, int b, int expectedResult) {
        Calc calc = new Calc();
        int result = calc.summ(a, b);
        assertEquals(expectedResult, result,"Не тот ответ");

    }

    @Test
    @DisplayName("Проверка вычетания 1")
    @Timeout(10)
    @Tag("DIFF")
    void diff1() {
        Calc calc = new Calc();
        int result = calc.diff(10, 6);
       assertEquals(4, result, "Не тот ответ");
    }

    @RepeatedTest(10)
    @DisplayName("Проверка вычетания 2")
    @Timeout(10)
    @Tag("DIFF")
    void diff2() {
        Calc calc = new Calc();
        int result = calc.diff(3, 3);
        assertEquals(0, result, "Не тот ответ");
    }
}