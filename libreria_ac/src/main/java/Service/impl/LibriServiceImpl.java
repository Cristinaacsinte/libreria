package Service.impl;

import Service.LibriService;
import entity.Libri;
import exeption.IdMustBeNullException;
import exeption.IdMustNotBeNullException;
import repository.LibriRepository;

import java.util.List;

public class LibriServiceImpl implements LibriService {
    LibriRepository libriRepository;
    @Override
    public List<Libri> findAll() {
        return libriRepository.findAll();
    }

    @Override
    public Libri insert(Libri libri) {
        if(libri.getId() != null){
            throw new IdMustBeNullException();
        }
        return libriRepository.save(libri);
    }

    @Override
    public Libri update(Libri libri) {
        if(libri.getId() == null){
            throw new IdMustNotBeNullException();
        }
        return libriRepository.save(libri);
    }

    @Override
    public Boolean deleteById(String idLibri) {
        libriRepository.deleteById(idLibri);
        return libriRepository.findById(idLibri).isEmpty();
    }

    @Override
    public Libri findById(String idLibri) {
        return libriRepository.findById(idLibri).orElse(Libri.builder().build());
    }
}
