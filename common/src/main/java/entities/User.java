package entities;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
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

    @ManyToOne
    @JoinTable(
            name = "user_roles",
            joinColumns = @JoinColumn(name = "role_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private Set<Role> roles = new HashSet<>();
}
