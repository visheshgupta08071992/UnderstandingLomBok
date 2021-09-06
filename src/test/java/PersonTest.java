import lombok.Builder;
import org.testng.annotations.Test;

public class PersonTest {

    @Test
    public void testPerson(){
        Person P1=Person.builder().name("Sahil").address("Mumbai").age(30).build();
        Person P2=Person.builder().name("Rohan").build();
        System.out.println(P1.getName() + " " + P1.getAge() + " " + P1.getAddress());
        System.out.println(P2.getName() + " " + P2.getAge() + " " + P2.getAddress());
    }
}
