package ptit.woo.dto.giohangdto;

import lombok.Data;
import ptit.woo.sanphamdto.SanPhamDto;

@Data
public class GioHangSanPhamDTO {
    private Long id;

    private GioHangDTO gioHangDTO;

    private SanPhamDto sanPhamDTO;

    private int soLuong;

    private String tongTien;
}
