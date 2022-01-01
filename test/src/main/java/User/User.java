package User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface User {

     void setE_mail(String e_mail) ;
     void setMobile(String mobile);
     void setPassword(String password);
     void setUsername(String username);
     void setSTATE(userState STATE);

     String getPassword();
     String getUsername();
     String getMobile();
     String getE_mail();
     userState getSTATE();

//     @Autowired
     User Login(String username,String password);
     void Register(User obj);
}