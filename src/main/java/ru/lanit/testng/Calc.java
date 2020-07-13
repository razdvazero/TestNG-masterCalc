package ru.lanit.testng;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calc {

    public static void main(String[] args) throws IOException {

            Math math = new Math();
            BufferedReader enter = new BufferedReader(new InputStreamReader(System.in)) ;
            System.out.println("Введи выражение c пробелом до и после разделителя");

                String EnteredData = enter.readLine();
                String[] Massive = EnteredData.split("\\s");
                double first, second;

                try {
                    first = Double.parseDouble(Massive[0]);
                    second = Double.parseDouble(Massive[2]);
                    if (Massive[1].equals("+"))
                        System.out.println(math.sumTest(first, second));
                    else if (Massive[1].equals("-"))
                        System.out.println(math.subTest(first, second));
                    else if (Massive[1].equals("*"))
                        System.out.println(math.multTest(first, second));
                    else if (Massive[1].equals("/"))
                        System.out.println(math.divTest(first, second));
                } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                    System.out.println("Ошибка при вводе, скорее всего ввод строки или без пробелов");
                }
    }
}

