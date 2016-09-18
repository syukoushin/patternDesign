package filterDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class SingleCriteria implements Criteria{

	public SingleCriteria() {
		System.out.println("SingleCriteria class's construtor.");
	}
	
	@Override
	public List<Person> meetCriteria(List<Person> listPerson) {
		List<Person> singlePerson = new ArrayList<>();
		for (Person person : listPerson) {
			if(person.getMaritalStatus().equalsIgnoreCase("single")){
				singlePerson.add(person);
			}
		}
		return singlePerson;
	}

}
