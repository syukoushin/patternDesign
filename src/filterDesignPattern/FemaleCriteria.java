package filterDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class FemaleCriteria implements Criteria{

	public FemaleCriteria() {
		System.out.println("FemaleCriteria class's construtor.");
		
	}
	@Override
	public List<Person> meetCriteria(List<Person> listPerson) {
		List<Person> femalePerson = new ArrayList<>();
		for (Person person : listPerson) {
			if(person.getGender().equals("female")){
				femalePerson.add(person);
			}
		}
		return femalePerson;
	}

}
