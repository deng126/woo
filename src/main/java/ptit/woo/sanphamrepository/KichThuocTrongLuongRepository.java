package ptit.woo.sanphamrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ptit.woo.model.KichThuocTrongLuong;

@Repository
public interface KichThuocTrongLuongRepository extends JpaRepository<KichThuocTrongLuong,Long> {
}
