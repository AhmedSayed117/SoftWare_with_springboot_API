import java.util.ArrayList;

public class Driver implements Idriver,User {
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
        boolean found =false;

        for (int i=0;i<DriversList.getInstance().ListOfDrivers.size();i++){
            if(DriversList.getInstance().ListOfDrivers.get(i).getUsername().equals(obj.getUsername())){

                found=true;

            }

        }
        if (!found){
            DriversList.getInstance().ListOfDrivers.add(obj);


        }
        else
            System.out.println("username already exists");


    }





    @Override
    public void Update( ) {


    }

    public void setUsername(String username) {
        Username = username;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setE_mail(String e_mail) {
        E_mail = e_mail;
    }

    public String getPassword() {
        return Password;
    }

    public String getUsername() {
        return Username;
    }

    public String getMobile() {
        return mobile;
    }

    public String getE_mail() {
        return E_mail;
    }

    public userState getState() {
        return state;
    }

    public void setState(userState state) {
        this.state = state;
    }

}