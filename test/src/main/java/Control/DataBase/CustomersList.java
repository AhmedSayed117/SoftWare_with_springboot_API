package Control.DataBase;

import User.Customer.Customer;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CustomersList {
    private static CustomersList instanceOFCustomersList = null;
    public ArrayList<Customer> ListOfCustomer = new ArrayList<>();


    private CustomersList(){

    }

    @GetMapping(value = "/customer")
    public static CustomersList getInstance(){
        System.out.println("Customer here");
        if(instanceOFCustomersList == null) instanceOFCustomersList = new CustomersList();
        return instanceOFCustomersList;
    }

}
