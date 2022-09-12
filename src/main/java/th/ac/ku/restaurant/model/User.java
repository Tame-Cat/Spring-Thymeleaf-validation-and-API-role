package th.ac.ku.restaurant.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Data // gen getter and setter รวมถึง tostring ให้อัตโนมัติ
@NoArgsConstructor //gen constructer ให้
@Entity
public class User {
    @Id
    @GeneratedValue
    private UUID id; //id จะสร้างให้อัตโนมัติ

    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String role;
    private String email;

}
