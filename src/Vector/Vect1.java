package Vector;

import java.util.Vector;

public class Vect1 {

	 static public void main(String[] args) {
		// TODO Auto-generated method stub
      Vector a=new Vector();
      a.add(10);
      a.add(20.5);
      a.add(null);
      a.add("raj");
      a.add('A');
      System.out.println(a);
      System.out.println(a.capacity());
      System.out.println(a.size());
	}

}
