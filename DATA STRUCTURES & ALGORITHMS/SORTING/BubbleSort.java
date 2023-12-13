package SORTING;

// program demonstrating bubble sort algo. 
class BubbleSort{

    private long[] a; 
    private int nElements;

    // constructor method.
    public BubbleSort(int max){
        a = new long[max]; 
        nElements = 0;
    }

    public void insert(long value){
        a[nElements] = value;
        nElements++;
    }

    public void display(){
        for(long number : a){
            System.out.print(number + " ");
        }
        System.out.println(" ");
    }

    public void bubbleSort(){
        int out;
        int in;
        int outter2;
        

        for(out = nElements - 1; out > 1; out--){ // first outer loop goes backwards.
        
            for(in = 0; in < out; in++){ // inner loop goes forward.

                if(a[in] > a[in + 1]){
                    long temp = a[in];
                    a[in] = a[in + 1];
                    a[in + 1] = temp;
                }

            }

            for(outter2 = in; outter2 > 0; outter2--){
                
                if(a[outter2] < a[outter2 - 1]){
                    long temp = a[outter2];
                    a[outter2] = a[outter2 - 1];
                    a[outter2 - 1] = temp;
                }
            }
        }
    }

    public void oddEvenSort(){
        boolean swaps = true;
        int numOfSwaps = 0;

        while(swaps == true){

            for(int i = 1; i < nElements - 1; i++){
                if(a[i] > a[i + 1]){
                    long temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    numOfSwaps++;
                }
            }

            for(int i = 0; i < nElements - 1; i++){
                if(a[i] > a[i + 1]){
                    long temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    numOfSwaps++;
                }
            }
            if(numOfSwaps == 0){ swaps = false;}
            numOfSwaps = 0;
        }
        
    }
}

class BubbleSortApp{

    public static void main (String[] args){

        int maxSize = 3000;
        BubbleSort arr = new BubbleSort(maxSize);
        long n = maxSize;

        for(int j = 0; j < maxSize; j++){
            
            arr.insert(--n);
        }

        System.out.println("\n\nPrint first mapping BEFORE bubble sort:");

        arr.display();

        arr.oddEvenSort();

        System.out.println("\nPrint first mapping AFTER oddEven sort:");
        arr.display();

    }
}