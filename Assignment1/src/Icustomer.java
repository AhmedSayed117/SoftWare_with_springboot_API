import java.util.ArrayList;

public interface Icustomer extends User {
    ArrayList<Idriver> Drivers =new ArrayList<>();
    public void subscribe(Idriver obj);
    public void unsubscribe(Idriver obj);
    public void Notify(String message);
}
