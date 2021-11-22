public class DriversList {
    private DriversList instanceOFDriversList;

    private DriversList(){
        instanceOFDriversList = new DriversList();
    }

    public DriversList getInstance(){
        if(instanceOFDriversList == null) return instanceOFDriversList = new DriversList();
        else return instanceOFDriversList;
    }
}
