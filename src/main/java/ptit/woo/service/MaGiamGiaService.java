package ptit.woo.service;

import ptit.woo.model.maGiamGia.MaGiamGia;

import java.util.List;
import java.util.Optional;

public interface MaGiamGiaService {
    List<MaGiamGia> findAll();
    Optional<MaGiamGia> findById(Long id);
    void save(MaGiamGia m);
    void delete(Long id);
}
