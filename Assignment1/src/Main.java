public class Main {
    public static void main(String []args){
        CustomersList obj = CustomersList.getInstance();
        Administrator admin = Administrator.getInstance();


        Driver D = new Driver();
        D.setUsername("Driver1");
        D.setMobile("01125372118");
        D.setPassword("1722");
        D.setE_mail("Ahmed@gmail.com");

        Registration.SignUp(D);
        admin.Approve(D);

        Customer customer = new Customer();
        customer.setUsername("Ahmed");
        customer.setMobile("01125372118");
        customer.setCustomer_rate(5);
        customer.setPassword("1762");
        customer.setE_mail("Ahmed@gmail.com");

        Registration.SignUp(customer);

        Driver D2 = new Driver();
        D2.setUsername("Driver2");
        D2.setMobile("01125372118");
        D2.setPassword("1722");
        D2.setE_mail("Ahmed@gmail.com");

        Registration.SignUp(D2);
        admin.Approve(D2);

        Driver D3 = new Driver();
        D3.setUsername("Driver2");
        D3.setMobile("01125372118");
        D3.setPassword("1722");
        D3.setE_mail("Ahmed@gmail.com");

        Registration.SignUp(D3);
        admin.Approve(D3);

        Driver D4 = new Driver();
        D4.setUsername("Driver2");
        D4.setMobile("01125372118");
        D4.setPassword("1722");
        D4.setE_mail("Ahmed@gmail.com");

        Registration.SignUp(D4);
        admin.Approve(D4);

        Driver D5 = new Driver();
        D5.setUsername("Driver2");
        D5.setMobile("01125372118");
        D5.setPassword("1722");
        D5.setE_mail("Ahmed@gmail.com");

        Registration.SignUp(D5);
        admin.Approve(D5);


        System.out.println(customer.getDrivers());


    }
}
