package List;

public class LinkedList {
	private Node first;
	private Node last;
	private Node current;
	private final int maxSize=50;
	private int size;
	
	public LinkedList() {}
	
	public void add()
	{
		if(first==null)
		{
			first=new Node(1);
			last=first;
			first.next=last;
			last.prev=first;
			first.prev=last;
			last.next=first;
			setCurrent(first);
			size=1;
		}
		else if(size<=maxSize)
		{
			Node inter=new Node(last.value+1);
			inter.prev=last;
			last.next=inter;
			
			last.next=inter;
			inter.prev=last;
			last=inter;
			first.prev=last;
			last.next=first;
			size++;
		}
	}
	
	public void deleteCurrent() {
		if(current!=null)
		{
			Node newCurrent=current.next;
			if(first==last)
			{
				first=null;
				last=null;
			}
			else if(current==first)
			{
				first.next.prev=last;
				last.next=first.next;
				first=last.next;
			}else if(current==last)
			{
				last.prev.next=first;
				first.prev=last.prev;
				last=first.prev;
			}else 
			{
				current.prev.next=current.next;
				current.next.prev=current.prev;	
			}
			current=newCurrent;
			size-=1;
		}
		else
		{
			System.out.println("no hay turnos en la fila.");
		}
	}
	
	public void setCurrent(Node node)
	{
		if(current != null && current.timesPassed>=current.maxPasses)
		{
			deleteCurrent();
		}
		else
		{
			current=node;
			current.timesPassed++;	
		}
	}
	
	public void setNextToCurrent()
	{
		setCurrent(current.next);
	}
	
	public Node getCurrent()
	{
		return current;
	}
	
	public String toString()
	{
		String out="";
		if(first==last)
		{
			out+=current.toString();
		}
		else
		{
			out+=first.toString();
			Node inter=first.next;
			while(inter!=first)
			{
				out+=" "+inter.toString();
				inter=inter.next;
			}
		}
		return out;
	}

}
