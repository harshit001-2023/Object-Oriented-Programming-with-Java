package Inheritance.intro.zoomanagement;

class Animal{
    private String name;

    public Animal(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    static void main(){
        String name = IO.readln();
        boolean hasFur = Boolean.parseBoolean(IO.readln());
        String breed = IO.readln();

        Dog dog = new Dog(name, hasFur, breed);
        IO.println(dog);
    }
}

class Mammal extends Animal{
    private boolean hasFur;

    public Mammal(String name, boolean hasFur){
        super(name);
        this.hasFur = hasFur;
    }

    public void setHasFur(boolean hasFur){
        this.hasFur = hasFur;
    }

    public boolean getHasFur(){
        return hasFur;
    }
}

class Dog extends Mammal{
    private String breed;

    public Dog(String name, boolean hasFur, String breed){
        super(name, hasFur);
        this.breed = breed;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public String getBreed(){
        return breed;
    }

    public String toString(){
        return "Dog [getName()="+getName()+", isHasFur()="+getHasFur()+", breed="+getBreed()+"]";
    }
}
