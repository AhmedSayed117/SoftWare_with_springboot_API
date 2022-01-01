package Control.DataBase;


import User.Driver.Driver;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class DriversList {
    private static DriversList instanceOFDriversList =null;
    public ArrayList<Driver> ListOfDrivers = new ArrayList<>();

    private DriversList(){

    }

    @GetMapping(value = "/driver")
    public static DriversList getInstance(){
        if(instanceOFDriversList == null) return instanceOFDriversList = new DriversList();
        else return instanceOFDriversList;
    }

}
