package ptit.woo.sanphamservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ptit.woo.repository.KhuyenMaiRepository;
import ptit.woo.model.KhuyenMai;
import ptit.woo.sanphamrepository.SanPhamRepository;

import java.util.List;
import java.util.Optional;

@Service
public class KhuyenMaiServiceImpl implements KhuyenMaiService{
    @Autowired
    KhuyenMaiRepository khuyenMaiRepository;
    @Autowired
    SanPhamRepository sanPhamRepository;
    @Override
    public List<KhuyenMai> findAll() {
        return khuyenMaiRepository.findAll();
    }

    @Override
    public Optional<KhuyenMai> findKMById(Long id) {
        return khuyenMaiRepository.findById(id);
    }

    @Override
    public void addKm(KhuyenMai khuyenMai) {
        khuyenMaiRepository.save(khuyenMai);
    }

    @Override
    public void deleteKMById(Long id) {
        khuyenMaiRepository.deleteById(id);
    }
//
//    @Override
//
//    public void updateKMSP(Long idKm, Long idSp) {
//        sanPhamRepository.updateKMSP(idKm,idSp);
//    }

}
