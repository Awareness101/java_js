package handwrittencode;

public class IntegerCommonMethods {
    public static void main(String[] args) {
        //static method ,Transfer parameter string,return int
        int retValue = Integer.parseInt("12349");
        System.out.println(retValue+0.1);
         //draw a dipper with a gourd as model
        double returnValue = Double.parseDouble("3.456");
        System.out.println(returnValue+1); //Accuracy problem
        //----the following contents are for understanding and do not master---
        //static:Convert Decimal to Binary Strings
        String binaryString = Integer.toBinaryString(8);
        System.out.println(binaryString);
        //static:Convert Decimal to Hexadecimal String
        String hexadecimalString = Integer.toHexString(90);
        System.out.println(hexadecimalString);
        //static:Convert decimal to Octal string
        String octalString = Integer.toOctalString(8);
        System.out.println(octalString);


    }


}
