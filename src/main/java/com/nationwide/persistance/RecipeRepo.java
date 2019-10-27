package com.nationwide.persistance;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nationwide.Domain.Recipe;

@Repository
public interface RecipeRepo extends JpaRepository<Recipe,Integer>{
	
	public List<Recipe> orderByTime();
	public List<Recipe> findRecipe(String name);
	
	}
	
