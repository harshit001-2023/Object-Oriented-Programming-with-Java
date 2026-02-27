package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiArrayProblems {
    static void main() {
        int len = Integer.parseInt(IO.readln("Enter Array length: "));
        int[] arr= new int[len];
        String[] names = {"Rahul", "Raj", "Arnav", "Scott", "Smith"};
        String[] words = {"madam", "hello", "racecar", "java", "level", "world"};
        Boolean[] flags = {true, false, true, false, true};

        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = Integer.parseInt(IO.readln("Enter element #"+(i+1)+": "));
        }

        IO.println(Arrays.toString(arr));
        IO.println("---------------------------------------------");
        IO.println("Removing Negative numbers fom Array"+Arrays.toString(removeNegativeNumbers(arr)));
        IO.println("String containing a"+Arrays.toString(removeStringContainingA(names)));
        IO.println("Strings containing N"+removeStringContainingLetter(names));
        IO.println("All prime numbers from Arrays"+Arrays.toString(returnAllPrimeNumbers(arr)));
        IO.println("Strings With length greater than 3"+Arrays.toString(stringLengthGreaterThanThree(names)));
        IO.println("Unique Numbers"+Arrays.toString(uniqueNumbers(arr)));
        IO.println("Palindrome string: "+ Arrays.toString(palindromeStrings(words)));
        IO.println("String: num format :"+Arrays.toString(arrayToStringRepresentation(arr)));
//        IO.println("Boolean to Yes and No: "+Arrays.toString(convertBooleanToYesOrNo(flags)));
        IO.println("String to UpperCase: "+Arrays.toString(stringToUppercase(words)));
        IO.println("First Letter of String "+Arrays.toString(stringFirstLetter(words)));
    }
//
//    Array Logical Question using Stream API :
//            -----------------------------------------
//
//    Q1) WAP to remove Negative Numbers from an Integer Array.
//
//            Integer[] numbers = {-10, -5, 0, 5, 10, 15, -20};
//
//    Output : Positive Numbers: [5, 10, 15]
//            ------------------------------------------------------------------------
    public static int[] removeNegativeNumbers(int[] arr){
        return Arrays.stream(arr)
                .filter(i -> i > 0)
                .toArray();
    }

//    Q2) WAP to print all the names from String array which contains
//    letter 'a' in the name.
//
//            String[] names = {"Rahul", "Raj", "Arnav", "Scott", "Smith"};
//    Output : Names Containing 'A' or 'a' : [Rahul, Raj, Arnav]
//
//            ------------------------------------------------------------------------
    public static String[] removeStringContainingA(String[] names){
        return Arrays.stream(names).filter(s -> s.toLowerCase().contains("a")).toArray(String[]::new);
    }

    //Second Method using string
    public static List<String> removeStringContainingLetter(String[] names){
        return Arrays.stream(names).filter(str -> str.toLowerCase().contains("n")).collect(Collectors.toList());
    }
//    Q3) WAP to print all the Prime Numbers from an Integer Array.
//
//            Integer[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
//
//    Output : Prime Numbers: [2, 3, 5, 7, 11]
//            ------------------------------------------------------------------------
    public static int[] returnAllPrimeNumbers(int[] arr){
//        return Arrays.stream(arr).filter(num -> StreamApiArrayProblems.isPrime(num)).toArray();

        return Arrays.stream(arr).filter(StreamApiArrayProblems::isPrime).toArray();
    }

    private static boolean isPrime(int n){
        if(n < 2) return false;
//        for(int i = 2; i * i <= n; i++)
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i==0) return false;
        }
        return true;
    }
//    Q4) WAP to print all the names from String array where the length of the
//    name must be greater than 3.
//
//    String[] words = {"Raj", "Rohit", "Smirti", "Richa", "Sky"};
//    Output : [Rohit, Smirti, Richa]
//            ------------------------------------------------------------------------
    public static String[] stringLengthGreaterThanThree(String[] names){
        return Arrays.stream(names).filter(str -> str.length() > 3).toArray(String[]::new);
    }

//    Q5) WAP to print all the unique numbers from the Array.
//
//    Integer[] numbers = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 4};
//    Output : Unique Numbers: [1, 2, 3, 4, 5, 6, 7, 8]
//
//            ------------------------------------------------------------------------
    public static int[] uniqueNumbers(int[] arr){
        return Arrays.stream(arr).distinct().toArray();
    }
//    Q6) WAP to filter Palindrome Words from an Array.
//
//    String[] words = {"madam", "hello", "racecar", "java", "level", "world"};
//
//    Output : Palindrome Words: [madam, racecar, level]
//            ------------------------------------------------------------------------


    public static String[] palindromeStrings(String[] strings) {
        if (strings == null || strings.length == 0) return new String[0];

        return Arrays.stream(strings)
                .filter(s -> s != null && isPalindrome(s))
                .toArray(String[]::new);
    }

    // Helper method to check if a string is palindrome
    private static boolean isPalindrome(String str) {
        if (str == null) return false;

        // Case 1: Using StringBuilder
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);

        // OR Case 2: Manual check (no need for extra object)
    /*
    int left = 0;
    int right = str.length() - 1;

    while (left < right) {
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }
    return true;
    */
    }
//    Q7) WAP to convert Integer Array to String Representation
//
//    Integer[] numbers = {10, 20, 30, 40, 50};
//    Converted Strings: [Number: 10, Number: 20, Number: 30, Number: 40, Number: 50]
//            ------------------------------------------------------------------------
    public static String[] arrayToStringRepresentation(int[] arr){
        return Arrays.stream(arr).mapToObj(n->"Number: "+n).toArray(String[]::new);
    }

//    Q8) WAP to convert all the names of String array into uppercase
//
//    String[] names = {"Virat", "Sanju", "Rohit", "Bumrah"};
//
//    Output : [VIRAT, SANJU, ROHIT, BUMRAH]
//            ------------------------------------------------------------------------
    public static String[] stringToUppercase(String str[]){
//        return Arrays.stream(str).map(String::toUpperCase).toArray(String[]::new);
        return Arrays.stream(str).map(s -> s.toUpperCase()).toArray(String[]::new);
    }
//    Q9) WAP to convert boolean value to "Yes" or "No"
//    Boolean[] flags = {true, false, true, false, true};
//    Yes/No Values: [Yes, No, Yes, No, Yes]
//    ------------------------------------------------------------------------
//public static String[] convertBooleanToYesOrNo(Boolean[] bool) {
//    if (bool == null) return new String[0];
//
//    return Arrays.stream(bool)
//            .mapToObj(b -> b ? "Yes" : "No")
//            .toArray(String[]::new);
//}
//    Q10) WAP to extract First Letter of Each Word from String Array
//    String []names = {"James", "Aryan", "Vibha", "Aniket"};
//    First Letters: [J, A, V, A]
    public static Character[] stringFirstLetter(String[] word){
        return Arrays.stream(word).map(s->s.charAt(0)).toArray(Character[]::new);
    }
}
