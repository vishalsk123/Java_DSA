package linkedlist;
class Node{
	int data;
	Node link;
}
class Method{
	static Node head;
	public static void  insertAtBegain(int data)
	{
		Node newNode=new Node();
		newNode.data=data;
		newNode.link=null;
		if(head==null) {
			head=newNode;     c
		}
		else {
			newNode.link=head;
			head=newNode;
		}
		System.out.println(head);
		
	}
	
}
public class singly extends Method{

	public static void main(String[] args) {
		insertAtBegain(1);
		insertAtBegain(2);
	}
 