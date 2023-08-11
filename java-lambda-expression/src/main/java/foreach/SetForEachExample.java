package foreach;

import java.util.HashSet;
import java.util.Set;

public class SetForEachExample {
    public static void main(String[] args) {
        Set<Person> set = new HashSet<>();
        set.add(new Person("Chandrakant", 21));
        set.add(new Person("Vivek", 22));
        set.add(new Person("Aditya", 23));
        set.add(new Person("Sushma", 22));

        //forEach loop
        for (Person person : set) {
            System.out.println(person.getName() + " : " + person.getAge());
        }
        //forEach method + lambda
        set.forEach((person) -> {
            System.out.println(person.getName() + " : " + person.getAge());
        });
        //using Stream with ForEach method
        set.stream().forEach((person) -> {
            System.out.println(person.getName() + " : " + person.getAge());
        });
    }
}
