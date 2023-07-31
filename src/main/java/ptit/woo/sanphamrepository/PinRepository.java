package ptit.woo.sanphamrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ptit.woo.model.Pin;

@Repository
public interface PinRepository extends JpaRepository<Pin,Long> {
}
