package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Name {

    private ArrayList<String> names;

    public Name() {
        this.names = new ArrayList<String>();

        names.add("Harjit");
        names.add("Farheen");
        names.add("Debi");
        names.add("Joe");
        names.add("Jack");
        names.add("Angelina");
        names.add("Steven");
        names.add("Matt");
        names.add("Craig");
    }


    public ArrayList<String> getNames() {
        return names;
    }

    public void setNames(ArrayList<String> names) {
        this.names = names;
    }

//        to be able to return a random name from the ArrayList

    public String oneRandomName() {
        Collections.shuffle(names);
        String name = names.get(0);
        return name;
    }


//        to be able to get a pair of random names from the ArrayList and return those names using an ArrayList

    public ArrayList<String> pairOfRandomNames() {
        ArrayList<String> pairs = new ArrayList();
        Collections.shuffle(names);
        pairs.add(names.get(0));
        pairs.add(names.get(1));
//        names.remove(0);
//        return names;
        return pairs;

    }

}
