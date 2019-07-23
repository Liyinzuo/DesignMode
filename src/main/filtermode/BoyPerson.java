package main.filtermode;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Administrator on 2019/7/23.
 */
public class BoyPerson implements Classify {

    @Override
    public List<Person> filter(List<Person> persons) {
        // jdk中内置的集合过滤方法
        return persons.stream().filter(person ->
            person.getSex().equals("boy")
        ).collect(Collectors.toList());
    }
}
