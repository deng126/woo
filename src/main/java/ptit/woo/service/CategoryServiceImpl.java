package ptit.woo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ptit.woo.repository.CategoryReponsitory;
import ptit.woo.model.Category;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    CategoryReponsitory categoryReponsitory;
    @Override
    public void saveCategory(Category c) {
        categoryReponsitory.save(c);
    }

    @Override
    public void deleteCategoryById(Long id) {
        categoryReponsitory.deleteById(id);
    }

    @Override
    public List<Category> findAll() {
       return categoryReponsitory.findAll();
    }

    @Override
    public Optional<Category> findById(Long id) {
        Optional<Category> category = categoryReponsitory.findById(id);
        return category;
    }
    @Override
    public Category findCategoryByDt(Long id) {
        return categoryReponsitory.searchCategoryByDt(id);
    }
    @Override
    public Category findCategoryByLt(Long id) {
        return categoryReponsitory.searchCategoryByLt(id);
    }
}
