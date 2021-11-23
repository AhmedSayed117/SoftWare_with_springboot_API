public class Administrator {
    private static Administrator instanceOFAdministrator = null;
    private Administrator(){

    }

    public static Administrator getInstance(){
        if(instanceOFAdministrator == null) return instanceOFAdministrator = new Administrator();
        else return instanceOFAdministrator;
    }

    public void Approve(Driver obj){
        obj.setState(userState.ACTIVE);
    }

    public void Blocked(Driver obj){
        obj.setState(userState.BLOCKED);
    }

}