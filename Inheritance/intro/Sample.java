package Inheritance.intro;

class MultilevelInheritance{
    static void main(){
        int choice = Integer.parseInt(IO.readln());
        Dog dog = new Dog();

        if(choice == 1){
            dog.eat();
        }else if(choice == 2){
            dog.walk();
        }else if(choice == 3){
            dog.bark();
        }
        else IO.println("Invalid choice!");
    }
}
class Animal{
    public void eat(){
        IO.println("Animal is eating");
    }
}

class Mammal extends Animal{
    public void walk(){
        IO.println("Mammal is walking");
    }
}

class Dog extends Mammal{
    public void bark(){
        IO.println("Dog is barking");
    }
}

