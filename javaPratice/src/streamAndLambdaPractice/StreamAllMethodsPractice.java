package streamAndLambdaPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamAllMethodsPractice {

	public static void main(String[] args) {
		List<Student> list= new ArrayList<Student>();
		Collections.addAll(list,
				new Student("saurabh","A",1,"bihar","excellent"),
				new Student("pratibha","B",4,"uttarpradesh","good"),
				new Student("shivam","A",2,"madhyapradesh","poor"),
				new Student("puja","C",3,"maharashtra","good"),
				new Student("ashwini","B",9,"odisha","excellent"),
				new Student("sushant","C",8,"bihar","poor"),
				new Student("prashant","A",10,"maharashtra","poor"),
				new Student("sana","C",7,"uttarpradesh","good"),
				new Student("kuhu","B",6,"madhyapradesh","excellent"),
				new Student("shubham","B",5,"odisha","poor"));
		
//		//filter()
//		System.out.println("find name and roll of all students  who are from madhyapradesh: ");
//		list.stream().filter(Student -> Student.getState().equals("madhyapradesh")).forEach(Student -> System.out.println(Student.getName()+" - "+Student.getRoll()));
//		System.out.println("-------------------------------------------------------------");
//		
//		//map()
//		System.out.println("update grade of all student from odisha to good and print details");
//		List<Student> x=list.stream().map(Student -> Student.getState().equals("odisha")? new Student(Student.getName(), Student.getSection(), Student.getRoll(), Student.getState(), "good"):Student ).collect(Collectors.toList());
//		System.out.println(x);
//		System.out.println("-------------------------------------------------------------");
		
//		//peek()
//		System.out.println("peek the details after filtering all student names starting with s");
//		list.stream().filter(Student -> Student.getName().startsWith("s")).peek(Student -> System.out.println(Student)).forEach(Student -> System.out.println(Student.getRoll()));
//		System.out.println("-------------------------------------------------------------");
		
//		//skip()
//		System.out.println("find students of section B but skip first 2");
//		list.stream().filter(Student -> Student.getSection().equals("B")).skip(2).forEach(Student -> System.out.println(Student));
//		System.out.println("-------------------------------------------------------------");

//		//limit()
//		System.out.println("find first 2 students of poor grade");
//		list.stream().filter(Student -> Student.getGrade().equals("poor")).limit(2).forEach(Student -> System.out.println(Student));
//		System.out.println("-------------------------------------------------------------");
		
		//sorted()
//		System.out.println("sort students in ascending as per roll and then in descending as per name");
//		List<Student> sortedByRollInAscending=list.stream().sorted(Comparator.comparing(Student -> Student.getRoll())).collect(Collectors.toList());
//		System.out.println(sortedByRollInAscending);
//		List<Student> sortedByNameInDescending=list.stream().sorted(Comparator.comparing(Student -> ( (Student) Student).getName()).reversed()).collect(Collectors.toList());
//		System.out.println(sortedByNameInDescending);
//		System.out.println("-------------------------------------------------------------");
 
//		//takeWhile()
//		System.out.println("collect student info till roll number 3");
//		List<Student> studentInfoTillRoll6=list.stream().sorted(Comparator.comparing(Student -> Student.getRoll())).takeWhile(Student -> Student.getRoll()<=3).collect(Collectors.toList());
//		System.out.println(studentInfoTillRoll6);
//		System.out.println("-------------------------------------------------------------");
		
//		//takeWhile()
//		System.out.println("collect student after roll number 6");
//		List<Student> studentInfoAfterRoll6=list.stream().sorted(Comparator.comparing(Student -> Student.getRoll())).dropWhile(Student -> Student.getRoll()<=6).collect(Collectors.toList());
//		System.out.println(studentInfoAfterRoll6);
//		System.out.println("-------------------------------------------------------------");
		
//		//forEach()
//		System.out.println("print name of each student of section A");
//		list.stream().filter(Student -> Student.getSection().equals("A")).forEach(Student -> System.out.println(Student.getName()));
//		System.out.println("-------------------------------------------------------------");
		
//		//collect()
//		System.out.println("group students on the basis of state");
//		Map<Object, List<Student>> group= list.stream().collect(Collectors.groupingBy(Student -> (Student).getState()));
//		System.out.println(group);
//		System.out.println("-------------------------------------------------------------");
		
//		//count()
//		System.out.println("get the count of students of section c");
//		System.out.println(list.stream().filter(Student -> Student.getSection().equals("C")).count());
//		System.out.println("-------------------------------------------------------------");
		
//		//min()
//		System.out.println("get the name of student whose roll number is minimum");
//		System.out.println(list.stream().min(Comparator.comparing(Student -> Student.getRoll())).get().getName());
//		System.out.println(list.stream().max(Comparator.comparing(Student -> ((Student) Student).getRoll()).reversed()).get().getName());
//		System.out.println("-------------------------------------------------------------");
		
//		//max()
//		System.out.println("get the name of student whose roll number is maximum");
//		System.out.println(list.stream().max(Comparator.comparing(Student -> Student.getRoll())).get().getName());
//		System.out.println(list.stream().min(Comparator.comparing(Student -> ((Student) Student).getRoll()).reversed()).get().getName());
//		System.out.println("-------------------------------------------------------------");
		
//		//sum()
//		System.out.println("find sum of roll numbers of all students");
//		System.out.println(list.stream().mapToInt(Student -> Student.getRoll()).sum());
//		System.out.println("-------------------------------------------------------------");
		
//		//average()
//		System.out.println("find average of roll numbers of all students");
//		System.out.println(list.stream().mapToInt(Student -> Student.getRoll()).average());
//		System.out.println("-------------------------------------------------------------");
		
//		//findAny()
//		System.out.println("print detail of any student");
//		System.out.println(list.stream().findAny());
//		System.out.println("-------------------------------------------------------------");
		
//		//findFirst()
//		System.out.println("print detail of first student");
//		System.out.println(list.stream().findFirst());
//		System.out.println("-------------------------------------------------------------");
		
//		//anyMatch()
//		System.out.println("find whether any student is from uttarpradesh");
//		System.out.println(list.stream().anyMatch(Student -> Student.getState().equals("uttarpradesh1")));
//		System.out.println("-------------------------------------------------------------");
		
//		//noneMatch()
//		System.out.println("find that no student is from haryana");
//		System.out.println(list.stream().noneMatch(Student -> Student.getState().equals("haryana")));
//		System.out.println("-------------------------------------------------------------");
		
		//allMatch()
		System.out.println("find that all student roll number is below 15");
		System.out.println(list.stream().allMatch(Student -> Student.getRoll()<15));
		System.out.println("-------------------------------------------------------------");
		
		
		
	}

}

class Student{
	private String name;
	private String section;
	private int roll;
	private String state;
	private String grade;
	
	public Student(String name, String section, int roll, String state, String grade) {
		this.name=name;
		this.section=section;
		this.roll=roll;
		this.state=state;
		this.grade=grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public String toString() {
		return name+":"+section+":"+roll+":"+state+":"+grade;
		
	}
	
}
