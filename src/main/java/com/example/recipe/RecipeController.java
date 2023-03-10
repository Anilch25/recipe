package com.example.recipe;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.recipe.RecipeService;
@RestController
class RecipeController{
    RecipeService recipeService=new RecipeService();
    @GetMapping("/recipes")
    public ArrayList<Recipe> getRecipes(){
        return recipeService.getRecipes();
    }
}
