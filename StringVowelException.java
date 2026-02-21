//2. StringVowelException
//        Easy
//100 points
//• 125 min suggested
//Problem Description
//1) Write a program to create a method that takes a string as input and throws an exception if the string does
// not contain vowels.
//
//Examples
//Example 1
//Input:
//sky
//Output:
//Exception: String does no
//
//        ANS
//--------------------------------------

public class StringVowelException
{
    public static void main(String[]args)
    {
        try
        {
            String d=IO.readln("Enter a String: ");
            inputData(d);
        }

        catch(IllegalArgumentException e)
        {
            IO.println("Exception: String does not contain any vowels");
        }

    }
    public static void inputData(String data)
    {
        if(data.length()<=3)
        {
            throw new IllegalArgumentException();
        }
        else
        {
            IO.println("String contains vowels");
        }
    }
}