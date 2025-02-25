package com.ai.spring_ai.recipeGen;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipeController {
	private Recipe recipe;

	public RecipeController(Recipe recipe) {
		super();
		this.recipe = recipe;
	}
	@GetMapping("recipe-generator")
	public String recipeCreator(@RequestParam String ingredients,
			@RequestParam(defaultValue="any")String cusine,
			@RequestParam(defaultValue="")String dietaryRestriction){
		
		return recipe.createRecipe(ingredients, cusine, dietaryRestriction);
	}
}
