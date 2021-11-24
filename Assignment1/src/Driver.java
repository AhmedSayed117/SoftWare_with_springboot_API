import java.util.ArrayList;

public class Driver implements Idriver{
    userState state = userState.PENDING;
    private String license;
    private String national_id;
    private ArrayList<String>fav_area=new ArrayList<String>();
    private ArrayList<Integer>ratings=new ArrayList<Integer>();
    private ArrayList<User>notification=new ArrayList<User>();
    private String mobile ;
    private String Username ;
    private String E_mail ;
    private String Password ;

    @Override
    public User Login(User object ,String username,String password) {
        Driver d = new Driver();

        for (Driver driver : DriversList.getInstance().ListOfDrivers){
            if ( ( driver.getUsername().equals(username) ) && ( driver.getPassword().equals(password) ) && (getState()==userState.ACTIVE)){
                d = driver;
                System.out.println(d.getUsername());
                System.out.println(d.getPassword());
                return d;
            }else d = null;
        }
        return d;
    }

    @Override
    public void Register(User object) {
        Driver obj = (Driver) object;
        for (int i=0;i<DriversList.getInstance().ListOfDrivers.size();i++){
            if(DriversList.getInstance().ListOfDrivers.get(i).getUsername().equals(obj.getUsername())){
                System.out.println("username already exists");
                return;
            }
        }
            DriversList.getInstance().ListOfDrivers.add(obj);
    }

    @Override
    public void Update(String message) {
        System.out.println(message);
    }

    public void setState(userState state) {
        this.state = state;
    }

    @Override
    public userState getState() {
        return state;
    }

    @Override
    public String getMobile() {
        return mobile;
    }

    @Override
    public String getE_mail() {
        return E_mail;
    }

    @Override
    public String getUsername() {
        return Username;
    }

    @Override
    public String getPassword() {
        return Password;
    }

    @Override
    public void setE_mail(String e_mail) {
        E_mail = e_mail;
    }

    @Override
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public void setUsername(String username) {
        Username = username;
    }

    @Override
    public void setSTATE(userState STATE) {
        STATE = userState.PENDING;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "state=" + state +
                ", Username='" + Username + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }
    void display(){
        for (int i=0;i<DriversList.getInstance().ListOfDrivers.size();i++){
            System.out.println(DriversList.getInstance().ListOfDrivers.get(i));
        }
    }
}