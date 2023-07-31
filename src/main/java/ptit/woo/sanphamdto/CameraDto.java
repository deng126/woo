package ptit.woo.sanphamdto;

import lombok.Data;
import ptit.woo.model.Camera;

@Data
public class CameraDto {
    private Long id;
    private String loai;
    private String doPhanGiaiCamera;
    private String tinhNang;
    private DienThoaiDto dienThoaiDto;
    public Camera convertToEntity(){
        Camera c = new Camera();
        c.setId(this.id);
        c.setLoai(this.loai);
        c.setDoPhanGiaiCamera(this.doPhanGiaiCamera);
        c.setTinhNang(this.tinhNang);
        return c;
    }
}
