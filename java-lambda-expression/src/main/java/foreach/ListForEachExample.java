package foreach;

import java.util.ArrayList;
import java.util.List;

public class ListForEachExample {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();
        list.add(new Person("Chandrakant", 21));
        list.add(new Person("Vivek", 22));
        list.add(new Person("Aditya", 23));
        list.add(new Person("Sushma", 22));

        //prior Java8
        for (Person person : list) {
            System.out.print(person.getName());
            System.out.println(person.getAge());
        }
        list.forEach((person) -> {
            System.out.print(person.getName());
            System.out.println(person.getAge());
        });
        //Stream()
        list.stream().forEach((person) -> {
            System.out.print(person.getName());
            System.out.println(person.getAge());
        });
    }
}
