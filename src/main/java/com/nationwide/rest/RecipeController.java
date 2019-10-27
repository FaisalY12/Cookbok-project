package com.nationwide.rest;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nationwide.Domain.Recipe;
import com.nationwide.business.RecipeService;



@RestController
@RequestMapping()
public class RecipeController {
	
	@Autowired
	private RecipeService recipeService;
	
	@GetMapping(value="allRecipe")
	public List<Recipe> getAllRecipes() {
		return recipeService.getAllRecipes();
	}
	
	@GetMapping("sortByDescTime")
	public List<Recipe> recipeByTime() {
		return recipeService.RecipeByTime();
	}
	
	@GetMapping("findrecipe/{recipe}")
	public List<Recipe> findRecipe(@PathVariable String recipe) {
		return recipeService.findRecipe(recipe);
	}
	
	
	@PostMapping(value="addRecipe")
	public Recipe addNewRecipe(@RequestBody Recipe recipetosave){
		return recipeService.addNewRecipe(recipetosave);
		}
		
	@PutMapping(value="updateRecipe")
	public Recipe updateRecipe(@RequestBody Recipe Recipetoupdate) {
		return recipeService.updateRecipe(Recipetoupdate);
	}
	@DeleteMapping(value="deleteRecipe/{recipetodelete}")
	public String deleteRecipe(@PathVariable int recipetodelete) {
		return  recipeService.deleteRecipe(recipetodelete);
	}
	
	
	

	
	



}
