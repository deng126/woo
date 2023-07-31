package ptit.woo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ptit.woo.repository.AdminRepository;
import ptit.woo.model.Admin;

import java.util.List;
import java.util.Optional;

@Service
public class AdminServiceImpl implements AdminService{
    @Autowired
    AdminRepository adminRepository;

    @Override
    public Optional<Admin> findById(Long id) {
        return adminRepository.findById(id);
    }

    @Override
    public Admin loadAdminByName(String name) {
        return adminRepository.findByName(name);
    }

    @Override
    public List<Admin> findAllAdmin() {
        return adminRepository.findAll();
    }

    @Override
    public void deleteAdminById(Long id) {
        adminRepository.deleteById(id);
    }

    @Override
    public void editAdminById(Admin admin) {
        adminRepository.save(admin);
    }
}
