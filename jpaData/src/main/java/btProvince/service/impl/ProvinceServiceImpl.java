package btProvince.service.impl;

import btProvince.model.Province;
import btProvince.repository.ProvinceRepository;
import btProvince.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

public class ProvinceServiceImpl implements ProvinceService {
    @Autowired
    private ProvinceRepository provinceRepository;
    public Iterable<Province> findAll(){
        return provinceRepository.findAll();
    }
    @Override
    public Province findById(Long id){
        return provinceRepository.findOne(id);
    }
    @Override
    public void save (Province province){
        provinceRepository.save(province);
    }
    @Override
    public void remove(Long id){
        provinceRepository.delete(id);
    }
}
