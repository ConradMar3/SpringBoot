package tacos;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class Ingredient<VEGGIES> {

	@Id
	private String id;
	public enum Type {
		WRAP, VEGGIES, CHEESE, SAUCE
	}

}
