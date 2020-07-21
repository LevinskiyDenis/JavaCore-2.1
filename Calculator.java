package com.company;

import java.util.function.*;

public class Calculator {

    // Объявляем переменную типа Supplier (встроенный функциональный интерфейс), которая вызывает конструктор у калькулятора
    // Почему эта переменная статик?
    // Чтобы создать калькулятор, мы должны сначала создать объект инстанс и туда присвоить конструктор калькулятора.
    // Но мы не можем это сделать, т.к. Supplier абстрактный (нельзя создавать объекты этого класса). Поэтому инстанс статичен,
    // т.е. вызывается у класса, а не объекта этого класса.
    // Остальные лямбды не статичны, т.к. не нужно создание эксземпляров класса, они просто выпоняют свои функции через объекты класса калькулятор

    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> divide = (x, y) -> x / y;

    UnaryOperator<Integer> square = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    // Потому что интерфейс Консьюмер всегда реализует только метод акксепт(с). В мейне у переменной/лямбды принт
    // вызывается метод аккспет(с), который равен sout.
    Consumer<Integer> print = System.out::println;

}
