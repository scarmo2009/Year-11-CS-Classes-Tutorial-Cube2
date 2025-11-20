public class Cube2 {
    private Cube basicCube;
    private String color;

    public Cube2() {
        basicCube = new Cube();
        this.color = "black";
    }

    public Cube2(int side) {
        this();
        basicCube.setSide(side);
    }

    public Cube2(int side, String color) {
        this(side);
        this.color = color;
    }

    public int getSide() {
        return basicCube.getSide();
    }

    public void setSide(int side) {
        basicCube.setSide(side);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int calculateSurfaceArea() {
        return basicCube.calculateSurfaceArea();
    }

    public int calculateVolume() {
        return basicCube.calculateVolume();
    }

    public Cube2 add(Cube2 otherCube) {
        int a = this.getSide();
        int b = otherCube.getSide();
        int sumOfSquares = a * a + b * b;
        int c = (int) Math.sqrt(sumOfSquares);

        if (c * c != sumOfSquares) {
            throw new IllegalArgumentException("Side lengths do not form a Pythagorean triple");
        }

        return new Cube2(c, this.color);
    }

    public Cube2 minus(Cube2 otherCube) {
        int c = this.getSide();
        int a = otherCube.getSide();
        int differenceOfSquares = c * c - a * a;

        if (differenceOfSquares <= 0) {
            throw new IllegalArgumentException("Resulting side length would be less than 1");
        }

        int b = (int) Math.sqrt(differenceOfSquares);


        if (b * b != differenceOfSquares) {
            throw new IllegalArgumentException("Side lengths do not form a Pythagorean triple");
        }

        return new Cube2(b, this.color);
    }

    public boolean equals(Cube2 otherCube) {
        if (otherCube == null) {
            return false;
        }
        return this.getSide() == otherCube.getSide() &&
                this.color.equals(otherCube.color);
    }

    public String toString() {
        return "Cube{side=" + basicCube.getSide() + ", color=\"" + color + "\"}";
    }
}