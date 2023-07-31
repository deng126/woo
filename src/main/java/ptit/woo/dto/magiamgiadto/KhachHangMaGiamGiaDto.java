package ptit.woo.dto.magiamgiadto;

import lombok.Data;
import ptit.woo.dto.KhachHangDto;
import ptit.woo.model.maGiamGia.KhachHangMaGiamGia;

@Data
public class KhachHangMaGiamGiaDto {

    private Long id;

    private KhachHangDto khachHangDto;

    private MaGiamGiaDto maGiamGiaDto;

    private boolean trangThai;

    public KhachHangMaGiamGia convertToEntity(){
        KhachHangMaGiamGia khachHangMaGiamGia = new KhachHangMaGiamGia();
        khachHangMaGiamGia.setId(this.id);
        khachHangMaGiamGia.setKhachHang(this.khachHangDto.convertToEntity());
        khachHangMaGiamGia.setMaGiamGia(this.maGiamGiaDto.convertToEntity());
        khachHangMaGiamGia.setTrangThai(this.trangThai);
        return khachHangMaGiamGia;
    }
}
