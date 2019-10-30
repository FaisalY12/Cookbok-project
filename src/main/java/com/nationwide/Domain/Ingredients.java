package com.nationwide.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;



//@NamedQueries(value= {
//		@NamedQuery(
//				name = "Ingredients.findingredientId",
//				query = "Select p.ing_id from Ingredients p where p.name=?!"
//				)})
	

@Entity
public class Ingredients {
	
	@Id 
	@GeneratedValue
	private int ing_id;
	private int recipeid;
	private String ingredient;

 
	
	public int getIng_id() {
		return ing_id;
	}
	public void setIng_id(int ing_id) {
		this.ing_id = ing_id;
	}

	public String getIngredient() {
		return ingredient;
	}
	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}

	
	public Ingredients(){
		
	}
	public int getRecipeid() {
		return recipeid;
	}
	public void setRecipeid(int recipeid) {
		this.recipeid = recipeid;
	}
	
	public Ingredients(int ing_id, int recipeid, String ingredient) {
		super();
		this.ing_id = ing_id;
		this.recipeid = recipeid;
		this.ingredient = ingredient;
	}

}
