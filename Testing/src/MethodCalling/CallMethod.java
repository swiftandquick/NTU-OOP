package MethodCalling;

public class CallMethod {

	public static void main(String args[]) {
		
		Method aim = new Method();
		aim.setXYZ(40, 115, 2); 
		System.out.println(aim.p1Goal());
		System.out.println(aim.p2Goal());
		
	}
	
}
