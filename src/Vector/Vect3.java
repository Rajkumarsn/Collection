package Vector;

import java.util.Vector;

public class Vect3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Vector a=new Vector();
     a.add(0);
     a.add(20);
     a.add(5.99);
     a.add("sachin");
     a.add(0);
     a.add('A');
     a.add(0);
     System.out.println(a);
     a.remove(2);
     a.remove("sachin");
     a.remove(0);
     a.remove(0);
     System.out.println(a);
	}

}
