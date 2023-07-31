package ptit.woo.sanphamservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ptit.woo.model.PhuKien;
import ptit.woo.sanphamrepository.PhuKienRepository;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Service
public class PhuKienServiceImpl implements PhuKienService {

    @Autowired
    PhuKienRepository phuKienRepository;
    @Override
    public void save(PhuKien pk) {
        phuKienRepository.save(pk);
    }

    @Override
    public List<PhuKien> findAll() {
        return phuKienRepository.findAll();
    }

    @Override
    public Optional<PhuKien> findPkById(Long id) {
        return phuKienRepository.findById(id);
    }

    @Override
    public void deletePKById(Long id) throws SQLException {
        phuKienRepository.deleteById(id);
    }
}
