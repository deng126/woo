package ptit.woo.service;

import org.springframework.stereotype.Service;
import ptit.woo.model.Admin;

import java.util.List;
import java.util.Optional;

@Service
public interface AdminService {
    Optional<Admin> findById(Long id);
    Admin loadAdminByName(String username);
    List<Admin> findAllAdmin();
    void deleteAdminById(Long id);
    void editAdminById(Admin admin);
}
