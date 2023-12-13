// ordered array example using binary search to find element value

class OrderedArray {
    private long[] a; // reference to array a
    private int nElements; // number of data elements in array

    public OrderedArray(int max){
        a = new long[max]; // new array object
        nElements = 0; 
    }

    public int size(){
        return nElements;
    }

    public int find(long searchKey){
        int lowerBound = 0; 
        int upperBound = nElements - 1;
        int currentIndex;

        while(true){
            currentIndex = lowerBound + (upperBound - lowerBound) / 2; // sets the current index to the middle of the range. 
            
            if(a[currentIndex] == searchKey){
                return currentIndex;
            }
            else{
                if(lowerBound > upperBound){
                    return currentIndex;
                }
                else {
                    if(a[currentIndex] < searchKey){
                        lowerBound = currentIndex + 1;
                    }
                    else{ 
                        upperBound = currentIndex - 1; 
                    }
                }
            }
        }
    }
    
    // array insert using binary search to find the index for insertion.
    public void insert(long value){
        int upperBound = nElements - 1; 
        int lowerBound = 0;

        while(lowerBound <= upperBound){
            int currentIndex = lowerBound + (upperBound - lowerBound) / 2;

            if(nElements == 0){ currentIndex = 0;}
            else{
                if(a[currentIndex] < value){ // value is greater than current midPoint.
                    lowerBound = currentIndex + 1;    
                }
                else{ 
                    upperBound = currentIndex - 1;
                }
            }
        }  
        for(int k = nElements; k > lowerBound; k--){
            a[k] = a[k -1]; // move every higher value up by 1
        }
        a[lowerBound] = value; // insert value left in the hole by moving every higher number up by 1
        nElements++; // increase size of elements up by 1. 
    }

    // array insert using binary search to find the index for insertion.
    public boolean delete(long value){
        int lowerBound = 0;
        int upperBound = nElements -1;

        while(lowerBound <= upperBound){
            int currentIndex = lowerBound + (upperBound - lowerBound)/2; // middle value. 

            if( a[currentIndex] == value){ break; }
            else{
                if(a[currentIndex] < value){
                    lowerBound = currentIndex + 1;
                }
                else{
                    upperBound = currentIndex - 1;
                }
            }
        }
        if(lowerBound == nElements - 1){ return false; } // cannot find number, return false. 
        else {
            for(int k = lowerBound; k < nElements; k++){
                a[k] = a[k + 1]; // move bigger ones down. 
            }
            nElements--; 
            return true;
        }
    }

    public void display(){
        for(int j = 0; j < nElements; j++){
            System.out.print(a[j] + " ");
        }
        System.out.println(" ");
    }

    public static void merge(long[] arrayA, long[] arrayB, long[] mergedArray){
        int lengthA = arrayA.length;
        int lengthB = arrayB.length;
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < lengthA && j < lengthB){

            if(arrayA[i] < arrayB[j]){
                mergedArray[k++] = arrayA[i++];

            }
            else{
                mergedArray[k++] = arrayB[j++];

            }
        }

        while(i < lengthA){
            mergedArray[k++] = arrayA[i++];

        }

        while(j < lengthB){
            mergedArray[k++] = arrayB[j++];

        }

        for(long number: mergedArray){ System.out.print(" " + number); }
    }
}

class OrderedArrayApp{

    public static void main(String[] args){
        int maxSize = 100;
        OrderedArray array;

        array = new OrderedArray(maxSize);

        array.display();

        array.insert(77);
        array.insert(99);
        array.insert(44);
        array.insert(55);
        array.insert(22);
        array.insert(88);
        array.insert(11);
        array.insert(00);
        array.insert(66);
        array.insert(33);

        array.display();

        int searchKey = 55;

        if(array.find(searchKey) != array.size()){ System.out.println("Found " + searchKey); }
        else{ System.out.println("Can't find " + searchKey); }

        array.display();

        array.delete(00);
        array.delete(55);
        array.delete(99); 
        

        array.display();

        array.insert(67);
        array.display();
        array.insert(65);
        array.display();
        array.insert(75);
        array.display();
        array.delete(88);
        array.display();
        array.delete(67);
        array.display();

        long[] sourceArrayA = new long[10];
        long[] sourceArrayB = new long[20];
        long[] mergedArray = new long[40];

        for(int j = 0; j < sourceArrayA.length; j++){
            sourceArrayA[j] = j*2; 
        }
        for(int j= 0; j < sourceArrayB.length; j++){
            sourceArrayB[j] = j*3;
        }

        System.out.println("\n\n results of sourceA array");
        for(long number: sourceArrayA){ System.out.print(" " + number);}

        System.out.println(" ");

        System.out.println("\n\n results of sourceA array");
        for(long number: sourceArrayB){ System.out.print(" " + number);}


        System.out.println("\n\n results of merged array");
        OrderedArray.merge(sourceArrayA,sourceArrayB,mergedArray);
    }

}
