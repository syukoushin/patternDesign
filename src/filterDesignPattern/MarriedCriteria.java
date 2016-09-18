package filterDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class MarriedCriteria implements Criteria{

	public MarriedCriteria() {
		System.out.println("MarriedCriteria class's constructor.");
	}
	
	@Override
	public List<Person> meetCriteria(List<Person> listPerson) {
		List<Person> marriedPerson = new ArrayList<>();
		for (Person person : listPerson) {
			if(person.getMaritalStatus().equalsIgnoreCase("married")){
				marriedPerson.add(person);
			}
		}
		return marriedPerson;
	}

}
