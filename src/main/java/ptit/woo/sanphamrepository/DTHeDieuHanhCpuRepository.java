package ptit.woo.sanphamrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ptit.woo.model.DTHeDieuHanhCPU;

@Repository
public interface DTHeDieuHanhCpuRepository extends JpaRepository<DTHeDieuHanhCPU,Long> {
}
