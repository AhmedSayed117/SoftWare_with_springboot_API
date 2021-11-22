public class CustomersList {
    private CustomersList instanceOFCustomersList;

    private CustomersList(){
        instanceOFCustomersList = new CustomersList();
    }

    public CustomersList getInstance(){
        if(instanceOFCustomersList == null) return instanceOFCustomersList = new CustomersList();
        else return instanceOFCustomersList;
    }
}
