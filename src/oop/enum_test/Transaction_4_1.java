package oop.enum_test;

/**
 * Created by varduhis on 3/15/2017.
 */
public class Transaction_4_1 {
    private int id;
    private int amount;
    private long ccNumber;
    private BrandEnum_4 brand;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public long getCcNumber() {
        return ccNumber;
    }

    public void setCcNumber(long ccNumber) {
        this.ccNumber = ccNumber;
    }

    public BrandEnum_4 getBrand() {
        return brand;
    }

    public void setBrand(BrandEnum_4 brand) {
        this.brand = brand;
    }


    @Override
    public String toString() {
        return "Transaction_4_1{" +
                "id=" + id +
                ", amount=" + amount +
                ", ccNumber=" + ccNumber +
                ", brand=" + brand +
                '}';
    }
}
