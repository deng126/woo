package ptit.woo.sanphamrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ptit.woo.model.PhuKien;

@Repository
public interface PhuKienRepository extends JpaRepository<PhuKien, Long> {
}
