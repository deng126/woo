package ptit.woo.sanphamdto;

import lombok.Data;
import ptit.woo.model.TienIch;

@Data
public class TienIchDto {
    private Long id;
    private String baoMat;
    private String tinhNangDacBiet;

    public TienIch convertToEntity(){
        TienIch t = new TienIch();
        t.setId(this.id);
        t.setBaoMat(this.baoMat);
        t.setTinhNangDacBiet(this.tinhNangDacBiet);
        return t;
    }
}
