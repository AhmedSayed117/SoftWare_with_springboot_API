package Control;
import Control.DataBase.Events;
import User.User;
import User.userState;

public class Administrator {
    private Events events=Events.getInstance();
    private static Administrator instanceOFAdministrator = null;
    private Administrator(){

    }

    public static Administrator getInstance(){
        if(instanceOFAdministrator == null) return instanceOFAdministrator = new Administrator();
        else return instanceOFAdministrator;
    }

    public void Approve(User obj){
        obj.setSTATE(userState.ACTIVE);
    }

    public void Blocked(User obj){
        obj.setSTATE(userState.BLOCkED);
    }

    public void viewLog(){
        events.showEvents(events.selectEvent());


    }

}