package SORTING;

public class XOR {

    public static void main(String[] args){
        int[] arr = {2,3,4,5,6,2,3,4,5};

        int res = arr[0];


        for(int i = 1; i < arr.length; i++ ){
            System.out.println("Res " + i + " : is  " + res);
            res = res ^ arr[i];
        }

        System.out.print("\n\n" + res);
    }
    
}
