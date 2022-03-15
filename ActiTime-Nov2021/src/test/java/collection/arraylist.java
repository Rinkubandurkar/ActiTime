package collection;

import java.util.ArrayList;

public class arraylist {
	public static void main(String[] args) {
		
		
		
		ArrayList a = new ArrayList();
		
		a.add(233);
		a.add("asd");
		a.add('$');
		
		for(int i=0 ;i<a.size;i++)
		{
			System.out.println(a.get(i));
		}
	}

}
