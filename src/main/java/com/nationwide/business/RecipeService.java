package com.nationwide.business;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nationwide.Domain.Recipe;
import com.nationwide.persistance.IngredientsRepo;
import com.nationwide.persistance.RecipeRepo;

@Service
public class RecipeService {

	@Autowired
	private RecipeRepo repository;
	
	@Autowired
	private IngredientsRepo repository1;
	
	public List<Recipe> getAllRecipes() {
		return repository.findAll();
	}

	public List<Recipe> RecipeByTime() {
		return repository.orderByTime();
	}
	
//	public List<Recipe> findByIngredient(String ingredient){
//		int ID =repository1.findIngId(ingredient);
//		return repository.findByRecipeId(ID);
//	}

	public Recipe addNewRecipe(Recipe recipetosave) {
		return repository.save(recipetosave);
	}

	public Recipe updateRecipe(Recipe Recipetoupdate) {
		return repository.save(Recipetoupdate);
	}

	public String deleteRecipe(int recipetodelete) {
		repository.deleteById(recipetodelete);
		return "deleted succesfully";
	}

	public List<Recipe> findRecipe(String recipe) {
		return repository.findRecipe(recipe);
	}

}
