import java.util.ArrayList;

public class DriversList {
    private static DriversList instanceOFDriversList;
    ArrayList<Driver> ListOfDrivers = new ArrayList<>();

    private DriversList(){
        instanceOFDriversList = new DriversList();
    }

    public DriversList getInstance(){
        if(instanceOFDriversList == null) return instanceOFDriversList = new DriversList();
        else return instanceOFDriversList;
    }
}
