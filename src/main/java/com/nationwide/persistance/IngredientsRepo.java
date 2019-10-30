package com.nationwide.persistance;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nationwide.Domain.Ingredients;
import com.nationwide.Domain.Recipe;

	@Repository
	public interface IngredientsRepo extends JpaRepository<Ingredients,Integer>{
		public List<Ingredients> findAll();
//		public int findIngId(String Ingredient);

}
