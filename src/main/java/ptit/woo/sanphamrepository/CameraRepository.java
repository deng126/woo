package ptit.woo.sanphamrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ptit.woo.model.Camera;

@Repository
public interface CameraRepository extends JpaRepository<Camera,Long> {
}
