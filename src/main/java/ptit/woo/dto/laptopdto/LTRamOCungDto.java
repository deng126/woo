package ptit.woo.dto.laptopdto;

import lombok.Data;
import ptit.woo.model.laptopmodel.LTRamOCung;

@Data
public class LTRamOCungDto {
    private Long id;
    private String dungLuongRam;
    private String loaiRam;
    private String tocDoBus;
    private String hoTroToiDa;
    private String oCung;

    public LTRamOCung convertToEntity(){
        LTRamOCung t = new LTRamOCung();
        t.setId(this.id);
        t.setOCung(this.oCung);
        t.setDungLuongRam(this.dungLuongRam);
        t.setLoaiRam(this.loaiRam);
        t.setTocDoBus(this.tocDoBus);
        t.setHoTroToiDa(this.hoTroToiDa);
        return t;
    }
}
