public class Cube {
    private int side;

    public Cube() {
        this.side = 1;
    }

    public Cube(int side) {
        setSide(side);
    }


    public void setSide(int side) {
        validateSide(side);
        this.side = side;
    }


    private void validateSide(int side) {
        if (side < 1) {
            throw new IllegalArgumentException("A cube’s side length must be equal to or greater than 1!");
        }
    }


    public int getSide() {
        return side;
    }


    public int calculateSurfaceArea() {
        return 6 * side * side;
    }


    public int calculateVolume() {
        return side * side * side;
    }

    public String toString() {
        return "Cube{side=" + side + "}";
    }
}