import com.sun.istack.internal.NotNull;
import java.util.Arrays;

/**
 * Java 1. Homework 7
 *
 * @author Leonskaya Ekaterina
 * @version 26.10.2021
 */

public class Homework7 {

    public static void main(String[] args){
        KittyClass [] kittyArray = new KittyClass[3];
        kittyArray [0] = new KittyClass ("Barsik", 5);
        kittyArray [1] = new KittyClass ("Murzik", 3);
        kittyArray [2] = new KittyClass ("Vasik", 4);

        for(KittyClass i : kittyArray) {
            System.out.println(i);
        }

        PlateClass plate = new PlateClass(10);
        System.out.println(plate);

        for(int i = 0; i < kittyArray.length; i++){
            kittyArray[i].tryToEat(plate);
        }
        System.out.println(plate);

        for(int i = 0; i < kittyArray.length; i++){
            if (kittyArray[i].getFullness()){
                System.out.println("Kotik " + kittyArray[i].getName() + " poel");
            } else {
                System.out.println("Kotik " + kittyArray[i].getName() + " ne poel");
            }
        }
    }
}

class KittyClass {
    private String name;
    private int appetit;
    private boolean fullness;


    KittyClass(String name, int appetit){
        this.name = name;
        this.appetit = appetit;
        fullness = false;
    }

    int getAppetit(){
        return appetit;
    }

    void tryToEat(PlateClass plate){
        this.fullness = plate.decreaseFood(this.appetit);
    }

    boolean getFullness(){
        return this.fullness;
    }

    String getName(){
        return name;
    }

    @Override
    public String toString(){
        return "Kitty " + name + ", " + "eat " + appetit;
    }
}

class PlateClass {
    private int food;

    PlateClass(int food){
        this.food = food;
    }

    int getFood(){
        return food;
    }

    void setFood(int food){
        this.food = food;
    }

    boolean decreaseFood(int consumption){
        boolean answer;
        if(this.food < consumption){
            answer = false;
        }
        else{
            this.food -= consumption;
            answer = true;
        }
        return answer;
    }

    @Override
    public String toString(){
        return "Plate: " + food;
    }
}

