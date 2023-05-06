package guru.springframework.spring5webapp.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String addressLine1;
    private String city;
    private String state;
    private String zip;
    
    @OneToMany
    @JoinColumn(name="publisher_id")
    private Set<Book> books = new HashSet<>();



}
