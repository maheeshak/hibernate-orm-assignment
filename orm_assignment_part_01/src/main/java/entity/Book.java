package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Book {

    @Id
    private String book_id;
    private String book_title;
    private String book_isbn;

}
