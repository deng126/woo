package ptit.woo.dto.laptopdto;

import lombok.Data;
import ptit.woo.model.laptopmodel.ManHinhLT;

@Data
public class ManHinhLTDto {
    private Long id;
    private String kichThuoc;
    private String doPhanGiai;
    private String tanSoQuet;
    private String congNgheManHinh;

    public ManHinhLT convertToEntity(){
        ManHinhLT m = new ManHinhLT();
        m.setId(this.id);
        m.setKichThuoc(this.kichThuoc);
        m.setDoPhanGiai(this.doPhanGiai);
        m.setTanSoQuet(this.tanSoQuet);
        m.setCongNgheManHinh(this.congNgheManHinh);
        return m;
    }
}
