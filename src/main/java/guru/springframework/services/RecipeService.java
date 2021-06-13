package guru.springframework.services;

import guru.springframework.domain.Recipe;

import java.util.Set;

/**
 * Created by dmitri on 2021-06-13.
 */
public interface RecipeService {

    Set<Recipe> getRecipes();
}
