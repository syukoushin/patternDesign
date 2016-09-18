package filterDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class AndCriteria implements Criteria{

	private Criteria criteria;
	private Criteria otherCriteria;
	
//	public AndCriteria() {
//		System.out.println("AndCriteria class's costructor.");
//	}
	
	public AndCriteria(Criteria criteria, Criteria otherCriteria){
		System.out.println("AndCriteria class's costructor.");
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}
	@Override
	public List<Person> meetCriteria(List<Person> listPerson) {
		List<Person> criteriaPerson = new ArrayList<>();
		List<Person> oneCriteriaPerson = criteria.meetCriteria(listPerson);
		criteriaPerson = otherCriteria.meetCriteria(oneCriteriaPerson);
		return criteriaPerson;
	}

}
