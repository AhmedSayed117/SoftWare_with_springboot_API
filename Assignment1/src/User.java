public interface User {
    String mobile = "";
    String Username = "";
    String E_mail = "";
    String Password = "";
    userState STATE = userState.ACTIVE;//

    public User Login();
    public void register();
}
