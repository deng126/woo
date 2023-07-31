package ptit.woo.sanphamservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ptit.woo.model.Image;
import ptit.woo.sanphamrepository.ImageRepositoryCustom;

import java.util.Optional;

@Service
public class ImageServiceImpl implements ImageService{
    @Autowired
    ImageRepositoryCustom imageRepository;

    @Override
    public void deleteById(Long id) {
        imageRepository.deleteById(id);
    }

    @Override
    public void delete(Image img) {
        imageRepository.delete(img);
    }

    @Override
    public Optional<Image> findById(Long id) {
        return imageRepository.findById(id);
    }
}
