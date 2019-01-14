
public class Class implements I1,I2 {

	@Override
	public void m1() {
		
		System.out.println("m1---class");
	}
	
	public static void main(String[] args) {
		
		I1 i=new Class();
		
		Class c=new Class();
		c.m1();
		
		
	}
		
		
		
	}
	


