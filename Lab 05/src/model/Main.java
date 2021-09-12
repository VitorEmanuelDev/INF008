package model;

public class Main {
	
	public static void main(String args[]) {
		int num_i = 3;
		int num_j = 19;
		
		MetodoClass mc = new MetodoClass();	
		
		mc.welcome();
		System.out.println("addTwo(3) é " + mc.addtwo(num_i));
		System.out.println("addTwo(19) é " + mc.addtwo(num_j));
		
	}

}
