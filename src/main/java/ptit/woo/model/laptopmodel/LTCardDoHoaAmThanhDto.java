package ptit.woo.model.laptopmodel;

import lombok.Data;

@Data
public class LTCardDoHoaAmThanhDto {
    private Long id;
    private String cardDoHoa;
    private String cardAmThanh;

    public LTDoHoaVaAmThanh convertToEntity(){
        LTDoHoaVaAmThanh a = new LTDoHoaVaAmThanh();
        a.setId(this.id);
        a.setCardAmThanh(this.cardAmThanh);
        a.setCardDoHoa(this.cardDoHoa);
        return a;
    }
}
