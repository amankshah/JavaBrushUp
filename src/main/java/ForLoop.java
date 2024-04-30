public class ForLoop {
    public static void main(String[] args) {

        for(int i=0;i<10 ; i++){
            System.out.println("Hi i am executed in loop " + i);
        }
        int[] arr = {1,2,3,4,5,6};
        for (int j=0; j<arr.length ; j++) {
            System.out.println(j);
        }

        //Enhanced for loop

        for (int j : arr) {
            System.out.println(j);
        }


        //nested for loop
        for(int i=0;i<3 ; i++){
            System.out.println("Value of i " + i);
            for(int j=0;j<3 ; j++){
                System.out.println("Value of j " + j);

                for(int k=0; k<3; k++){
                    System.out.println("Value of k " + k);
                    System.out.println("Value of i " + i + ", Value of j " + j + ", Value of K " + k);
                }
            }
        }




    }
}
