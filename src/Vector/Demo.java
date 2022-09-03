package Vector;

import java.util.Vector;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Vector l=new Vector();
       l.add(10);
       l.add(20);
       l.add(40);
       l.add(50);
       l.add(70);
       System.out.println(l);
       System.out.println(l.get(2));
       System.out.println(l.get(0));
       for(int i=0;i<l.size();i++)
       {
    	   System.out.println(l.get(i));
       }
	}

}
