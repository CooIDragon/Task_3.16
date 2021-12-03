package ru.vsu.cs.baturin_v_a;

import ru.vsu.cs.baturin_v_a.figures.*;

public class Tests {

    Picture picture = new Picture(new VerticalParabola(-4, 2, 1),
            new Circle(5, 3, 2), new HorizontalParabola(0, 6, 0.25),
            new HorizontalParabola(5, 2, 0.125));

    public boolean testProgram() {

        if (picture.getColor(-4, 4) != SimpleColor.YELLOW) {
            System.out.println("Test 1 is not completed");
            return false;
        } else if (picture.getColor(5.4, 1.3) != SimpleColor.YELLOW) {
            System.out.println("Test 2 is not completed");
            return false;
        } else if (picture.getColor(4, 2) != SimpleColor.ORANGE) {
            System.out.println("Test 3 is not completed");
            return false;
        } else if (picture.getColor(4, 8) != SimpleColor.BLUE) {
            System.out.println("Test 4 is not completed");
            return false;
        } else if (picture.getColor(9, 4) != SimpleColor.ORANGE) {
            System.out.println("Test 5 is not completed");
            return false;
        } else if (picture.getColor(6, 3) != SimpleColor.GREEN) {
            System.out.println("Test 6 is not completed");
            return false;
        } else {
            return true;
        }
    }
}
