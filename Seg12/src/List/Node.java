package List;

public class Node {
	int value;
	final int maxPasses=3;
	int timesPassed;
	
	Node next;
	Node prev;
	
	public Node(int value)
	{
		this.value=value;
		this.timesPassed=0;
	}
	
	public String toString()
	{
		String out=String.valueOf(value);
		return out;
	}
}
