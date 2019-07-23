package main.filtermode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Administrator on 2019/7/23.
 */
public class ClassifyTest {

    public static void main(String[] args) {
        List<Person> persons = new LinkedList<>();

        for (int i = 0; i < 10 ; i++) {
            if (i<5) {
                persons.add(new Person(String.valueOf(i), "boy"));
            }else {
                persons.add(new Person(String.valueOf(i), "girl"));
            }
        }

        System.out.println(""+persons.size());
        Classify c = new BoyPerson();
        persons = c.filter(persons);
        System.out.println(""+persons.size());
        persons.stream().forEach(person -> System.out.println(person.toString()));


    }
}
