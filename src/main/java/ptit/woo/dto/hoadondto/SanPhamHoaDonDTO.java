package ptit.woo.dto.hoadondto;

import lombok.Data;
import ptit.woo.model.hoadon.HoaDon;

@Data
public class SanPhamHoaDonDTO {
    private long id;

    private String masp;

    private String tenSp;

    private String gia;

    private int soLuong;

    private String hang;

    private String images;

    private String color;

    private String tong;

    private HoaDon hoaDon;
}
