package lesson1;

import static java.lang.Math.max;

import java.util.Scanner;

public class Exercises {
/*
Напишите программу для вывода суммы, умножения, вычитания, деления и остатка двух чисел
Напишите программу для вывода нечетных чисел от 1 до 20
Напишите программу, чтобы поменять местами две переменные
Напишите программу, которая принимает от пользователя три числа и выводит наибольшее из них
Напишите программу для проверки того, является ли число положительным или отрицательным
Напишите программу для замены всех символов 'a' на символы 'b'
Напишите программу для суммирования значений массива
Напишите программу для нахождения второго по величине числа из массива
*/

  public static void first(double a, double b) {
    System.out.println("Сумма двух чисел: " + (a + b));
    System.out.println("Умножение двух чисел: " + (a * b));
    System.out.println("Вычитание двух чисел: " + (a - b));
    System.out.println("Деление двух чисел: " + (a / b));
    System.out.println("Остаток от деления двух чисел: " + (a % b));
  }


  public static void second(int a, int b) {

    for (int i = a; i < b; i++) {
      if (i % 2 != 0) {
        System.out.println("Нечетное число: " + i);
      }
    }
  }

  public static void third(int a, int b) {
    System.out.println("a = " + a + " b = " + b);
    int c = b;
    b = a;
    a = c;
    System.out.println("a = " + a + " b = " + b);
  }

  public static void fourth() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите первое число: ");
    int a = scanner.nextInt();
    System.out.println("Введите второе число: ");
    int b = scanner.nextInt();
    System.out.println("Введите третье число: ");
    int c = scanner.nextInt();

    System.out.println("Максимальное число: " + max(max(a, b), c));
  }

  public static void fifth(int a) {
    if (a < 0) {
      System.out.println("Число " + a + " отрицательное");
    } else {
      System.out.println("Число " + a + " положительное");
    }
  }

  public static void sixth(String value) {
    String replacedValue = value.replace("a", "b");
    System.out.println(replacedValue);
  }

  public static void seventh(int[] arr) {
    int sum = 0;
    for (int i : arr) {
      sum += i;
    }
    System.out.println(sum);
  }

  public static void eighth(int[] arr) {
    int max1 = 0;
    int max2 = 0;

    for (int num : arr) {
      if (num > max1) {
        max2 = max1;
        max1 = num;
      } else if (num > max2) {
        max2 = num;
      }
    }
    System.out.println(max2);
  }


  public static void main(String[] args) {
    first(14, 3);
    System.out.println(" ");

    second(1, 20);
    System.out.println(" ");

    third(4, 7);
    System.out.println(" ");

    // fourth();
    // System.out.println(" ");

    fifth(-9);
    System.out.println(" ");

    sixth("Madagaskar");
    System.out.println(" ");

    seventh(new int[]{4, 8, 7, 6});
    System.out.println(" ");

    eighth(new int[]{4, 8, 7, 6, 9, 1, 15});
    System.out.println(" ");
  }
}
