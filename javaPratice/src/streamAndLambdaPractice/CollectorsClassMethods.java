package streamAndLambdaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsClassMethods {

	public static void main(String[] args) {
		List<String> list= new ArrayList<>();
			Collections.addAll(list, "saurabh", "kumar", "mishra", "puja", "pratibha", "shivam", "saurabh");
			
		
			List<Student> list1= new ArrayList<>();
			Collections.addAll(list1, 
			new Student("saurabh","A","math"),
            new Student("kuamr","B","english"),
            new Student("mishra","C","science"),
            new Student("puja","A","sanskrit"),
            new Student("pratibha","C","urdu"),
            new Student("shivam","A","history"));
		
		List<String> allStringGretaerThan6InLength= list.stream().filter(s -> s.length()>6).collect(Collectors.toList());
		System.out.println("allStringGretaerThan6InLength"+allStringGretaerThan6InLength);
		
		Set<String> allUniqueStringGretaerThan6InLength= list.stream().filter(s -> s.length()>6).collect(Collectors.toSet());
		System.out.println("allUniqueStringGretaerThan6InLength"+allUniqueStringGretaerThan6InLength);
		
		Map<String, List<Student>> studentsGroupedBySection=list1.stream().collect(Collectors.groupingBy(Student::getSection));
		System.out.println("studentsGroupedBySection"+studentsGroupedBySection);

	}
	
	static class Student{
		private String name;
		private String section;
		private String subject;
		public Student(String name, String section, String subject) {
			this.name=name;
			this.section=section;
			this.subject=subject;
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
		public String getSubject() {
			return subject;
		}
		public void setSubject(String subject) {
			this.subject = subject;
		}
		
		public String toString() {
			return name+":"+section+":"+subject;
		}
	}

}
