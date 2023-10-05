package Service;

import entity.Libri;

import java.util.List;

public interface LibriService {
    List<Libri> findAll();

    Libri insert(Libri libri);

    Libri update(Libri libri);

    Boolean deleteById(String idLibri);

    Libri findById(String idLibri);
}
