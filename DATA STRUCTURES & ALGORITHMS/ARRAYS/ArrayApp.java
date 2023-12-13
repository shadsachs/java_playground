class ArrayApp{
   public static void main(String[] args) {
      long[] array = new long[100]; // make and initialise array 

      int nElements = 0; // number of items 

      int j; // loop counter 

      long searchKey; // key of item to search for

      // insert 10 items into array. 
      array[0] = 77; 
      array[1] = 99;
      array[2] = 44;
      array[3] = 55;
      array[4] = 22;
      array[5] = 88;
      array[6] = 11;
      array[7] = 23;
      array[8] = 66;
      array[9] = 33;
      nElements = 10;

      // display items
      for(j = 0; j <nElements; j++) {
         System.out.print(array[j] + " ");
         System.out.println(" ");
      }

      searchKey = 66;

      // find item with key 66
      for(j = 0; j < nElements; j++){
         if(array[j] == searchKey){
            System.out.println("Found " + searchKey);
            break;
         }
         if(j == nElements){ 
            System.out.println("Can't find " + searchKey);
         }
      }

      System.out.println("length before deletion is: " + array.length);

      // delete item with key 88
      searchKey = 88;
      for(j = 0; j < nElements; j++){
         if(array[j] == searchKey){
            break;
         }
      }
      for(int k = j; k < nElements - 1; k++){
         array[k] = array[k +1];
         nElements--;
      }
      for(j = 0; j < nElements; j++){
         System.out.println(array[j] + " ");
      }
      System.out.println("length after deletion is: " + array.length);

   }
}