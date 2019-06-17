package rocks.zipcode.assessment2.generics;


import rocks.zipcode.assessment2.generics.ageable.Ageable;

import java.util.HashMap;
import java.util.Map;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<_> extends Ageable {
    public Map<String,String> map1 = new HashMap<>();


    public Shelter() {


    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {

        return this.map1.size();
    }

    public void add(Object object) {


    }

    public Boolean contains(Object object) {

        return true;
    }

    public void remove(Object object) {
    }

    public Object get(Integer index) {
        return null;
    }

    public Integer getIndexOf(Object ageable) {
        return 0;
    }
}