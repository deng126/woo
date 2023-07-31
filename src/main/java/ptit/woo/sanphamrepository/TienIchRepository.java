package ptit.woo.sanphamrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ptit.woo.model.TienIch;

@Repository
public interface TienIchRepository extends JpaRepository<TienIch,Long> {
}
