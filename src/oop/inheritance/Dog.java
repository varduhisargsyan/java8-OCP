package oop.inheritance;

/**
 * Created by varduhis on 3/13/2017.
 */
public class Dog extends Canin implements Domestic {

    private String owner;

    public Dog(String name, String type, String location, String owner) {
        super(name, type, location);
        this.owner = owner;

    }

    public Dog(){}

    @Override
    public void play() {
        System.out.println(this.type+ " "+ this.name+ " is playing");
    }

    @Override
    public void beFriendly() {
        System.out.println(this.type+ " "+ this.name+ " is sitting next to Aram");
    }
}
