package ru.vsu.cs.baturin_v_a;

import ru.vsu.cs.baturin_v_a.figures.*;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.ROOT);

        Tests tests = new Tests();
        Picture picture = new Picture(new VerticalParabola(-4, 2, 1),
                new Circle(5, 3, 2), new HorizontalParabola(0, 6, 0.25),
                new HorizontalParabola(5, 2, 0.125));

        if (tests.testProgram()) {
            double x = readCoordinate("Input X = ");
            double y = readCoordinate("Input Y = ");

            if (isVarInRange(x) && isVarInRange(y)) {
                SimpleColor color = picture.getColor(x, y);
                printColorForPoint(x, y, color);
            } else {
                System.out.println("Error, -10 < x, y < 10");
            }
        }
    }

    private static void printColorForPoint(double x, double y, SimpleColor color) {
        System.out.printf("(%.2f, %.2f) -> " + color.toString() + '\n', x, y);
    }

    private static double readCoordinate(String text) {
        System.out.print(text);
        Scanner sc = new Scanner(System.in);

        return sc.nextDouble();
    }

    private static boolean isVarInRange(double k) {
        return k >= -10 && k <= 10;
    }
}
