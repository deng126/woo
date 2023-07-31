package ptit.woo.service;

import org.springframework.stereotype.Service;
import ptit.woo.model.Role;

import java.util.Optional;

@Service
public interface RoleService {
    Optional<Role> findById(long id);

}
