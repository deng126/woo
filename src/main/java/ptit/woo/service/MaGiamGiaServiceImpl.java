package ptit.woo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ptit.woo.repository.MaGiamGiaRepository;
import ptit.woo.model.maGiamGia.MaGiamGia;

import java.util.List;
import java.util.Optional;

@Service
public class MaGiamGiaServiceImpl implements MaGiamGiaService{
    @Autowired
    MaGiamGiaRepository maGiamGiaRepository;
    @Override
    public List<MaGiamGia> findAll() {
        return maGiamGiaRepository.findAll();
    }

    @Override
    public Optional<MaGiamGia> findById(Long id) {
        return maGiamGiaRepository.findById(id);
    }

    @Override
    public void save(MaGiamGia m) {
        maGiamGiaRepository.save(m);
    }

    @Override
    public void delete(Long id) {
        maGiamGiaRepository.deleteById(id);
    }
}
