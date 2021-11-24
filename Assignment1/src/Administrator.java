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
//        for (int i=0;i<CustomersList.getInstance().ListOfCustomer.size();i++)
//        {
//            CustomersList.getInstance().ListOfCustomer.get(i).subscribe(obj);
//        }
    }

    public void Blocked(Driver obj){
        obj.setState(userState.BLOCkED);
    }

}