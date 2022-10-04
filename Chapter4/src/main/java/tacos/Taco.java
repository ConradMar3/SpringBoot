package tacos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.NonNull;

@Data
public class Taco {

	@NonNull
	@Size(min = 5, message = "Name must be at least 5 characters long")
	private String name;

	private Date createdAt = new Date();

	@SuppressWarnings("rawtypes")
	@Size(min = 1, message = "You must choose at least 1 ingredient")
	private List<Ingredient> ingredients = new ArrayList<>();

	public void addIngredient(Ingredient<?> ingredient) {
		this.ingredients.add(ingredient);
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

}
