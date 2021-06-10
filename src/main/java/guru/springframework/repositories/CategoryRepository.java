package guru.springframework.repositories;

import guru.springframework.domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by developer on 2021-06-09.
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
