package guru.springframework.spring5webapp.domain;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String  lastName;
    @ManyToMany(mappedBy="authors")
    private Set<Book> books = new HashSet<>();;
    
    public  Author(String firstname, String lastName) {
        this.firstName = firstname;
        this.lastName = lastName;
    }
 

}
