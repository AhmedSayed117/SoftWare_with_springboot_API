public class Main {
    public static void main(String []args){
        CustomersList obj = CustomersList.getInstance();

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

        Customer customer2 = new Customer();
        customer2.setUsername("Zeyad");
        customer2.setMobile("01125372118");
        customer2.setCustomer_rate(5);
        customer2.setPassword("1722");
        customer2.setE_mail("Ahmed@gmail.com");

        customer.Register(customer);
        customer1.Register(customer1);
        customer2.Register(customer2);
        //1-
        //2-login



         Registration.SignIn(customer1,"Ahmed","1762");

//        System.out.println(obj.getListOfCustomer());

    }
}
