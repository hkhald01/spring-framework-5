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
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String isbn;
    @ManyToMany
    @JoinTable(name="author_book", joinColumns = @JoinColumn(name="book_id") , inverseJoinColumns =@JoinColumn(name="author_id"))
    private Set<Author> authors = new HashSet<>();
    
    @ManyToOne
    private Publisher publisher; 
    public Book(String title, String isbn) {
        this.title=title;
        this.isbn=isbn;
    }
}
