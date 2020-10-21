public class StringDemo {
    public static void main(String[] args) {
        char[] helloArray = {'h', 'e', 'l', 'l', 'o', '.'};
        String helloString = new String(helloArray);
        System.out.println(helloString);

        String palindrome = "Dot saw I was Tod";
        int len = palindrome.length();
        System.out.println("String Length is : " + len);
        
        float floatVar = 1.0f;
        Integer intVar = 2;
        String stringVar = "Joko";
        String fs;
        fs = String.format("The value of the float variable is " + 
                            "%f, while the value of the integer " +
                            "variable is %d, and the string " +
                            " is %s", floatVar, intVar, stringVar);

        System.out.println(fs);
    }
}