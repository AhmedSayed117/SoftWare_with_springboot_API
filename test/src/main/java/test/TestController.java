package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value="Sprint2")
public class TestController {

    @Autowired
    private Test2Service Tests;

    @GetMapping(value = "/User/add/{username}/{id}")
    public void adduser(@PathVariable String username,@PathVariable String id){
        Tests.p.add(new Person(username,id));
    }

    @GetMapping(value = "/User/{username}/{pass}")
    public String User(@PathVariable String username,@PathVariable int pass ){
        return username + " -> "+pass;
    }

    @GetMapping(value = {"","/"})
    public String home(){
        return "Hello Sprint 2";
    }

    @GetMapping(value = "/{name}")
    public String namea(@PathVariable String name){
        return "Hello " +name + " in Sprint 2";
    }

    @GetMapping(value = "/get")
    public ArrayList<Person> getPerson(){
        return Tests.p;
    }

}