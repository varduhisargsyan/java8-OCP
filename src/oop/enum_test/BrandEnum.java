package oop.enum_test;

/**
 * Created by varduhis on 3/15/2017.
 */

public enum BrandEnum {
    // enum instances with constructor call
    BANC("Bancontact"), VPAY("VPAY"), MSTR("Maestro"), VISA("Visa"), MCRD("MasterCard"), DIN("Diners"), UNPA("UnionPay");


    //Enum property
    String valueWs;

    // Enum constructor by default is PRIVATE , all enum instances must be  declared in the same class as enum
    //For each enum instance the constructor is called only once
    BrandEnum(String value) {

        this.valueWs = value;
        System.out.println("Constructing " + valueWs);
    }

    //Method returns the String value of Enum passed to the method
    public static String getValue(Enum forEnum) {
        String retVal = "";
        for (final BrandEnum en : BrandEnum.values()) {
            if (en != null && en.equals(forEnum)) {
                retVal = en.valueWs;
                break;
            }
        }
        return retVal;
    }

    public String getValueWs() {
        return valueWs;
    }


}