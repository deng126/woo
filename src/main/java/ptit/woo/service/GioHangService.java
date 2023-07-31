package ptit.woo.service;


import org.springframework.stereotype.Service;
import ptit.woo.model.giohang.GioHang;

@Service
public interface GioHangService {
    GioHang findAllGioHangActive(Long id);
}
