// We say that a pair of cars (P, Q), where 0 ≤ P < Q < N.
// 0 represents a car traveling east,
// 1 represents a car traveling west.
class PassingCars {
    public static int passingCars(int[] arr){
        int pairs = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                for(int j = i + 1; j < arr.length; j++){
                    if(arr[j] == 1){
                        pairs++;
                    }
                }
            }
        }

        return pairs;
    }


    public static void main(String[] args) {

        int arr[] = {0, 1, 0, 1,1};
        int arr2[] = {0,1,1,0,1,1,1,0,0,0,1,1,0,1};

        System.out.println("passing cars: " + passingCars(arr2));
       
    }
}