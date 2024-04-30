public class StringInJava {
    public static void main(String[] args) {
        String text ="Hello World";
        System.out.println(text);

        String text1 = new String();
        String text2 = new String();
        String text3 = new String();

        text1= "Mahatma";
        text2 = "Gandhi";
        String  text4 = "2";  //number can be also added into string if that is in double quotes

        text3 = text1 +" "+ text2; //concatenated using "+"
        System.out.println(text3);
        System.out.println(text3.concat(" ") .concat(text4) ); //concatenated using concat function

    }

}
