package org.java.lessons.ciclabile;

public class MainList {
	
		int[] mainList;
		int lastNumber = 0;
		
		public MainList(int[] mainList) {
			this.mainList = mainList;
		}
		
		public MainList() {
			mainList = new int[0];
		}
	
		public void getElementoSuccessivo() {
			
			if (lastNumber == mainList.length) {
				System.out.println("hai ciclato tutto l'array");
			} else {
				System.out.println(mainList[lastNumber]);
				lastNumber++;
			}
		}
		
		public boolean hasAncoraElementi() {
			if (lastNumber < mainList.length) {
				return true;
			} else {
				return false;
			}
			}
		
		public int[] addElemento(int newElement) {
						
				int[] newList = new int[mainList.length + 1];
				
				for (int index = 0; index < mainList.length; index++) {
					newList[index] = mainList[index];
				}
			
				newList[mainList.length] = newElement;
				mainList = newList;
				return mainList;
				
			}
		
}
