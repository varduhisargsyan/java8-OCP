package oop.inheritance;

/**
 * Created by varduhis on 3/13/2017.
 */
public class Woolf extends Felin implements Wild {

    public  Woolf(String name , String type, String location){
        super(name, type, location);
    }

    @Override
    public void roam() {
        System.out.print(this.type + " " + this.name + " is roaming in forest");
    }
}
