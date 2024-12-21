class Person{
	private int weight;
	int age;
	protected int height;
	public String name;
	
	public void setWeight(int weight) {
		this.weight=weight;
	}

	public int getWeight() {
		return weight;
	}
	public void showPerson() {
		System.out.print(age+","+height+","+name+","+weight);
	}
	
}

class Student extends Person{
	public void set() {
		age=30;
		height=175;
		name="홍길동";
		setWeight(99); // private 멤버 wegiht는 setWeight로 간접접근
	}
}




public class InheritanceEx {

	public static void main(String[] args) {
	Student s= new Student();
	s.set();
	s.showPerson();
	
	
		
		

	}

}
