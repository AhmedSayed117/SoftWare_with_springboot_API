package Control;
import Control.DataBase.CustomersList;
import Control.DataBase.DriversList;
import User.Customer.Customer;
import User.Driver.Driver;
import User.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class Registration {

    static DriversList ListOfDrivers;
    static CustomersList ListOfCustomers;

    @GetMapping(value = "/signin/customer/{username}/{password}")
    public static User SignIn(@RequestBody Customer object , @PathVariable String username, @PathVariable String password){
        if (object!=null) return object.Login(username,password);
        return null;
    }

    @GetMapping(value = "/signin/driver/{username}/{password}")
    public static User SignIn(@RequestBody Driver object , @PathVariable String username, @PathVariable String password){
        if (object!=null) return object.Login(username,password);
        return null;
    }

    @GetMapping(value = "/signUp/customer")
    public static void SignUp(@RequestBody Customer object){
        object.Register(object);
    }

    @GetMapping(value = "/signUp/driver")
    public static void SignUp(@RequestBody Driver object){
        object.Register(object);
    }
}