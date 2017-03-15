package oop.enum_test;

/**
 * Created by varduhis on 3/15/2017.
 */
public class TransactionReport_4_2 {
    private int reportId;
    private String personName;
    private int amount;
    private String bank;
    private String brandName;

    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public String toString() {
        return "TransactionReport_4_2{" +
                "reportId=" + reportId +
                ", personName='" + personName + '\'' +
                ", amount=" + amount +
                ", bank='" + bank + '\'' +
                ", brandName='" + brandName + '\'' +
                '}';
    }



}
