package ptit.woo.dto.laptopdto;

import lombok.Data;
import ptit.woo.model.laptopmodel.KetNoiLT;

@Data
public class KetNoiLTDto {
    private Long id;
    private String congGiaoTiep;
    private String ketNoiKhongDay;
    private String denBanPhim;

    public KetNoiLT convertToEntity(){
        KetNoiLT k = new KetNoiLT();
        k.setId(this.id);
        k.setCongGiaoTiep(this.congGiaoTiep);
        k.setKetNoiKhongDay(this.ketNoiKhongDay);
        k.setDenBanPhim(this.denBanPhim);
        return k;
    }
}
