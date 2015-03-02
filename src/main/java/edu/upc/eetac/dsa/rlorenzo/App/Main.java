package edu.upc.eetac.dsa.rlorenzo.App;

public class Main {
	
	public static void main(String[] args){
		
		Tree[] arboles = new Tree[4];
		
		arboles[0] = new Tree(4);
		arboles[1] = new Tree("Roble");
		arboles[2] = new Tree();
		arboles[3] = new Tree(5,"Pino");
		
		System.out.println("Un árbol de "+arboles[0].altura+" metros");
		System.out.println("Un "+arboles[1].tipo);
		System.out.println("Un "+arboles[2].tipo);
		System.out.println("Un "+arboles[3].tipo+" de "+arboles[3].altura+" metros");
	}

}
