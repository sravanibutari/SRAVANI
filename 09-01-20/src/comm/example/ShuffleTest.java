package comm.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class ShuffleTest {

	public static void main(String[] args) {
		String name[]=
			{
				new String("sang"),
				new String("sing"),
				new String("Boston"),
				new String("Passion"),
				new String("Shin"),
		   };
		List<Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(200);
		a.add(-14);
		System.out.println(a);
		int index=Collections.binarySearch(1,-1);
		if(index>=1)
		{
			System.out.println("found"+a.get(index));
		}
		else
		{
			System.out.println("found"+index);
		}
}

	}


