package Control;

import Control.DataBase.CustomersList;
import Control.DataBase.DriversList;
import User.Customer.Customer;
import User.Driver.Driver;
import User.User;
import User.userState;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sound.sampled.Control;
import java.util.ArrayList;

@RestController
public class Administrator {
    private static Administrator instanceOFAdministrator = null;

    private Administrator(){

    }

//    @GetMapping(value = "/approve")
//    public void CreatAdmin(){
////        Customer admin = new Customer();
////        admin.setUsername("admin");
////        admin.setPassword("admin");
////        CustomersList.getInstance().ListOfCustomer.add(admin);
////        System.out.println("admin finished");
//    }

    public static Administrator getInstance(){
        if(instanceOFAdministrator == null) return instanceOFAdministrator = new Administrator();
        else return instanceOFAdministrator;
    }

    @GetMapping(value = "approve/driver")
    public Driver Approve(@RequestBody Driver obj){
        for (Driver d : DriversList.getInstance().ListOfDrivers) {
            if (d.getUsername().equals(obj.getUsername())) {
                obj.setSTATE(userState.ACTIVE);
                update(obj);
                return obj;
            }
        }
        return null;
    }

    //update set state
    public ArrayList<Driver> update(@RequestBody Driver obj){
        for (Driver d : DriversList.getInstance().ListOfDrivers) {
            if (d.getUsername().equals(obj.getUsername())) {
                d.setSTATE(obj.getSTATE());
            }
        }
        return DriversList.getInstance().ListOfDrivers;
    }

//    public void Blocked(User obj){
//        obj.setSTATE(userState.BLOCkED);
//    }

}