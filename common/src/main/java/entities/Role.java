package entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "roles")
@Setter
@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;

    @Column(length = 40, nullable = false, unique = true)
    private String name;

    @Column(length = 150, nullable = true)
    private String description;
}
