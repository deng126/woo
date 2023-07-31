package ptit.woo.sanphamrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ptit.woo.model.ManHinh;

@Repository
public interface ManHinhRepository extends JpaRepository<ManHinh,Long> {
}
