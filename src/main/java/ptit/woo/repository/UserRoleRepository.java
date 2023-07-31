package ptit.woo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ptit.woo.model.NguoiDung;
import ptit.woo.model.UserRole;

import java.util.List;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole,Long> {
    List<UserRole> findByidUser(NguoiDung idUser);
}
