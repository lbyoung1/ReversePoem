////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 249
//  Section:  (your section number) 
// 
//  Project:  Lab5
//  File:     ReversePoem
//
//  Name:     (your first and last name)
//  Email:    (your Wake Tech Email Address)
////////////////////////////////////////////////////////////////////////////////

public class ReversePoem
{
	// This programs has you display a pessimistic poem from a list of phrases 
	// and then reverse the phrases to find another more optimistic poem.   

	public static void main(String[] args) throws Exception
	{
		// Create a single String object from the 16 Strings below

		String set1  = "I am part of a lost generation#and I refuse to believe that#";
		String set2  = "I can change the world#I realize this may be a shock but#";
		String set3  = "'Happiness comes from within'#is a lie, and#";
		String set4  = "'Money will make me happy'#So in 30 years I will tell my children#";
		String set5  = "they are not the most important thing in my life#";
		String set6  = "My employer will know that#I have my priorities straight because#";
		String set7  = "work#is more important than#family#I tell you this#";
		String set8  = "Once upon a time#Families stayed together#";
		String set9  = "but this will not be true in my era#";
		String set10  = "This is a quick fix society#Experts tell me#";
		String set11 = "30 years from now, I will be celebrating the 10th anniversary of my divorce#";
		String set12 = "I do not concede that#I will live in a country of my own making#";
		String set13 = "In the future#Environmental destruction will be the norm#";
		String set14 = "No longer can it be said that#My peers and I care about this earth#";
		String set15 = "It will be evident that#My generation is apathetic and lethargic#";
		String set16 = "It is foolish to presume that#There is hope#"; 
		
		StringBuilder sb = new StringBuilder();
		sb.append(set1).append(set2).append(set3).append(set4).append(set5).append(set6).append(set7).append(set8).append(set9).append(set10)
		.append(set11).append(set12).append(set13).append(set14).append(set15).append(set16);
		//System.out.println(sb.toString());
		
		String poem = sb.toString();
		String [] poemArray = poem.split("#");
		MyQueue queue = new MyQueue();
		MyStack stack = new MyStack();
		System.out.println("Poem:\n ");
		for (int i = 0; i < poemArray.length; i++)
		{
			System.out.println(poemArray[i]);
			queue.enqueue(poemArray[i]);
		}
		
		//System.out.println("Queue size: " + queue.getSize());
		int sizeBefore = queue.getSize();		//to maintain the total size
		for (int i = 0; i < sizeBefore; i++)
		{
			
			stack.push(queue.dequeue());
			//queue.dequeue();
		}
		//System.out.println("Stack size: " + stack.getSize());
		//System.out.println("");
		
		System.out.println("\nPoem Reversed:\n ");
		for (int i = 0; i <sizeBefore; i++)
		{
			System.out.println(stack.pop());
			
		}

		/* You are given a list of phrases in Strings; the phrases 
		   are separated by pound signs: '#':
		   1. Create a single String object from this list.
		   2. Then, split the String of phrases into an array of 
			  phrases using the String split method.
		   3. Display a poem by walking through the array and 
			  displaying each phrase one per line.
		   4. And, at the same time, place each phrase on a 
			  MyQueue object using only the enqueue method.
		   5. After all the phrases have been placed on the queue, 
			  transfer the phrases from the MyQueue object to a
			  MyStack object using the dequeue and push methods.  
		   6. Then, use the pop method to remove them from the 
			  stack and, at the same time,display the phrases, 
			  one per line.
		
		The result is another poem with the phrases reversed.*/

	}
}