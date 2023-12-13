public class HighArray {
    private long[] a; 
    private int nElements;

    public HighArray(int max) {
        a = new long[max];
        nElements = 0; 
    }

    public boolean find(long searchKey){
        int j; 
        for(j = 0; j < nElements; j++){
            if(a[j] == searchKey){
                break;
            }
        }
        if(j == nElements){
            return false;
        } else{ return true;}

    }

    public void insert(long value){
        a[nElements] = value;
        nElements++;
    }

    public boolean delete(long value){
        int j;
        for(j = 0; j < nElements; j++){
            if(value == a[j]){
                break;
            }
        }
        if( j == nElements){ return false;}
        else{
            for(int k = j; k < nElements; k++){
                a[k] = a[k+1];
            }
            nElements--;
            return true;
        }
    }

    public void display(){
        for(int j= 0; j < nElements; j++){
            System.out.print(a[j] + " ");
        }
        System.out.println(" ");
    }

    public long getMax(){
        int j = 0; 
        int nElements = a.length;
        long highestKey = 0;

        if(nElements > 0){

            for(j = 0; j < nElements;j++){
                if(a[j] > highestKey){
                    highestKey = a[j];
                }
            }
            return highestKey;
        } 
        else { 
            return -1; 
        }
    }

    public boolean removeMax(){
        long highestKey = getMax();

        if(delete(highestKey) == true){
             display();
             return true;
        } else { return false;}
        
    }

    public void noDups(){
        int j = 0;
        int arrayLength = a.length;
        long[] tempArray = new long[arrayLength];
        int elementFound = 0; // check digit for if value is found elsewhere in the array. 
        int nextIndex = 0; // track the next index to input for array.

        for(int i = 0; i < arrayLength; i++){
            tempArray[i] = -1;
        }

        for(j = 0; j < arrayLength; j++){
            
            for(int k = j + 1 ; k < tempArray.length; k++){
                if(a[j] == a[k]){
                    elementFound++;
                }
            }

            if(elementFound == 0){ 
                tempArray[nextIndex++] = a[j]; 
            }
            elementFound = 0; 
        }

        a = tempArray;
    }



}

class HighArrayApp{
    public static void main(String[] args){
        int maxSize = 30; 
        HighArray arr = new HighArray(maxSize);
        

        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        arr.display();

        int searchKey = 35;

        if(arr.find(searchKey)){ System.out.println("Found " + searchKey); }
        else{ System.out.println("Can't find " + searchKey); }

        arr.delete(00);
        arr.delete(55);
        arr.delete(99);

        arr.display();

        System.out.println("\n\ngetMax() results below: "); 
        arr.getMax();
        System.out.println("\n\nremoveMax() results below: ");
        arr.removeMax();
        System.out.println("\nremoveMax() again results below: ");
        arr.removeMax();

        long[] inverselySortedArray = new long[maxSize];
           
        for(int i = 0; i < maxSize; i++){
            inverselySortedArray[i] =  arr.getMax();
            arr.removeMax();
        }

        System.out.print("\nInversely sorted array: ");
        for(long number : inverselySortedArray){ if(number != 0){System.out.print(number + ", ");} else {continue; } };

        arr.insert(66);
        arr.insert(33);
        arr.insert(66);
        arr.insert(33);
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);

        arr.display();
        System.out.println("\n\nNo dups results");
        arr.display();
        arr.noDups();
        arr.display();


    }
}
