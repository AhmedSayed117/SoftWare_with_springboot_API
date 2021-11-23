public class Registration {

    static DriversList ListOfDrivers;
    static CustomersList ListOfCustomers;

    static User SignIn(User object ,String username,String password){
        return object.Login(object,username,password);
    }

    static void SignUp(User object){
        object.Register(object);
    }
}
