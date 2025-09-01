package streamAndLambdaPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class LongestStringInList {

	public static void main(String[] args) {
		List<String> list= new ArrayList<>();
		System.out.println("enter the no of strings");
		int x=0;
		Scanner sc= new Scanner(System.in);
		x=sc.nextInt();
		System.out.println("enter the strings");
		for(int i=0; i<x; i++) {
			Collections.addAll(list, sc.next());
		}
		System.out.println("list of entered strings is: "+list);
		Optional<String> largest= list.stream().reduce((a,b) -> (a.length()>b.length()?a:b));
		System.out.println("largest string enterd is: "+largest);
		sc.close();

	}

}
