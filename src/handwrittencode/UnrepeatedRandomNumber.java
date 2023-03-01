package handwrittencode;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class UnrepeatedRandomNumber {

    /*
    public static void main(String[] args) {

        Random random = new Random();
        //int i1 = random.nextInt();
        //Create an array of 5 lengths
       int[] array = new int[5];
       int index = 0;
       //生成一个随机数，首先判断数组是否包含该元素，如果不包含，添加该元素；如果包含，从新生成一个随机数，直到添加一个不包含的随机数为止
       while (index<5){
           int i = random.nextInt(5);
           if (contains(array,i)){
               while (true){
                   int a = random.nextInt(6);
                   if (!contains(array, a)){
                       array[index]=a;
                       break;
                   }
               }

           }else {
               array[index]=i;
           }
           index++;
       }
       for (int i =0; i < array.length; i ++){
          System.out.println(array[i]);
       }


    }

     */
    //Write a separate method to determine whether an array contains an element
    public static boolean contains(int[] arr, int element) {
        /* sort exits bug

        //array in ascending order
        Arrays.sort(arr);
        //Find using dichotomy
        int ret=Arrays.binarySearch(arr,element);
        //if greater than 0, found
        return ret>=0;

         */

        //iterate through the array

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return true;
            }
        }
        return false;


    }

    /*
    a better way to write it than above
     */
    public static void main(String[] args) {
        Random random = new Random();
        //Generate a random number between 0 and 5,cannot generate 6
        
        //create an array of 5 lengths
        int[] array = new int[5];
        int index=0;
        while (index<5){
            //generate a random number between 0 and 5, cannot generate 6
            int i= random.nextInt(6);
            if (!contains(array,i)){
               array[index++] = i;
            }
        }
        for (int i = 0;i<array.length;i++){
            System.out.println(array[i]);
        }
        

    }


}




