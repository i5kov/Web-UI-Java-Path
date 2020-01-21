package chapter06_classesandobjects;

public class PhoneBill {

    private String id;
    private double baseCost;
    private double allottedMinutes;
    private double usedMinutes;

    public PhoneBill() {
        id = "0000000";
        baseCost = 80.99;
        allottedMinutes = 500;
        usedMinutes = 300;
    }

    public PhoneBill(String id) {
        setId(id);
        baseCost = 80.99;
        allottedMinutes = 500;
        usedMinutes = 300;
    }

    public PhoneBill(String id, double baseCost, double allottedMinutes, double usedMinutes) {
        setId(id);
        setBaseCost(baseCost);
        setAllottedMinutes(allottedMinutes);
        setUsedMinutes(usedMinutes);
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public void setAllottedMinutes(double allottedMinutes) {
        this.allottedMinutes = allottedMinutes;
    }

    public void setUsedMinutes(double usedMinutes) {
        this.usedMinutes = usedMinutes;
    }

    public double calculateOverage(){
        if(usedMinutes <= allottedMinutes){
            return 0;
        }

        double overageRate = 0.25;
        double overageMinutes = usedMinutes - allottedMinutes;
        return overageMinutes * overageRate;
    }

    public double calculateTax(){
        double taxRate = 0.15;
        return taxRate * (baseCost + calculateOverage());
    }

    public double calculateTotal(){
        return baseCost + calculateOverage() + calculateTax();
    }

    public void printItemizedBill(){
        System.out.println("ID: " + id);
        System.out.println("Base Rate: $" + baseCost);
        System.out.println("Overage Fee: $"
                + String.format("%.2f", calculateOverage()));
        System.out.println("Tax: $"
                + String.format("%.2f", calculateTax()));
        System.out.println("Total: $"
                + String.format("%.2f", calculateTotal()));
    }
}
