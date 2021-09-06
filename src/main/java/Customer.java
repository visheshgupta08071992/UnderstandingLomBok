import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Customer {

    private String name;
    private String address;
    private int age;
    private boolean isActive;
}
