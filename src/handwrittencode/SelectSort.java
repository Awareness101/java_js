package handwrittencode;

public class SelectSort {
    public static void main(String[] args) {
        int [] array = {1,4,65,7,33,445,2};
        sort(array);
        for (int i: array) {
            System.out.println(i);
        }
    }

    public static void sort(int[] array){

        for (int i=0;i<array.length; i++){
//            System.out.println("i--->"+i);
            for (int j=i+1;j<array.length;j++){
                if (array[i]>array[j]){
                    int temp=array[i];
                    array[i] = array[j];
                    array[j] =temp;
                }
               // System.out.println("j-------->"+j);
            }
        }
    }


}
