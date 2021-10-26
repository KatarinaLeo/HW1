/**
 * Java 1. Homework 5
 *
 * @author Leonskaya Ekaterina
 * @version 26.10.2021
 */

public class Homework6 {

    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", "white", 200, 0);
        Dog dog = new Dog("Sharik", "grey", 500, 10);

        Animal[] animals = {cat,dog};
        for(Moving animal: animals) {
            System.out.println(animal);
            animal.run(400);
            animal.swim(100);
        }
        System.out.println("Number of created animals: " + Animal.createdNumber);
        System.out.println("Number of crated cats: " + Cat.catCreatedNumber);
        System.out.println("Number of crated dogs: " + Dog.dogCreatedNumber);
    }
}

interface Moving {
    void run(int distance);
    void swim(int distance);
}

class Cat extends Animal{
    public static int catCreatedNumber = 0;

    Cat(String name, String color, int runLimit, int swimLimit){
        super(name, color, runLimit, swimLimit);
        catCreatedNumber++;
    }
}

class Dog extends Animal{

    public static int dogCreatedNumber = 0;

    Dog(String name, String color, int runLimit, int swimLimit){
        super(name, color, runLimit, swimLimit);
        dogCreatedNumber++;
    }
}

abstract class Animal implements Moving{
    protected String name;
    protected String color;
    protected int runLimit;
    protected int swimLimit;
    public static int createdNumber = 0;

    Animal(String name, String color, int runLimit, int swimLimit) {
        this.name = name;
        this.color = color;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        Animal.createdNumber++;
    }

    @Override
    public String toString(){
        return name + ", " + color;
    }

    @Override
    public void run(int distance){
        String answer = this.name + " runned " + distance;
        if (distance > this.runLimit){
            answer = this.name + " cannot run " + distance;
        }
        System.out.println(answer);
    }

    @Override
    public void swim(int distance){
        String answer = this.name + " swam " + distance;
        if (distance > this.swimLimit){
            answer = this.name + " cannot swim " + distance;
        }
        System.out.println(answer);
    }
}