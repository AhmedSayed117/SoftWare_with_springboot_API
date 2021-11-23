public class Main {
    public static void main(String []args){
        CustomersList obj = CustomersList.getInstance();
        Administrator admin = Administrator.getInstance();

        Customer customer = new Customer();
        customer.setUsername("Ahmed");
        customer.setMobile("01125372118");
        customer.setCustomer_rate(5);
        customer.setPassword("1762");
        customer.setE_mail("Ahmed@gmail.com");

        Customer customer1 = new Customer();
        customer1.setUsername("Zeyad");
        customer1.setMobile("01125372118");
        customer1.setCustomer_rate(5);
        customer1.setPassword("1722");
        customer1.setE_mail("Ahmed@gmail.com");

        Registration.SignUp(customer1);
        Registration.SignUp(customer);

        Driver D = new Driver();
        D.setUsername("Zeyad");
        D.setMobile("01125372118");
        D.setPassword("1722");
        D.setE_mail("Ahmed@gmail.com");

//        Registration.SignIn(customer1,"Zeyad","1722");
        Registration.SignUp(D);
        Registration.SignIn(D,"Zeyad","1722");

        admin.Approve(D);
        Registration.SignIn(D,"Zeyad","1722");
        admin.Blocked(D);
        Registration.SignIn(D,"Zeyad","1722");
        admin.Approve(D);
        Registration.SignIn(D,"Zeyad","1722");

//        System.out.println(obj.getListOfCustomer());

    }
}
