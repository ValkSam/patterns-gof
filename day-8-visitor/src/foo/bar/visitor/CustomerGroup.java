package foo.bar.visitor;

import java.util.ArrayList;
import java.util.List;

public class CustomerGroup implements IVisitable {

    private List<Customer> customers = new ArrayList<Customer>();

    public void accept(IVisitor visitor) {
        for (Customer c : customers) {
            c.accept(visitor);
        }
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

}
