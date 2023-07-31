package ptit.woo.sanphamrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ptit.woo.model.DTKetNoi;

@Repository
public interface DTKetNoiRepository extends JpaRepository<DTKetNoi,Long> {
}
