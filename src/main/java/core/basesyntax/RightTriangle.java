package core.basesyntax;

public class RightTriangle extends Figure {
    private int side;

    public RightTriangle(int side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public int getArea() {
        return (int) ((side * side) * Math.sqrt(3)) / 4;
    }

    @Override
    public String toString() {
        return "Figure: rightTriangle, "
                + "area: "
                + getArea()
                + " sq. units, "
                + "side: "
                + side
                + " units, "
                + "color: "
                + getColor();
    }
}
