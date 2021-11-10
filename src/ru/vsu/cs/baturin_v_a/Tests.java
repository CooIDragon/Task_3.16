package ru.vsu.cs.baturin_v_a;

public class Tests {

    private static final Picture picture = new Picture();

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
