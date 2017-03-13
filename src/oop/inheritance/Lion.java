package oop.inheritance;


/**
 * Created by varduhis on 3/13/2017.
 */
public class Lion extends Canin implements Wild {

    public Lion(String name, String type, String location) {
        super(name, type, location);
    }


    @Override
    public void roam() {
        System.out.print(this.type + " " + this.name + " is roaming in Savanna");
    }
}
