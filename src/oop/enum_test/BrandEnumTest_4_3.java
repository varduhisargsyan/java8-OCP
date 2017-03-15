package oop.enum_test;

/**
 * Created by varduhis on 3/15/2017.
 */
public class BrandEnumTest_4_3 {
    public static void main(String[] args) {

        Transaction_4_1 transaction = new Transaction_4_1();

        transaction.setId(120000111);
        transaction.setAmount(100);
        transaction.setCcNumber(60100010002222L);
        transaction.setBrand(BrandEnum_4.MCRD);

        System.out.println(transaction); //Transaction_4_1{id=120000111, amount=100, ccNumber=60100010002222, brand=MCRD}

        TransactionReport_4_2 report = new TransactionReport_4_2();
        report.setReportId(1);
        report.setPersonName("Varduhi SARGSYAN");
        report.setAmount(transaction.getAmount());
        report.setBank("INECOBANK");
        //Set brand value to report
       BrandEnum_4 brand = transaction.getBrand();
        report.setBrandName(BrandEnum_4.getValue(brand));
        System.out.println(report);



      // BrandEnum_4 constructor is not called as all BrandEnum_4 instances have been initialized at line 14 the first time BrandEnum_4 is used
        // IMPORTANT; Even though ony BranEnum.MCRD instance is used at line 14 the first time BrandEnum_4 is referred all instances are initialized no matter they are used or not
      BrandEnum_4 bran1= BrandEnum_4.BANC;
       BrandEnum_4 brand2= BrandEnum_4.BANC;

    }

}
