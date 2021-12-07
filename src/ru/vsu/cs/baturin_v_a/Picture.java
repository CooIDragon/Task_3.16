package ru.vsu.cs.baturin_v_a;

import ru.vsu.cs.baturin_v_a.figures.*;

public class Picture {

    private final VerticalParabola verticalParabola;
    private final Circle circle;
    private final HorizontalParabola firstHorizontalParabola;
    private final HorizontalParabola secondHorizontalParabola;

    public Picture(VerticalParabola verticalParabola, Circle circle, HorizontalParabola firstHorizontalParabola,
                   HorizontalParabola secondHorizontalParabola) {
        this.verticalParabola = verticalParabola;
        this.circle = circle;
        this.firstHorizontalParabola = firstHorizontalParabola;
        this.secondHorizontalParabola = secondHorizontalParabola;
    }

    public SimpleColor getColor(double x, double y) {
        if (this.firstHorizontalParabola.isPointRightOfParabola(x, y) && !this.circle.isPointInCircle(x, y)
                && !this.secondHorizontalParabola.isPointRightOfParabola(x, y)) {
            return SimpleColor.BLUE;
        } else if (this.firstHorizontalParabola.isPointRightOfParabola(x, y) && !this.circle.isPointInCircle(x, y)
                && this.secondHorizontalParabola.isPointRightOfParabola(x, y)) {
            return SimpleColor.ORANGE;
        } else if (this.firstHorizontalParabola.isPointRightOfParabola(x, y) && this.circle.isPointInCircle(x, y)
                && this.secondHorizontalParabola.isPointRightOfParabola(x, y)) {
            return SimpleColor.GREEN;
        } else if (!this.firstHorizontalParabola.isPointRightOfParabola(x, y) && this.circle.isPointInCircle(x, y)
                && this.secondHorizontalParabola.isPointRightOfParabola(x, y)) {
            return SimpleColor.YELLOW;
        } else if (this.circle.isPointInCircle(x, y) && !this.secondHorizontalParabola.isPointRightOfParabola(x, y)) {
            return SimpleColor.ORANGE;
        } else if (this.verticalParabola.isPointUpOfParabola(x, y)) {
            return SimpleColor.YELLOW;
        } else {
            return SimpleColor.WHITE;
        }
    }
}
