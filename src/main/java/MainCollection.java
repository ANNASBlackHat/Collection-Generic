import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class MainCollection {

    public static void main(String[] args) {
        List data = new ArrayList();
        data.add("toko");
        data.add("toko2");
        data.add("toko3");
        data.add(1);
//        String toko1 = (String) data.get(3);

        List<String> customerList = new ArrayList();
        customerList.add("BUdi");

        List customer2 = customerList;
//        customer2.add(3);

//        String customer1 = customerList.get(1);

        List<Customer> customers = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Customer customer = new Customer();
            customer.setName("NAME "+i);
            customers.add(customer);
        }

        //cara loop data array
        for (int i = 0; i < customers.size(); i++) {
            Customer c = customers.get(i);
        }

        for(Customer c : customers){
            System.out.println(c.getName());
        }

        Iterator<Customer> iterator =  customers.iterator();
        while (iterator.hasNext()){
            Customer c = iterator.next();
        }


    }
}
