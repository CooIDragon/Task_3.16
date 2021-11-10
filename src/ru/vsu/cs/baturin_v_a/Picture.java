package ru.vsu.cs.baturin_v_a;

import ru.vsu.cs.baturin_v_a.figures.*;

public class Picture {

    public final VerticalParabola VP = new VerticalParabola(-4, 2, 1);
    public final Circle C = new Circle(5, 3, 2);
    public final HorizontalParabola HP1 = new HorizontalParabola(0, 6, 0.25);
    public final HorizontalParabola HP2 = new HorizontalParabola(5, 2, 0.125);

    public SimpleColor getColor(double x, double y) {
        if (HP1.isPointRightOfParabola(x, y) && !C.isPointInCircle(x, y) && !HP2.isPointRightOfParabola(x, y)) {
            return SimpleColor.BLUE;
        } else if (HP1.isPointRightOfParabola(x, y) && !C.isPointInCircle(x, y) && HP2.isPointRightOfParabola(x, y)) {
            return SimpleColor.ORANGE;
        } else if (HP1.isPointRightOfParabola(x, y) && C.isPointInCircle(x, y) && HP2.isPointRightOfParabola(x, y)) {
            return SimpleColor.GREEN;
        } else if (!HP1.isPointRightOfParabola(x, y) && C.isPointInCircle(x, y) && HP2.isPointRightOfParabola(x, y)) {
            return SimpleColor.YELLOW;
        } else if (C.isPointInCircle(x, y) && !HP2.isPointRightOfParabola(x, y)) {
            return SimpleColor.ORANGE;
        } else if (VP.isPointUpOfParabola(x, y)) {
            return SimpleColor.YELLOW;
        } else {
            return SimpleColor.WHITE;
        }
    }
}
