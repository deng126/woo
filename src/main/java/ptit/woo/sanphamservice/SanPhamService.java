package ptit.woo.sanphamservice;

import org.springframework.stereotype.Service;
import ptit.woo.model.DienThoai;

import java.util.List;

@Service
public interface SanPhamService {
    List<DienThoai> searhFlashSale();
}
