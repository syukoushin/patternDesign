package filterDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class MaleCriteria implements Criteria{

	public MaleCriteria() {
		System.out.println("Male class's construtor.");
	}
	@Override
	public List<Person> meetCriteria(List<Person> listPerson) {
		List<Person> criteriaPerson = new ArrayList<>();
		for (Person person : listPerson) {
			if(person.getGender().equalsIgnoreCase("male")){
				criteriaPerson.add(person);
			}
		}
		return criteriaPerson;
	}
}
