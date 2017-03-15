package oop.enum_test;

/**
 * Created by varduhis on 3/15/2017.
 */
public class Transaction {
    private int id;
    private int amount;
    private long ccNumber;
    private BrandEnum brand;



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

    public BrandEnum getBrand() {
        return brand;
    }

    public void setBrand(BrandEnum brand) {
        this.brand = brand;
    }


    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", amount=" + amount +
                ", ccNumber=" + ccNumber +
                ", brand=" + brand +
                '}';
    }
}
