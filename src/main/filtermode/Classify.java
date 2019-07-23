package main.filtermode;

import java.util.List;

/**
 * Created by Administrator on 2019/7/23.
 */
public interface Classify {

    public List<Person> filter(List<Person> persons);
}
