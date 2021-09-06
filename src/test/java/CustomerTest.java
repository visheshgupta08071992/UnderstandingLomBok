import org.testng.annotations.Test;

public class CustomerTest {

    @Test
    public void testCustomer(){
        Customer customer=new Customer();
        Customer customer1=new Customer("Vishesh","Pune",25,true);
        customer.setAge(20);
        System.out.println(customer.getAge());
        System.out.println(customer1.getName());
    }
}
