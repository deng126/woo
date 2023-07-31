package ptit.woo.sanphamrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ptit.woo.model.DTBoNho;

@Repository
public interface DTBoNhoRepository extends JpaRepository<DTBoNho,Long> {
}
