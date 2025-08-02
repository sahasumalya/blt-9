package packag1;

public class Square extends Shape{
    public float sideLength;

    public Square(float sideLength, double pricePerSqUnit) {
        super("Square", pricePerSqUnit);
        this.sideLength = sideLength;
        super.area = calculateArea();
    }
    @Override
    public float calculateArea() {
        return sideLength*sideLength;
    }

    public float calculateDiagonal(){
        return sideLength*sideLength;
    }
    @Override
    public double getPrice() {
        return pricePerSqUnit*area*2;
    }
}
