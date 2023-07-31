package ptit.woo.sanphamdto;

import lombok.Data;
import ptit.woo.model.Image;

@Data
public class ImageDto {
    private Long id;
    private String urlImg;
    public Image convertToEntity(){
        Image a = new Image();
        a.setId(this.id);
        a.setUrlImg(this.urlImg);
        return a;
    }
}
