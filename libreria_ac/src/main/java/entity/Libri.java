package entity;

import dto.LibriDTO;
import dto.archetype.Dto;
import dto.archetype.Model;
import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "libri")
public class Libri implements Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    @Column(name = "isbn")
    String isbn;

    @Column(name = "titolo")
    String titolo;

    @ManyToOne
    @JoinColumn(name = "id")
    private CasaEditrice casaEditrice;

    @ManyToOne
    @JoinColumn(name = "id")
    private Autori autori;


    @Override
    public Dto toDto() {
        return LibriDTO
                .builder()
                .id(id)
                .titolo(titolo)
                .isbn(isbn)
                .build();
    }
}
