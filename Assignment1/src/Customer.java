import java.util.ArrayList;

public class Customer implements Icustomer {

    private  Request request;
    private int customer_rate;
    private String mobile ;
    private String Username ;
    private String E_mail ;
    private String Password ;
    private userState STATE = userState.ACTIVE;

    ArrayList<Idriver>Drivers =new ArrayList<>();


    @Override
    public void subscribe(Idriver obj) {
        Drivers.add(obj);
    }

    @Override
    public void unsubscribe(Idriver obj) {
        Drivers.remove(obj);
    }

    @Override
    public void Notify(String message) {
        for(Idriver obj: Drivers) {
            obj.Update(message);
        }
    }

    @Override
    public User Login(User object ,String username,String password) {
        Customer obj = (Customer) object;
        return Registration.SignIn(obj,username,password);//null -> User Object
    }

    @Override
    public void Register(User object) {
        Customer obj = (Customer) object;
        Registration.SignUp(obj);
    }


    public void setE_mail(String e_mail) {
        E_mail = e_mail;
    }

    public void setDrivers(ArrayList<Idriver> drivers) {
        Drivers = drivers;
    }

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


}