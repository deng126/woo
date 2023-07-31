package ptit.woo.sanphamrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ptit.woo.model.Image;

@Repository
public interface ImageRepositoryCustom extends JpaRepository<Image,Long>{
    @Override
    void deleteById(Long aLong);
}
