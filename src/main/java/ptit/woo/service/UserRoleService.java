package ptit.woo.service;

import org.springframework.stereotype.Service;
import ptit.woo.model.UserRole;

import java.util.Optional;

@Service
public interface UserRoleService {

    Optional<UserRole> findById(Long id);
    void deleteById(Long id);
}
