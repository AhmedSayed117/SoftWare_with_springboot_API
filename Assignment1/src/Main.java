public class Main {
    public static void main(String []args){
        CustomersList obj = CustomersList.getInstance();
        Administrator admin = Administrator.getInstance();


        Driver D = new Driver();
        D.setUsername("Driver1");
        D.setMobile("01125372118");
        D.setPassword("1722");
        D.setE_mail("Ahmed@gmail.com");

        Driver D2 = new Driver();
        D2.setUsername("Driver2");
        D2.setMobile("01125372118");
        D2.setPassword("1722");
        D2.setE_mail("Ahmed@gmail.com");

        Driver D3 = new Driver();
        D3.setUsername("Driver3");
        D3.setMobile("01125372118");
        D3.setPassword("1722");
        D3.setE_mail("Ahmed@gmail.com");

        Registration.SignUp(D);
        Registration.SignUp(D2);
        Registration.SignUp(D3);


        admin.Approve(D2);
        admin.Approve(D3);
        admin.Approve(D);



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


        System.out.println(customer1.getDrivers());


    }
}
