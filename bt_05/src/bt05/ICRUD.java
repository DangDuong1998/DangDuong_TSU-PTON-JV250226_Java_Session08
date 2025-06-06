package bt05;

import java.util.ArrayList;
import java.util.List;

public interface ICRUD {

    List<Category> findAll();
    void addCategory(Category category);
    void updateCategory(Category category);
    void deleteById(int id);

}
