import java.util.ArrayList;

public class Driver implements Idriver {
    userState state=userState.PENDING;
    private String license;
    private String national_id;
    private ArrayList<String>fav_area=new ArrayList<String>();
    private ArrayList<Integer>ratings=new ArrayList<Integer>();
    private ArrayList<User>notification=new ArrayList<User>();
    Offer offer;

    @Override
    public User Login() {
        return null;
    }

    @Override
    public void Register() {

    }

    @Override
    public void Update() {

    }
}