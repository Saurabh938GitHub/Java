package javaPratice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class arraySortingString {

	public static void main(String[] args) {

    String[] arr= {"Saurabh", "Vikas", "Aman", "123"};
    String[] arr1= arr;
    String[] arr2= {"Saurabh", "Vikas", "Aman", "123"};
    System.out.println(Arrays.toString(arr));
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    
    Arrays.sort(arr, Comparator.reverseOrder());
    System.out.println(Arrays.toString(arr));
    
    System.out.println(Arrays.equals(arr, arr1));
    System.out.println(Arrays.equals(arr, arr2));
    
    System.out.println(Arrays.compare(arr, arr1));
    System.out.println(Arrays.compare(arr1, arr2));
    
    List<String> t= Arrays.asList(arr);
    System.out.println(t);
    
    String[] s= t.toArray(new String[0]);
    System.out.println(Arrays.toString(s));
    
    System.out.println("----------------------------------------------------------");
    
    String[] ar1= {"pioo", "gas", "amsdbs", "123"};
    List<String> ls= Arrays.asList(ar1);
    System.out.println(ls);
    System.out.println(ls.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList()));
    System.out.println(ls.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));


	}

}
