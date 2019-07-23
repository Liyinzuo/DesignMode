package main.filtermode;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Administrator on 2019/7/23.
 */
public class GirlPerson implements Classify {

    @Override
    public List<Person> filter(List<Person> persons) {
        return persons.stream().filter(
                person -> person.getSex().equals("girl")
        ).collect(Collectors.toList());
    }
}
