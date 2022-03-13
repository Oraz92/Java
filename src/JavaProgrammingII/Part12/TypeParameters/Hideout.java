package JavaProgrammingII.Part12.TypeParameters;

/*
Implement a class called Hideout, which has a single generic type parameter. The object created from the class may only
hide one object at a time. The class should provide a parameterless constructor as well as the following three methods:

public void putIntoHideout(T toHide) puts an object with a type in accordance with the type parameter given to the the
class into the hideout. In case an object is already in the hideout, it will disappear.

public T takeFromHideout() takes out the object with a type in accordance with the type parameter given to the the
class from the hideout. In case there is nothing in the hideout, we return null. Calling the method returns the object
in the hideout and removes the object from the hideout.

public boolean isInHideout() returns the value true if there is an object in the hideout. In case there isn't an object
in the hideout, it should return the value false.
 */

import java.util.ArrayList;
import java.util.List;

public class Hideout<T> {

    private List<T> values;

    public Hideout() {
        this.values = new ArrayList<>();
    }

    public void putIntoHideout(T toHide) {
        if (!this.values.isEmpty()) {
            this.values.clear();
        }
        this.values.add(toHide);

        /* if (this.values.isEmpty()) {
            this.values.add(toHide);
        } else {
            this.values.clear();
            this.values.add(toHide);
        }*/
    }

    public T takeFromHideout() {
        T value = this.values.get(0);
        this.values.clear();
        return value;
    }

    public boolean isInHideout() {
        return !this.values.isEmpty();
    }


    public static void main(String[] args) {
        Hideout<String> den = new Hideout<>();
        System.out.println(den.isInHideout());
        den.putIntoHideout("peekaboo");
        System.out.println(den.isInHideout());
        System.out.println(den.takeFromHideout());
        System.out.println(den.isInHideout());
        den.putIntoHideout("toodaloo");
        den.putIntoHideout("heelloo");
        System.out.println(den.isInHideout());
        System.out.println(den.takeFromHideout());
        System.out.println(den.isInHideout());


        /*System.out.println();

        Hideout<Integer> den = new Hideout<>();
        System.out.println(den.isInHideout());
        den.putIntoHideout(1);
        System.out.println(den.isInHideout());
        System.out.println(den.isInHideout());
        System.out.println(den.takeFromHideout());
        System.out.println(den.isInHideout());*/
    }
}
