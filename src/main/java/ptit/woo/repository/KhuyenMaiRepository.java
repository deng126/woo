package ptit.woo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ptit.woo.model.KhuyenMai;

@Repository
public interface KhuyenMaiRepository extends JpaRepository<KhuyenMai,Long> {
}
