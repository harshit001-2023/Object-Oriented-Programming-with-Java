/*1. GeometricShapeCalculationApplication
Easy
100 points
• 130 min suggested
Problem Description
2) Write a java program to create an abstract class Shape with abstract methods area() & perimeter(). Create sub classes Square & Triangle
that extend the Shape class & override area() and perimeter() methods to calculate the area and perimeter of each shape.

Examples
Example 1
Input:
Enter side of square: 5

Enter three sides of triangle: 3 4 5
Enter base and height of triangle: 4 3
Output:
Area of Square = 25
Perimeter of Square = 20
Area of Triangle = 6.0
Perimeter of Triangle = 12

Explanation:
For Square Area of Square = side × side
Perimeter of Square = 4 × side
For Triangle Area of Triangle = (1/2) × base × height
Perimeter of Triangle = side1 + side2 + side3
*/

package abstractionConcepts.assignment1;

abstract class Shape{
    abstract void area();
    abstract void perimeter();
}
class Square extends Shape{
    private int side;

    public Square(int side){
        this.side = side;
    }

    void area(){
        IO.println("Area of Square = "+(this.side*this.side));
    }
    void perimeter(){
        IO.println("Perimeter of Square = "+(4*this.side));
    }
}

class Triangle extends Shape{
    private int s1;
    private int s2;
    private int s3;
    private int base;
    private int hight;

    public Triangle(int s1, int s2, int s3, int base, int hight){
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.base = base;
        this.hight = hight;
    }

    void area(){
        IO.println("Area of Triangle = "+(0.5*this.base*this.hight));
    }
    void perimeter(){
        IO.println("Perimeter of Triangle = "+(s1+s2+s3));
    }
}

void main(){
    int side = Integer.parseInt(IO.readln());
    int s1 = Integer.parseInt(IO.readln());
    int s2 = Integer.parseInt(IO.readln());
    int s3 = Integer.parseInt(IO.readln());
    int base = Integer.parseInt(IO.readln());
    int hight = Integer.parseInt(IO.readln());

    Shape sq = new Square(side);
    Shape T = new Triangle(s1,s2,s3,base,hight);

    sq.area();
    sq.perimeter();
    T.area();
    T.perimeter();
}
