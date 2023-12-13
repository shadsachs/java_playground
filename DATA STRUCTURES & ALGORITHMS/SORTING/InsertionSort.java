package SORTING;

public class InsertionSort {

    private long [] a; 
    private int nElements;

    public InsertionSort(int max){
        a = new long[max];
        nElements = 0;
    }

    public void insert(long value){
        a[nElements] = value;
        nElements++;
    }

    public void display(){
        System.out.println("\n");

        for(long number: a){

            System.out.print(number+ ", ");
        }

        System.out.println("\n\n\n");
    }

    public void insertionSort(){
        int in;
        int out;

        for(out = 1; out < nElements; out++){
            long temp = a[out];
            in = out;

            while(in > 0 && a[in -1] >= temp){
                    a[in] = a[in -1];
                    --in;

            }
            a[in] = temp;
        }
    } 
    
    public long median(){
        int in;
        int out;
        
        for(out = 1; out < nElements; out++){
            long temp = a[out];
            in = out;
            while(in > 0 && a[in - 1] >= temp){
                a[in] = a[in - 1];
                --in;
            }
            a[in] = temp;
        }

        int midPoint = 0 +(nElements - 1)/2;
        return a[midPoint];
    }

    public void noDups(){
        long current;
        long[] tempArray = new long [nElements];
        int index = 0;
        tempArray[index] = a[0];
        index++;

        for(int i = 1; i < nElements; i++){
            current = a[i - 1];
            if(a[i] != current){
                tempArray[index++] = a[i];
            }
        }

        a = tempArray;
    }
}

class InsertionSortApp{

    public static void main(String[] args){
        int maxSize = 100;
        InsertionSort arr = new InsertionSort(maxSize);

        for(int j = 0; j < maxSize; j++){
            long n =  (long) (java.lang.Math.random() * (maxSize - 1));
            arr.insert(n);
        }

        // arr.display();

        arr.insertionSort();

        arr.display();

        System.out.println("\nMedian Value is: " + arr.median());

        System.out.println("\n\n array after no dups\n");
        arr.noDups();
        arr.display();

    }
}