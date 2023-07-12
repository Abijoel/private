package org.example;



public class _Consumer {
    public static void main(String[] args) {
        Customer joel = new Customer("Joel", "09023224007");
        greetCustomer(joel);

        greetCustomerConsumer.accept(joel);



    }
    static Consumer<Customer> greetCustomerConsumer = customer ->
        System.out.println("Hello " + customer.customername
               + ", thank for registring phone number   "
               + customer.customerphonenumber);

    static void greetCustomer(Customer customer){
        System.out.println("Hello " + customer.customername 
                + ", thank for registring phone number   "
                + customer.customerphonenumber);
    }
    static class Customer {
        private final String customername;
        private final String customerphonenumber;
        Customer(String customername, String custpmerphonenumber){
            this.customername =customername;
            this.customerphonenumber = custpmerphonenumber;
        }
    }

}