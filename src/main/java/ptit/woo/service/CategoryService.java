package ptit.woo.service;

import org.springframework.stereotype.Service;
import ptit.woo.model.Category;

import java.util.List;
import java.util.Optional;

@Service
public interface CategoryService {
    void saveCategory(Category c);
    void deleteCategoryById(Long id);
    List<Category> findAll();
    Optional<Category> findById(Long id);
    Category findCategoryByDt(Long id);
    Category findCategoryByLt(Long id);
}
