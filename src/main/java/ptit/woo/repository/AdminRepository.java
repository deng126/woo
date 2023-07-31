package ptit.woo.repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import ptit.woo.model.Admin;

import java.util.List;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    Admin findByName(String name);

    @Override
    List<Admin> findAll(Sort sort);

}
