package handwrittencode;

public class EnumerationTest {

    public static void main(String[] args) {
        Enum  result = divide(10, 0);
        System.out.println(result);
    }
    //采用枚举的方式
    public static Enumeration divide(int a , int b){
        try {

           int c =  a / b;

           return Enumeration.SUCCESS;

        }catch (Exception e){
            return Enumeration.FAIL;


        }

    }
}
