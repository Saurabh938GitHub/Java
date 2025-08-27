package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class PrintingUsingConsumer {

	public static void main(String[] args) {
		List<String> input= new ArrayList<>();
		input.add("Saurabh");
		input.add("Kumar");
		System.out.println("Input list was: "+input);
	       Consumer<String> pp1= (s) -> System.out.println(s);
	       Consumer<String> pp2= (s) -> System.out.println(s.toUpperCase());
	       Consumer<String> pp= pp1.andThen(pp2);
	       input.forEach(pp1);
	       System.out.println("-------");
	       input.forEach(pp2);
	       System.out.println("-------");
	       input.forEach(pp);

	}

}
