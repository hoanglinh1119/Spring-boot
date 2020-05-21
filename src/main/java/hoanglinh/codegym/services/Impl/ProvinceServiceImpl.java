package hoanglinh.codegym.services.Impl;

import hoanglinh.codegym.model.Province;
import hoanglinh.codegym.repositories.IProvinceRepository;
import hoanglinh.codegym.services.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ProvinceServiceImpl implements ProvinceService {
    @Autowired
    private IProvinceRepository provinceRepository;
    @Override
    public Iterable<Province> findAll() {
        return provinceRepository.findAll();
    }

    @Override
    public Optional<Province> findById(Long id) {
        return provinceRepository.findById(id);
    }

    @Override
    public void save(Province province) {
       provinceRepository.save(province);
    }

    @Override
    public void remove(Long id) {
      provinceRepository.deleteById(id);
    }
}
