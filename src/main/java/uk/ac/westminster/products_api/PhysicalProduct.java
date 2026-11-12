package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product{

    private String dimensions;
    private double weightKg;


    public PhysicalProduct (){

    }

    public PhysicalProduct(Long id, String name, double price, double weightKg, String dimensions) {
        super(id, name, price);
        this.dimensions = dimensions;
        this.weightKg = weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }

    public double getWeightKg() {
        return weightKg;
    }
}
