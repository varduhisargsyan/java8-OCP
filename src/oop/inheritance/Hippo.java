package oop.inheritance;

/**
 * Created by varduhis on 3/13/2017.
 */
public class Hippo extends Animal {


    @Override
    public void eat() {
        System.out.println(this.type+ " is eating grass");
    }

    @Override
    public void makeNoise() {
        System.out.println(this.type+ " is blowing");
    }
}
