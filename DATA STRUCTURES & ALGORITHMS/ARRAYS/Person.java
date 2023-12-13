public class Person {
    private String lastName;
    private String firstName;
    private int age;

    public Person(String last, String first, int a){
        lastName = last; 
        firstName = first;
        age = a;
    }

    public void displayPerson(){
        System.out.print(" Last name: " + lastName);
        System.out.print(", First name: " + firstName);
        System.out.println(", Age: " + age);
    }

    public String getLastName(){
        return lastName;
    }
}

class ClassDataArray{
    private Person[] array;
    private int nElements;

    public ClassDataArray(int max){
        array = new Person[max];
        nElements = 0;
    }

    public Person find(String searchName){
        int j;
        for(j = 0; j < nElements; j++){
            if(array[j].getLastName().equals(searchName)){
                break;
            }
        }
        if(j == nElements){ return null;}
        else{ return array[j]; }
    }

    public void insert( String last, String first, int age){
        array[nElements] = new Person(last, first, age);
        nElements++;
    }

    public boolean delete(String searchName){
        int j;
        for(j = 0; j < nElements; j++){
            if(array[j].getLastName().equals(searchName)){ 
                break;
            }
        }
        if(j == nElements){ return false; }
        else { 
            for(int k = j; k < nElements; k++){
                array[k] = array[k+1];
            }
            nElements--;
            return true;
        }
    }

    public void displayA(){
        for(int j = 0; j < nElements; j++){ 
            array[j].displayPerson();
        }
    }
}

class ClassDataApp{
    public static void main(String[] args){
        int maxSize = 100;
        ClassDataArray arr = new ClassDataArray(maxSize);

        arr.insert("Evans", "Patty", 24);
        arr.insert("Smith", "Lorraine", 37);
        arr.insert("Yee","Tom", 43);
        arr.insert("Adams", "Henry", 63);
        arr.insert("Hashimoto", "Sato", 21);
        arr.insert("Stimson", "Henry", 29);
        arr.insert("Velasquez", "Jose", 72);
        arr.insert("Lamarque", "Henry", 54);
        arr.insert("Vang", "Minh", 22);
        arr.insert("Creswell","Lucinda", 18);

        arr.displayA();

        String searchKey = "Stimson";
        Person found = arr.find(searchKey);

        if(found != null){
            System.out.print("Found ");
            found.displayPerson();
        }
        else{ System.out.println("Cannot find " + searchKey); }

        System.out.println("Deleting Smith, Yee and Creswell");

        arr.delete("Smith");
        arr.delete("Yee");
        arr.delete("Creswell");

        arr.displayA();
    }
}
