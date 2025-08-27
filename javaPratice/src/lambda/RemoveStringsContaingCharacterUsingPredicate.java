package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveStringsContaingCharacterUsingPredicate {

	public static void main(String[] args) {
		List<String> input= new ArrayList<>();
		input.add("Saurabh");
		input.add("Kumar");
		input.add("Mummy");
		input.add("");
		input.add("Mishra");
		input.add("Sanjay");
		input.add("Bandana");
		input.add("Prati");
		input.add("Yash");
		input.add("Xtream$");
		System.out.println("Input list was: "+input);
		
		Predicate<String> pr1= (s) -> s.length()==0;
		Predicate<String> pr2= (s) -> s.contains("$");
		Predicate<String> pr3= (s) -> s.contains(String.valueOf('y'));
		Predicate<String> pr4= (s) -> s.contains(String.valueOf('Y'));
		input.removeIf(pr1);
		System.out.println("Input list post zero size string removal operation: "+input);
		input.removeIf(pr2);
		System.out.println("Input list post '$' containing string removal operation: "+input);
		input.removeIf(pr3.or(pr4));
		System.out.println("Input list post 'Y' or 'y' containing string removal operation: "+input);

	}

}
