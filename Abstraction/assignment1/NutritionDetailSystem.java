/*2. NutritionDetailsSystem
Easy
100 points
• 130 min suggested
Problem Description
Nutrition in food can be broken down into proteins, fats, and carbohydrates. Implement the following classes about food and nutrition to complete this challenge:

1. abstract class Food with the following properties:

double proteins
double fats
double carbs
double tastyScore
void getMacroNutrients [Abstract Method]

2. class Egg which extends class Food and has the following properties:

Constructor to initialize the attributes (proteins, fats, and carbs) in the same order.
int tastyScore = 7
String type = "non-vegetarian"
void getMacroNutrients => prints("An egg has [this.proteins] gms of protein, [this.fats] gms of fats and [this.carbs] gms of carbohydrates.")

3. class Bread which extends class Food and has the following properties:

Constructor to initialize the attributes (proteins, fats, and carbs) in the same order.
int tastyScore = 8
String type = "vegetarian"
void getMacroNutrients => prints(" A slice of bread has [this.proteins] gms of protein, [this.fats] gms of fats and [this.carbs] gms of carbohydrates.")


Create an ELC class Testing
The first line contains an integer, n, the number of food items.

Every food item takes input in the next 4 lines where the first line is the name of the food and the next three lines are method calls (getType, getTaste, and getMacros)

Input :-
1
Bread
getType
getMacros
getTaste
Output :-

Bread is vegetarian
A slice of bread has 4.0 gms of protein, 1.1 gms of fats and 13.8 gms of carbohydrates.
Taste: 8

Examples
Example 1
Input:
1
Bread
getType
getMacros
getTaste
Output:
Bread is vegetarian
A slice of bread has 4.0 gms of protein, 1.1 gms of fats and 13.8 gms of carbohydrates.
Taste: 8
*/

package Abstraction.assignment1;

class Testing{
    void main(){
        int num = Integer.parseInt(IO.readln());
        String food = IO.readln();
        String getType = IO.readln();
        String getMacros = IO.readln();
        String getTests = IO.readln();

        if(food.equalsIgnoreCase("bread")){
            Food bread = new Bread(4.0, 1.1, 13.8);
            IO.print(food+" is ");
            bread.getMacroNutrients();
        }else if(food.equalsIgnoreCase("egg")){
            Food egg = new Egg(6.3, 5.0, 0.6);
            IO.print(food+" is ");
            egg.getMacroNutrients();
        }else{
            IO.println("Error");
        }
    }
}


abstract class Food{
    double proteins;
    double fats;
    double carbs;
    double tastyScore;

    public Food(double proteins, double fats, double carbs) {
        this.proteins = proteins;
        this.fats = fats;
        this.carbs = carbs;
    }


    abstract void getMacroNutrients();
}

class Egg extends Food{
    int tastyScore = 7;
    String type = "non-vegetarian";


    Egg(double proteins, double fats, double carbs){
        super(proteins, fats, carbs);
    }

    public int getTastyScore() {
        return tastyScore;
    }

    public String getType(){
        return type;
    }

    @Override
    void getMacroNutrients() {
        IO.println(getType()+"\nAn egg has "+this.proteins+" gms of protein, "+this.fats+" gms of fats and "+this.carbs+" gms of carbohydrates.\nTaste: "+getTastyScore());
    }
}

class Bread extends Food{
    int tastyScore = 8;
    String type = "vegetarian";

    Bread(double proteins, double fats, double carbs){
        super(proteins, fats, carbs);
    }

    public int getTastyScore() {
        return tastyScore;
    }

    public String getType(){
        return type;
    }

    @Override
    void getMacroNutrients() {
        IO.println(getType()+"\nA slice of bread has "+this.proteins+" gms of protein, "+this.fats+" gms of fats and "+this.carbs+" gms of carbohydrates.\nTaste: "+getTastyScore());
    }
}

