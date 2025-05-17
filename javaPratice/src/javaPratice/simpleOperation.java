package javaPratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class simpleOperation {

	public static void main(String[] args) {

    char[] arr1= {'c', 'a', 'o', '1', 'f'};
    
    System.out.println(Arrays.toString(arr1));
    
    Arrays.sort(arr1);
    
    System.out.println(Arrays.toString(arr1));
    
    Character [] array1 = new Character[arr1.length]; 
    for(int i=0; i<arr1.length; i++) {
    	array1[i]=Character.valueOf(arr1[i]);
    }
    
    Arrays.sort(array1, Comparator.reverseOrder());
    System.out.println(Arrays.toString(array1));
    
    Arrays.sort(array1, Comparator.naturalOrder());
    System.out.println(Arrays.toString(array1));
    
    List<Character> intList = new ArrayList<Character>();
    for (char i : arr1)
    {
        intList.add(i);
    }
    
	System.out.println(intList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
	System.out.println(intList.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList()));
	}

}
