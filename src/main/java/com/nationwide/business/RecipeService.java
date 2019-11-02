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
	
	public int findRecipeId(String n) {
		return repository.findRecipeId(n);
	}

	public Recipe addNewRecipe(Recipe recipetosave) {
		return repository.save(recipetosave);
	}

	public Recipe updateRecipe(Recipe Recipetoupdate) {
		return repository.save(Recipetoupdate);
	}

	public String deleteRecipe(String name) {
		int a = repository.findRecipeId(name);
		repository.deleteById(a);
		return "deleted succesfully";
	}

	public List<Recipe> findRecipe(String recipe) {
		return repository.findRecipe(recipe);
	}
	
	public List<Recipe> findByOrderByTimeAsc() {
		return repository.findByOrderByTimeAsc();
	}
	
	public List<Recipe> findByOrderByTimeDesc() {
		return repository.findByOrderByTimeDesc();
	}
	
	public String deleteRecipebyId(int id) {
		repository.deleteById(id);
		return "deleted succesfully";
	}


}
