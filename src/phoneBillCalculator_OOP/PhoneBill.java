package phoneBillCalculator_OOP;

/*
* phone bill should have an ID, a base class, a number of allotted minutes and a number of minutes used.
* And then, it should also be able to calculate the overage, calculate the tax, and calculate the total.

And then, it should also be able to print an itemized bill.

You should also include three constructors

a default one;
one that accepts the ID only;
one that accepts all fields;
Now no matter which of these constructors you use, all fields should be set eventually.

Then you can also create a different class that instantiates the PhoneBill and prints out an itemized bill.
*
* */


public class PhoneBill {
        private int id;
        private double baseCost;
        private int allottedMinutes;
        private int minutesUsed;

    public PhoneBill(int id, double baseCost, int allottedMinutes, int minutesUsed){
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.minutesUsed = minutesUsed;
    }

    public double calculateOverage(){
        if(minutesUsed <= allottedMinutes){
            return 0;
        }
        double overageMinutes = minutesUsed - allottedMinutes;
        return overageMinutes * 0.25;
    }

    public double calculateTax(){
        return (baseCost + calculateOverage())*0.15;
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
