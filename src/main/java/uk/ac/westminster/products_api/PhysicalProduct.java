package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product implements Discountable{

    private String dimensions;
    private double weightKg;
    private double discountedPrice;

    @Override
    public void applyDiscount(double rate) {
        double capped = Math.min(rate, 0.20);
        this.discountedPrice = getPrice() * (1 - capped);
    }

    @Override
    public double getDiscountedPrice(){
        return discountedPrice;
    }


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

    @Override
    public String getSummary(){
        return "Physical: " + getName() + " | Weight:" + weightKg + "kg";
    }
}
