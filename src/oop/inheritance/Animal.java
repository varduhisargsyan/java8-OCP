package oop.inheritance;

/**
 * Created by varduhis on 3/13/2017.
 */
public abstract class Animal {

    protected String name;
    protected String location ;
    protected String type;


    public Animal(){

    }


    //must print {animalType} is eating {foodType}
    public abstract void eat();

    //must print {animalType} is {noiseMessage}
    public abstract void makeNoise();
}
