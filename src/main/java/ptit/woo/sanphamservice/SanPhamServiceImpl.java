package ptit.woo.sanphamservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ptit.woo.model.DienThoai;
import ptit.woo.sanphamrepository.SanphamRepository2;

import java.util.List;

@Service
public class SanPhamServiceImpl implements SanPhamService {
    @Autowired
    SanphamRepository2 sanPhamRepository;
    @Override
    public List<DienThoai> searhFlashSale() {
        return sanPhamRepository.searchFlashDeals();
    }
}
