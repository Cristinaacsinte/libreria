package Service;

import entity.Autori;

import java.util.List;

public interface CasaEditrice {
    List<CasaEditrice> findAll();

    CasaEditrice insert(CasaEditrice casaEditrice);

    CasaEditrice update(CasaEditrice casaEditrice);

    Boolean deleteById(Long idCasaEditrice);

    CasaEditrice findById(Long idCasaEditrice);
}
