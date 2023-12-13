package SORTING;



class Person{
    private String lastName;
    private String firstName;
    private int age;

    public Person(String last, String first, int a){
        lastName = last;
        firstName = first;
        age = a;
    }

    public void displayPerson(){
        System.out.print("  Last name: " + lastName);
        System.out.print(",  First name: " + firstName);
        System.out.println(",  Age: " + age);
    }

    public String getLast(){
        return lastName;
    }
}


class ArrayInOb{
    private Person[] a;
    private int nElements;

    public ArrayInOb(int max){
        a = new Person[max];
        nElements = 0;
    }

    public void insert(String last, String first, int age){
        a[nElements] = new Person(last, first, age);
        nElements++;
    }

    public void displayPerson(){
        for(int i = 0; i < nElements; i++){
            a[i].displayPerson();
            System.out.println(" ");
        }
    }

    public void insertionSort(){
        int in, out;

        for(out = 1; out < nElements; out++){
            Person temp = a[out];
            in = out;

            while(in > 0 && a[in - 1].getLast().compareTo(temp.getLast()) > 0){
                a[in] = a[in - 1];
                --in;
            }
            a[in] = temp;
        }
    }
}

class ObjectSortApp{
    public static void main(String[] args){
        int maxSize = 20;

        ArrayInOb arr = new ArrayInOb(maxSize);
        
        arr.insert("Evans", "Patty", 24);
        arr.insert("Smith", "Yandee", 69);
        arr.insert("Smith", "Doc", 59);
        arr.insert("Smith", "Abs", 39);
        arr.insert("Yee","Tom", 43);
        arr.insert("Adams", "Henry", 63);
        arr.insert("Hashimoto", "Sato", 21);
        arr.insert("Stimson", "Henry", 29);
        arr.insert("Velasquez", "Jose", 72);
        arr.insert("Lamarque", "Henry", 54);
        arr.insert("Vang", "Minh", 22);
        arr.insert("Creswell","Lucinda", 18);

        System.out.println("\n Before sorting: \n");
        arr.displayPerson();

        arr.insertionSort();

        System.out.println("\n\n After sorting: \n");
        arr.displayPerson();

    }
}
