package org.system;

public class Desktop extends Computer{
	
	public void desktopSize() {
		
		System.out.println("The Desktop size is 10 inch");
	}

	public static void main(String[] args) {
		
		Desktop de = new Desktop();
		
		de.computerModel();
		de.desktopSize();

	}

}
