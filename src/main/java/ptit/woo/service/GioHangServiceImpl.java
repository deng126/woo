package ptit.woo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ptit.woo.repository.GioHangRepository;
import ptit.woo.model.giohang.GioHang;

@Service
public class GioHangServiceImpl implements GioHangService{
    @Autowired
    GioHangRepository gioHangRepository;
    @Override
    public GioHang findAllGioHangActive(Long id) {
        return gioHangRepository.findAllGioHangActive(id);
    }
}
