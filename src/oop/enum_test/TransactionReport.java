package oop.enum_test;

/**
 * Created by varduhis on 3/15/2017.
 */
public class TransactionReport {
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
        return "TransactionReport{" +
                "reportId=" + reportId +
                ", personName='" + personName + '\'' +
                ", amount=" + amount +
                ", bank='" + bank + '\'' +
                ", brandName='" + brandName + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Transaction transaction = new Transaction();

        transaction.setId(120000111);
        transaction.setAmount(100);
        transaction.setCcNumber(60100010002222L);
        transaction.setBrand(BrandEnum.MCRD);

        System.out.println(transaction); //Transaction{id=120000111, amount=100, ccNumber=60100010002222, brand=MCRD}

        TransactionReport report = new TransactionReport();
        report.setReportId(1);
        report.setPersonName("Varduhi SARGSYAN");
        report.setAmount(transaction.getAmount());
        report.setBank("INECOBANK");
        //Set brand value to report
        BrandEnum brand = transaction.getBrand();
        report.setBrandName(BrandEnum.getValue(brand));
        System.out.println(report);
    }


}
