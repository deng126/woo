package ptit.woo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ptit.woo.model.NguoiDung;

@Repository
public interface NguoiDungRepository extends JpaRepository<NguoiDung,Long> {
    NguoiDung findByEmail(String email);

}
