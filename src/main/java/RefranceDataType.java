public class RefranceDataType {
    public static void main(String[] args) {

//| Aspect                 | Primitive Data Types        | Reference Data Types                             |
//|------------------------|-----------------------------|--------------------------------------------------|
//| Definition             | Basic data types provided   | Data types that refer to objects.                |
//|                        | by the Java language.       |                                                  |
//| Storage                | Store actual values.        | Store references (addresses)                     |
//|                        |                             | to objects in memory.                            |
//| Memory Allocation      | Allocated memory on the     | Allocated memory on the                          |
//|                        | stack.                      | heap.                                            |
//| Default Values         | Have default values even    | Default to null if not                           |
//|                        | if not explicitly           | explicitly initialized.                          |
//|                        | initialized.                |                                                  |
//| Passing to Methods     | Passed by value when        | Passed by reference when                         |
//|                        | passed as arguments.        | passed as arguments.                             |
//| Size                   | Fixed sizes defined by the  | Size of reference variables                      |
//|                        | language specification.     | is constant.                                     |
//| Examples               | `int`, `double`, `boolean`, | `String`, `ArrayList`, `LinkedList`,            |
//|                        | `char`, `float`, etc.       | `HashMap`, `HashSet`, `Object`,                 |
//|                        |                             | `MyCustomClass`, `Array`, etc.                   |


//        >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.


//      ------------------------  A R R A Y ---------------------------
        int myVariable = 55;
        int [] myArray;  //initializing an array

        myArray = new int[3];
        myArray[0]= 1;
        myArray[1]= 2;

        myArray[2]= 3;


        System.out.println(myArray[0]);

        System.out.println(myArray[2]);
        System.out.println(myArray[1]);










    }



}
