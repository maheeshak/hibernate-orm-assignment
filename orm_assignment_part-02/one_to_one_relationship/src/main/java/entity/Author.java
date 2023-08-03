package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Author {

    @Id
    private String author_id;
    private String name;
    private String email;

    @OneToOne
    private Book book;

}
