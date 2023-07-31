package ptit.woo.dto.giohangdto;

import lombok.Data;
import ptit.woo.dto.KhachHangDto;

import java.util.List;

@Data
public class GioHangDTO {
    private Long id;

    private KhachHangDto khachHangDTO;

    private List<GioHangSanPhamDTO> gioHangSanPhamDTOS;

    private String tongTien;

    private String tongCong;
}
