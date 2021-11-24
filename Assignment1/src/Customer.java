import java.util.ArrayList;

public class Customer implements Icustomer {

    private  Request request;
    private int customer_rate;
    private String mobile ;
    private String Username ;
    private String E_mail ;
    private String Password ;
    private userState STATE = userState.ACTIVE;

    ArrayList<Driver> Drivers = DriversList.getInstance().ListOfDrivers;
    ArrayList<Idriver> ObserverList = new ArrayList<>();

    public Customer(){
        ObserverList = new ArrayList<>();
    }

    @Override
    public void subscribe(Idriver object) {
        Driver obj = (Driver) object;
        Drivers.add(obj);

        ObserverList.add(object);
    }

    @Override
    public void unsubscribe(Idriver object) {
        Driver obj = (Driver) object;
        Drivers.remove(obj);

        ObserverList.remove(ObserverList.indexOf(object));
    }

    @Override
    public void Notify(String message) {
        for(Idriver obj: ObserverList) {
            obj.Update(message);
        }
    }

    @Override
    public User Login(User object ,String username,String password) {
        Customer c = new Customer();
        for (Customer customer : CustomersList.getInstance().ListOfCustomer){
            if ( ( customer.getUsername().equals(username) ) && ( customer.getPassword().equals(password) )  && (customer.getSTATE()==userState.ACTIVE)){
                c = customer;
                System.out.println(c.getUsername());
                System.out.println(c.getPassword());
                return c;
            }else c = null;
        }
        return c;
    }

    @Override
    public void Register(User object) {
        Customer obj = (Customer) object;
        for (int i=0;i<CustomersList.getInstance().ListOfCustomer.size();i++){
            if(CustomersList.getInstance().ListOfCustomer.get(i).getUsername().equals(obj.getUsername())){
                System.out.println("username already exists");
                return;
            }
        }
            CustomersList.getInstance().ListOfCustomer.add(obj);
//            setDrivers(DriversList.getInstance().ListOfDrivers);
    }


    public void setE_mail(String e_mail) {
        E_mail = e_mail;
    }

//    public void setDrivers(ArrayList<Driver> drivers) {
//        for (int i =0;i<drivers.size();i++){
//            if (drivers.get(i).getState()==userState.ACTIVE) subscribe(drivers.get(i));
//        }
//    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public void setSTATE(userState STATE) {
        this.STATE = STATE;
    }
    public void setCustomer_rate(int customer_rate) {
        this.customer_rate = customer_rate;
    }

    public String getE_mail() {
        return E_mail;
    }

    @Override
    public userState getState() {
        return null;
    }

    public String getMobile() {
        return mobile;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public userState getSTATE() {
        return STATE;
    }

    public int getCustomer_rate() {
        return customer_rate;
    }

    public Request getRequest() {
        return request;
    }

    public ArrayList<Driver> getDrivers() {
        return Drivers;
    }

    @Override
    public String toString() {
        return "Customer{" +
                ", Username='" + Username + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }
}