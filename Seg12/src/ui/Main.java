package ui;

import java.util.Scanner;
import model.SystemController;

public class Main {
	public static Scanner sc=new Scanner(System.in);
	public static SystemController controller;
	public static void main(String[] args) {
		controller=new SystemController();
		int choice=-1;
		do
		{
			choice=menu();
			choiceSelection(choice);
			//permitir el print de abajo para mostrar la lista depués de cada iteración
			//System.out.println(controller.toString());
		}while(choice!=0);
	}
	
	public static int menu()
	{
		int choice=-1;
		do
		{
			System.out.println("(1) Dar turno\n"+
					"(2) Mostrar turno\n"+
					"(3) Pasar turno\n" +
					"(4) Eliminar turno actual\n"+
					"(0) Salir");
			choice=sc.nextInt();
		}while(choice>4 || choice<0);
		return choice;
	}
	
	public static void choiceSelection(int choice)
	{
		switch(choice)
		{
			case 1: 
				controller.addTrun();
				break;
			case 2: 
				controller.showCurrent();
				break;
			case 3: 
				controller.passTurn();
				break;
			case 4: 
				controller.deleteCurrentTurn();
				break;
			case 0:
				System.out.println("bai (O_<)");
				break;
		}
	}

}
