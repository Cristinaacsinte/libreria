package repository;

import entity.Libri;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibriRepository extends JpaRepository<Libri,Long> {
}
