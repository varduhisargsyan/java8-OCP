package oop.inheritance;

/**
 * Created by varduhis on 3/13/2017.
 */
public class Tigger extends Canin implements Wild {

    private Tigger(String name, String type, String location) {
        super(name, type, location);
    }

    //referring to Ural's tigger :)
    @Override
    public void roam() {
        System.out.print(this.type + " " + this.name + " is roaming in Urals");
    }
}
