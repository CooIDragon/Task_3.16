package ru.vsu.cs.baturin_v_a;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.ROOT);

        if (tests.testProgram()) {
            double x = readVar("Input X = ");
            double y = readVar("Input Y = ");

            if (isVarInRange(x) && isVarInRange(y)) {
                printColorForPoint(x, y);
            } else {
                System.out.println("Error, -10 < x, y < 10");
            }
        }
    }

    private static final Picture picture = new Picture();
    private static final Tests tests = new Tests();

    public static void printColorForPoint(double x, double y) {
        System.out.printf("(%.2f, %.2f) -> %s%n", x, y, picture.getColor(x, y));
    }

    private static double readVar(String text) {
        System.out.print(text);
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    private static boolean isVarInRange(double k) {
        return k >= -10 && k <= 10;
    }
}
