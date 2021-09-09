package entities;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false, unique = true, length = 50)
    private String email;
    @Column(nullable = false, length = 50)
    private String password;
    @Column(name = "first_name", nullable = false, unique = true, length = 50)
    private String firstName;
    @Column(name = "last_name", nullable = false, unique = true, length = 50)
    private String lastName;
    private boolean enabled;
}
