package com.nationwide.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;



@Entity
@NamedQueries(value= {
		@NamedQuery(
				name = "Recipe.orderByTime",
				query = "Select p from Recipe p order by p.time desc"
				),
		@NamedQuery(
				name = "Recipe.findRecipe",
				query = "Select p from Recipe p where p.name=?1"
				)
		 
})
public class Recipe {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int recipeid;
	private String name;
	private String description;
	private String instructions;
	private int time;
	
	public int getRecipeid() {
		return recipeid;
	}
	public void setRecipeid(int recipeid) {
		this.recipeid = recipeid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getInstructions() {
		return instructions;
	}
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	
	public Recipe(int recipeid, String name, String description, String instructions, int time) {
		super();
		this.recipeid = recipeid;
		this.name = name;
		this.description = description;
		this.instructions = instructions;
		this.time = time;
	}
	public Recipe() {
	}

}
