package ptit.woo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ptit.woo.repository.GioHangSanPhamRepository;

@Service
public class GioHangSanPhamServiceImpl implements GioHangSanPhamService{
    @Autowired
    GioHangSanPhamRepository gioHangSanPhamRepository;
    @Override
    public void deleteProduct(Long id1) {
        gioHangSanPhamRepository.deleteProduct(id1);
    }

    @Override
    public void updateCart(Integer quantity,Long id1) {
        gioHangSanPhamRepository.updateGHSP(quantity,id1);
    }
}
