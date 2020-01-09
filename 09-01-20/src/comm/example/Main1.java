package comm.example;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Main1 {
	public static void main(String[] args) {
		String name[]={
				new String("sang"),
				new String("sing"),
				new String("Boston"),
				new String("Passion"),
				new String("Shin"),
		   };
		List<String> a=Arrays.asList(name);
		System.out.println("Before shuffling="+1);
		Collections.shuffle(a);
		System.out.println("Shuffling list="+1);
		Collections.sort(a);
		System.out.println("Sorted list="+1);
		Collections.shuffle(a);
}
}