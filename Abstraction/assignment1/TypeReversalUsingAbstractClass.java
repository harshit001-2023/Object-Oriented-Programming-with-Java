/*2. Abstraction.assignment1.TypeReversalUsingAbstractClass
Easy
100 points
• 130 min suggested
Problem Description
3) Write a java program to create an abstract class Type with abstract method reverse(). Create sub classes StringType & IntegerType that
extend the Type class & override reverse() method to reverse the given string & reverse the digits.

Examples
Example 1
Input:
Enter a String: Java
Enter an Integer: 1234
Output:
Reversed String: avaJ
Reversed Number: 4321

Explanation:
Create a subclass StringType to reverse a given String Create a subclass
IntegerType to reverse the digits of a given Integer Override the reverse() method in both subclasses
*/

abstract class Type{
  abstract void reverse();
}
class StringType extends Type{
  private String str;

  public StringType(String str){
    this.str = str;
  }

  void reverse() {
    String temp = "";
    // Start at length - 1, and go down to 0
    for(int i = str.length() - 1; i >= 0; i--) {
      temp = temp + str.charAt(i);
    }
    System.out.println("Reversed String: " + temp);
  }
}
class IntegerType extends Type{
  private int num;

  public IntegerType(int num){
    this.num = num;
  }

  void reverse() {
    int tempNum = num; // Use a temp variable to keep the original num intact
    int rev = 0;
    while(tempNum != 0) {
      int digit = tempNum % 10;     // Get the last digit
      rev = rev * 10 + digit;       // Push digit to reversed number
      tempNum = tempNum / 10;       // Remove last digit
    }
    System.out.println("Reversed Integer: " + rev);
  }
}

void main(){
  String str = IO.readln();
  int num = Integer.parseInt(IO.readln());

  Type st = new StringType(str);
  Type it = new IntegerType(num);

  st.reverse();
  it.reverse();

}
