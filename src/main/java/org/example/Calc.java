package org.example;

public class Calc {
    public int summ(int a, int b) {
        int result;
        result = a + b;

        System.out.printf("Сумма %d и %d равна %d", a, b, result);
        return result;
    }
    public int diff(int z, int x) {
        int result;
        result = z - x;

        System.out.println();
        System.out.println("Разность " + z + " и " + x + " равна " + result);
        return result;
    }
}