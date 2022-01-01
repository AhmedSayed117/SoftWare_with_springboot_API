package User.Driver;


import User.User;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface Idriver extends User {
     void Update(User object);
}