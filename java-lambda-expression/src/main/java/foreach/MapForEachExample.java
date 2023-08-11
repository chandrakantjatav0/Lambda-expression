package foreach;

import java.util.HashMap;
import java.util.Map;

public class MapForEachExample {
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<Integer, Person>();
        map.put(1, new Person("Chandrakant", 21));
        map.put(2, new Person("Vivek", 22));
        map.put(3, new Person("Sushma", 22));
        map.put(4, new Person("Aditya", 23));
        //use ForEach Loop
        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.print(entry.getKey());
            System.out.println(entry.getValue().getName());
        }
        //Use forEach method + Lambda
        map.forEach((k, v) -> {
            System.out.println(k + " . " + v.getName() + " : " + v.getAge());
        });
    }
}