public class Registration {

    static DriversList ListOfDrivers;
    static CustomersList ListOfCustomers;

    static User SignIn(User object ,String username,String password){
//        Customer obj = (Customer) object;
        Customer o = new Customer();
        for (Customer customer : CustomersList.getInstance().ListOfCustomer){
            if ( ( customer.getUsername().equals(username) ) && ( customer.getPassword().equals(password) )){
                 o = customer;
                System.out.println(o.getUsername());
                System.out.println(o.getPassword());
                return o;
            }else o = null;
        }
        return o;
    }

    static void SignUp(User object){
        Customer obj = (Customer) object;
        ListOfCustomers.getInstance().ListOfCustomer.add(obj);
    }

}
