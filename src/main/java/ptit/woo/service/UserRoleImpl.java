package ptit.woo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ptit.woo.repository.UserRoleRepository;
import ptit.woo.model.UserRole;

import java.util.Optional;

@Service
public class UserRoleImpl implements UserRoleService{
    @Autowired
    UserRoleRepository userRoleRepository;
    @Override
    public Optional<UserRole> findById(Long id) {
        return userRoleRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        userRoleRepository.deleteById(id);
    }
}
