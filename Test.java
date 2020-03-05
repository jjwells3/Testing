import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
//Have to write the class for the ComparatorObject.  Custom DESC order
class myComparator implements Comparator<Integer>
{
	public int compare(Integer I1, Integer I2)
	{
		if(I1 > I2)
		{
			return -1;  //obj1 is before obj2
		}
		else if(I1 < I2)
		{
			return +1;  //obj1 is after obj2
		}
		else
		{
			return 0;  //obj1 = obj2
		}
	}
}

class Test
{
	public static void main(String[] args)
	{
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(0);
		l.add(15);
		l.add(5);
		l.add(20);
		l.add(15);
		
		System.out.println("Before Sorting: " + l); //Output:  Before Sorting: [10, 0, 15, 5, 20]
		Collections.sort(l, new myComparator());
		System.out.println("After Sorting: " + l); //Output:  After Sorting: [20, 15, 10, 5, 0]
	}
}