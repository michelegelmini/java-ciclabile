package org.java.lessons.ciclabile;

public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainList test = new MainList(new int[]{1,2,3});
		
		
		System.out.println("Prova con costruttore con array fisso");
		
		test.getElementoSuccessivo();
		System.out.println(test.hasAncoraElementi());
		test.getElementoSuccessivo();
		System.out.println(test.hasAncoraElementi());
		test.getElementoSuccessivo();
	
		test.addElemento(1256);
		test.getElementoSuccessivo();
		
		System.out.println("****************************************");
		System.out.println("Prova con costruttore con array azzerato");
		
		MainList anotherTest = new MainList();
		
		anotherTest.addElemento(2234);
		anotherTest.addElemento(3423);
		anotherTest.addElemento(22323242);
		
		anotherTest.getElementoSuccessivo();
		anotherTest.getElementoSuccessivo();
		anotherTest.getElementoSuccessivo();
		System.out.println(anotherTest.hasAncoraElementi());
		
		
		
	}

}
