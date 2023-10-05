package Service.impl;

import Service.AutoriService;
import entity.Autori;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class AutoriServiceImpl implements AutoriService {
    @Override
    public List<Autori> findAll() {
        return null;
    }

    @Override
    public Autori insert(Autori autori) {
        return null;
    }

    @Override
    public Autori update(Autori autori) {
        return null;
    }

    @Override
    public Boolean deleteById(Long idAutori) {
        return null;
    }

    @Override
    public Autori findById(Long idAutori) {
        return null;
    }
}
