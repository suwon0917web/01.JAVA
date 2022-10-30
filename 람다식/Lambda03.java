package ¶÷´Ù½Ä;

interface Methmetical{ 	double calculate(double d); }
interface Pickable{ char pic(String s, int i); }
interface Computerble{ int compute(int x, int y); }
class Utils{ 	int add(int x, int y) { return x+y; }   }

public class Lambda03 {
	public static void main(String[] args) {		
		Methmetical m;
		Pickable p;
		Computerble c;
//		m = x-> (x<0)? -x : x ;
//		System.out.println(m.calculate(100.50));
//		System.out.println(Math.abs(-100.50));
		
//		m = x -> Math.abs(x);
//		System.out.println(m.calculate(20.5));
		
		m = Math::abs;
		System.out.println(m.calculate(-20.5));
		
//		p = (s, i)-> s.charAt(i);
		String s = "abcdefg";
//		System.out.println(p.pic(s, 1));
		
		p = String::charAt;
		System.out.println(p.pic(s, 1));
		
//		c = (x,y) -> x + y;
//		Utils u = new Utils(); 
		c = (new Utils())::add;
		System.out.println(c.compute(10, 20));
	}

}
