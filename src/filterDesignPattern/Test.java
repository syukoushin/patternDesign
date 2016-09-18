package filterDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		Person p1 = new Person("green","male","single");
		Person p2 = new Person("white","male","married");
		Person p3 = new Person("bule","female","single");
		Person p4 = new Person("yellow","male","married");
		Person p5 = new Person("white","female","married");
		Person p6 = new Person("white","female","single");
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		list.add(p6);
		System.out.println("********female criteria**********");
		FemaleCriteria criteria = new FemaleCriteria();
		List<Person> female = criteria.meetCriteria(list);
		Util.showList(female);
		
		System.out.println("********male criteria**********");
		MaleCriteria maleCriteria = new MaleCriteria();
		List<Person> male = maleCriteria.meetCriteria(list);
		Util.showList(male);
		
		System.out.println("********single criteria**********");
		SingleCriteria singleCriteria = new SingleCriteria();
		List<Person> single = singleCriteria.meetCriteria(list);
		Util.showList(single);
		
		System.out.println("********AND criteria**********");
		AndCriteria andCriteria = new AndCriteria(new FemaleCriteria(), new SingleCriteria());
		List<Person> AND = andCriteria.meetCriteria(list);
		Util.showList(AND);
		
		System.out.println("********OR criteria**********");
		OrCriteria orCriteria = new OrCriteria(new SingleCriteria(), new FemaleCriteria());
		List<Person> OR = orCriteria.meetCriteria(list);
		Util.showList(OR);
	}

}
