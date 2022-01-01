package test;

import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Arrays;

@Service
public class Test2Service {

    ArrayList<Person> p = new ArrayList<>(Arrays.asList(
            new Person("Ahmed","1"),
            new Person("Khaled","2"),
            new Person("Ebrahim","3"),
            new Person("zeyad","4")
    ));

}
