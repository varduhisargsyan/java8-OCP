package oop.enum_test;

/**
 * Created by varduhis on 3/15/2017.
 */
public class BrandEnumTest {
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



      // BrandEnum constructor is not called as all BrandEnum instances have been initialized at line 14 the first time BrandEnum is used
        // IMPORTANT; Even though ony BranEnum.MCRD instance is used at line 14 the first time BrandEnum is referred all instances are initialized no matter they are used or not
      BrandEnum bran1=BrandEnum.BANC;
       BrandEnum brand2=BrandEnum.BANC;

    }

}
