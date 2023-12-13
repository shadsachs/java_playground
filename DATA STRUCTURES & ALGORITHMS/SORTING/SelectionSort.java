package SORTING;

public class SelectionSort {

    private long[] a;
    private int nElements;

    public SelectionSort(int maxSize){

        a = new long[maxSize];
        nElements = 0; 
    }

    public void insert(long value){

        a[nElements] = value;
        nElements++;
    }

    public void display(){

        for(long number: a){
            System.out.print(number + " ");
        }
        System.out.println(" \n");
    }

    public void selectionSort(){
        int out;
        int in;
        int min;

        for(out = 0; out < nElements - 1; out++){ // outter loop starts with the leftmost element.
            min = out; // initialise minimum to be the leftmost index.

            for(in = out + 1; in < nElements; in++){ // inner loop starts comparison from the immediately adjacent element.
                if(a[in] < a[min]){ // if current index value is less than current min, change value of min.
                    min = in;
                }
            }

            long temp = a[out];
            a[out] = a[min];
            a[min] = temp;
        }
    }
}

class SelectionSortApp{

    public static void main(String[] args){
        int maxSize = 30;
        SelectionSort arr = new SelectionSort(maxSize);

        for(int j = 0; j < maxSize; j++){
            long n = (long)(java.lang.Math.random() * (maxSize - 1));
            arr.insert(n);
        }

        // System.out.println("Display Array BEFORE running selection sort method \n\n");
        // arr.display();


        arr.selectionSort();
        
        System.out.println("Display Array AFTER running selection sort method \n\n");
        arr.display();
    }

}
