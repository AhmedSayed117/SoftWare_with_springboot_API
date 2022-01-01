package User.Customer;

import User.Driver.Idriver;
import User.User;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public interface Icustomer extends User {
    ArrayList<Idriver> Drivers =new ArrayList<>();
     void subscribe(Idriver obj);
     void unsubscribe(Idriver obj);
     void Notify();
}
