package com.nationwide.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nationwide.Domain.Recipe;
import com.nationwide.persistance.RecipeRepo;

@Service
public class RecipeService {
	
	@Autowired
	private RecipeRepo repository;
	
	public List<Recipe> getAllRecipes() {
		return repository.findAll();
	}
	
	public List<Recipe> RecipeByTime() {
		return repository.orderByTime();
	}
	
	
	public Recipe addNewRecipe(Recipe recipetosave){
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

	




