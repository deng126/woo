package ptit.woo.sanphamrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ptit.woo.model.SanPham;

@Repository
public interface SanPhamRepository extends JpaRepository<SanPham,Long> {
//    @Modifying
//    @Transactional
//    @Query(value = "UPDATE sanpham s SET s.khuyenmai_id = ?1 WHERE s.id = ?2",nativeQuery = true)
//    void updateKMSP(Long idKm,Long idSp);

}
