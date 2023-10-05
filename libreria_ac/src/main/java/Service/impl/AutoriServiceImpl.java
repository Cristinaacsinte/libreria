package Service.impl;

import Service.AutoriService;
import entity.Autori;
import exeption.IdMustBeNullException;
import exeption.IdMustNotBeNullException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import repository.AutoriRepository;

import java.util.List;


@Service
@AllArgsConstructor
public class AutoriServiceImpl implements AutoriService {
    AutoriRepository autoriRepository;
    @Override
    public List<Autori> findAll() {
        return autoriRepository.findAll();
    }

    @Override
    public Autori insert(Autori autori) {
        if(autori.getId() != null){
            throw new IdMustBeNullException();
        }
        return autoriRepository.save(autori);
    }

    @Override
    public Autori update(Autori autori) {
        if(autori.getId() == null){
            throw new IdMustNotBeNullException();
        }
        return autoriRepository.save(autori);
    }

    @Override
    public Boolean deleteById(Long idAutori) {
        autoriRepository.deleteById(idAutori);
        return autoriRepository.findById(idAutori).isEmpty();
    }

    @Override
    public Autori findById(Long idAutori) {
        return autoriRepository.findById(idAutori).orElse(Autori.builder().build());
    }
}
