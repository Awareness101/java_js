package javaS;

public class WuMingFen {

        String theMa = "酸辣";
        int quantity = 2;
        boolean likeSoup = true;
        public WuMingFen(String theMa, int quantity, boolean likeSoup) {
            this.theMa = theMa;
            this.quantity = quantity;
            this.likeSoup = likeSoup;
            check();
        }
        public WuMingFen(String theMa, int quantity){
            this.theMa = theMa;
            this.quantity = quantity;
            this.likeSoup = false;
            this.check();

        }
        public WuMingFen(){
            this.check();

        }
        public void check(){
            System.out.println("面码："+theMa+","+"粉的份量："+quantity+"两,"+"是否带汤："+likeSoup);
        }


}
