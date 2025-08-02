package packag1;

public abstract class Shape {
    protected String name;
    protected double area;
    protected double pricePerSqUnit;

    public Shape(String name, double pricePerSqUnit) {
        this.name = name;
        this.pricePerSqUnit = pricePerSqUnit;
    }

    public abstract float calculateArea();

    public double getPrice() {
        return pricePerSqUnit*area;
    }


}
