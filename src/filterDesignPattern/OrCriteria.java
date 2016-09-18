package filterDesignPattern;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class OrCriteria implements Criteria{

	private Criteria criteria;
	private Criteria otherCriteria;
	
	public OrCriteria() {
		System.out.println("OrCriteria class's construtor.");
	}
	
	public OrCriteria(Criteria criteria, Criteria otherCriteria){
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}
	
	@Override
	public List<Person> meetCriteria(List<Person> listPerson) {
		
		List<Person> criteriaPerson = new ArrayList<>();
		List<Person> oneCriteriaPerson = this.criteria.meetCriteria(listPerson);
		List<Person> otherCriterPerson = this.otherCriteria.meetCriteria(listPerson);
		List<Person> temp = new ArrayList<>();
		temp.addAll(oneCriteriaPerson);
		temp.addAll(otherCriterPerson);
		for (Person person : temp) {
			if(Collections.frequency(criteriaPerson, person) < 1){
				criteriaPerson.add(person);
			}
		}
		return criteriaPerson;
	}

}
