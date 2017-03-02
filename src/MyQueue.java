////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 249 
//  Section:  (your section number)
//
//  Project:  Lab5
//  File:     MyQueue
//  
//  Name:     (your first and last name)
//  Email:    (your Wake Tech Email Address)
////////////////////////////////////////////////////////////////////////////////
public class MyQueue<E extends Comparable<E>>
{
	private MyLinkedList<E> list = new MyLinkedList<E>();

	public void enqueue(E e)
	{
		list.addLast(e);
	}

	public E dequeue()
	{
		return list.removeFirst();
	}

	public int getSize()
	{
		return list.size();
	}

	@Override
	public String toString()
	{
		return "Queue: " + list.toString();
	}
}
