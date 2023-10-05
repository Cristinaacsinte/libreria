package Service.impl;

import Service.CasaEditriceService;
import entity.CasaEditrice;
import exeption.IdMustBeNullException;
import exeption.IdMustNotBeNullException;
import repository.CasaEditriceRepository;

import java.util.List;

public class CasaEditriceServiceImpl implements CasaEditriceService {
    CasaEditriceRepository casaEditriceRepository;
    @Override
    public List<CasaEditrice> findAll() {
        return casaEditriceRepository.findAll();
    }

    @Override
    public CasaEditrice insert(CasaEditrice casaEditrice) {
        if(casaEditrice.getId() != null){
            throw new IdMustBeNullException();
        }
        return casaEditriceRepository.save(casaEditrice);
    }

    @Override
    public CasaEditrice update(CasaEditrice casaEditrice) {
        if(casaEditrice.getId() == null){
            throw new IdMustNotBeNullException();
        }
        return casaEditriceRepository.save(casaEditrice);
    }

    @Override
    public Boolean deleteById(Long idCasaEditrice) {
        casaEditriceRepository.deleteById(idCasaEditrice);
        return casaEditriceRepository.findById(idCasaEditrice).isEmpty();
    }

    @Override
    public CasaEditrice findById(Long idCasaEditrice) {
        return casaEditriceRepository.findById(idCasaEditrice).orElse(CasaEditrice.builder().build());
    }
}
