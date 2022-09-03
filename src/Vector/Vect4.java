package Vector;

import java.util.Vector;

public class Vect4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Vector a=new Vector();
      a.add(10);
      a.add("raj");
      a.add(20.5);
      Vector b=new Vector();
      b.add("ravi");
      b.add(10);
      b.add(60);
      System.out.println(a);
      System.out.println(b);
//      a.removeAll(b);
//      System.out.println(a);
//      System.out.println(b);
//      b.removeAll(a);
//      System.out.println(a);
//      System.out.println(b);
//      a.retainAll(b);
//      System.out.println(a);
//      System.out.println(b);
//      b.retainAll(a);
//      System.out.println(a);
//      System.out.println(b);
//      a.addAll(b);
//      System.out.println(a);
//      System.out.println(b);	
      a.addAll(2,b);
      System.out.println(a);
	}

}
