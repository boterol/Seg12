package model;

import List.*;

public class SystemController {
	LinkedList list;
	public SystemController() 
	{
		list=new LinkedList();
	}
	
	public void addTrun()
	{
		list.add();
	}
	
	public void deleteCurrentTurn()
	{
		list.deleteCurrent();
	}
	
	public void showCurrent()
	{
		if(list.getCurrent()!=null)
		{
			System.out.println(list.getCurrent().toString());
		}
		else 
		{
			System.out.println("no hay turnos en la fila.");
		}
	}
	
	public void passTurn()
	{
		list.setNextToCurrent();
	}
	
	@Override
	public String toString()
	{
		return list.toString();
	}
	
}
