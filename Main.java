package com.company;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = Calculator.instance.get();

        // Код выдавал эксепшн, т.к. на ноль делить нельзя. Поэтому обернул в try-catch.
        int a = calculator.plus.apply(1, 2);
        int b = calculator.minus.apply(1, 1);

        try {
            int c = calculator.divide.apply(a, b);
            calculator.print.accept(c);
        } catch (ArithmeticException e) {
            System.out.println("Призрак Пифагора говорит, что на ноль делить нельзя");
        }

    }
}
