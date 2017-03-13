package oop.inheritance;

/**
 * Created by varduhis on 3/13/2017.
 */
public class Felin extends Animal {

    public Felin(String name, String type, String location) {
        this.name = name;
        this.type = type;
        this.location = location;
    }
public Felin(){}
    @Override
    public void eat() {
        System.out.println(this.type+ " is eating meat");
    }

    @Override
    public void makeNoise() {
        System.out.println(this.type+ " is eating barking");
    }

}
