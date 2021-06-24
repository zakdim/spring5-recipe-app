package guru.springframework.controllers;

import guru.springframework.services.RecipeService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Créé par developer le 2021-06-23.
 */
public class IndexControllerTest {

    @Mock
    private RecipeService recipeService;

    @Mock
    private Model model;

    private IndexController controller;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.openMocks(this);

        controller = new IndexController(recipeService);
    }

    @Test
    public void getIndexPage() {

        String viewName = controller.getIndexPage(model);
        assertEquals("index", viewName);
        verify(recipeService, times(1)).getRecipes();
        verify(model, times(1)).addAttribute(eq("recipes"), anySet());
    }
}