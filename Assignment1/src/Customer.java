public class Customer implements Icustomer {
    userState state = userState.ACTIVE;

    private  Request request;
    private int customer_rate;

    @Override
    public void subscribe(Idriver obj) {

    }

    @Override
    public void unsubscribe(Idriver obj) {

    }

    @Override
    public void Notify(Idriver obj) {

    }

    @Override
    public User Login() {
        return null;
    }

    @Override
    public void Register() {

    }
}