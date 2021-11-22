public class Administrator {
    private Administrator instanceOFAdministrator;

    private Administrator(){
        instanceOFAdministrator = new Administrator();
    }

    public Administrator getInstance(){
        if(instanceOFAdministrator == null) return instanceOFAdministrator = new Administrator();
        else return instanceOFAdministrator;
    }


}