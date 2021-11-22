import java.util.ArrayList;

public interface Icustomer {
    ArrayList<Idriver>Drivers =new ArrayList<>();
    public void subscribe(Idriver obj);
    public void unsubscribe(Idriver obj);
    public void Notify(Idriver obj);
}
