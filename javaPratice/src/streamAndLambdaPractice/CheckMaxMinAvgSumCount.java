package streamAndLambdaPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CheckMaxMinAvgSumCount {

	public static void main(String[] args) {
		List<Integer> list= new ArrayList<>();
			Collections.addAll(list, 23,45,55,2,11,766,0,800,32);
		
		System.out.println("list of entered integers is: "+list);
		System.out.println("max value is:"+ list.stream().max(Comparator.naturalOrder()));
		System.out.println("min value is:"+ list.stream().min(Comparator.naturalOrder()));
		System.out.println("avg value is:"+ list.stream().mapToInt(Integer::intValue).average());
		System.out.println("sum value is:"+ list.stream().mapToInt(Integer::intValue).sum());
		System.out.println("count of integers is:"+ list.stream().count());
		
		
	

	}

}
