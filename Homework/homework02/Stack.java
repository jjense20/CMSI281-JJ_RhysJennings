public class Stack {

	public CircularLinkedList myStack;

//----------------------------------------------------

	Stack() {
		myStack = new CircularLinkedList(); // constructor
	}

//----------------------------------------------------

	public void push(int itemToPush) {
		myStack.insert(itemToPush);
	}

//----------------------------------------------------

	public void pop() {
		myStack.delete(myStack.getCurrentInt());
	}

//----------------------------------------------------

	public static void main(String[] args) {

		Stack stack1 = new Stack();
		System.out.println("\nConstructing Stack 1");
		System.out.println("Testing push method for Stack: ");
		System.out.println("\nShould display a Stack with 10, 20, 30\n");
		System.out.println("Executing code...\n");

		stack1.push(10);
		stack1.push(20);
		stack1.push(30);
		stack1.myStack.displayList();

		System.out.println("\n------------------------------------------------------------------------------------------------");

		Stack stack2 = new Stack();
		System.out.println("\nConstructing Stack 2");
		System.out.println("Testing pop method for Stack: ");
		System.out.println("\nShould display a Stack with 40, 50, 60, 70, 80 before pop method\n");
	  System.out.println("Executing code...\n");

		stack2.push(40);
		stack2.push(50);
		stack2.push(60);
		stack2.push(70);
		stack2.push(80);
		stack2.myStack.displayList();

		System.out.println("\nShould display a Stack with 40, 50, 60 after pop method\n");
	  System.out.println("Executing code...\n");

		stack2.pop();
		stack2.pop();
		stack2.myStack.displayList();

		System.out.println("\nShould display a Stack with 40, 50, 60, 120, 240 after push method\n");
	  System.out.println("Executing code...\n");

		stack2.push(120);
		stack2.push(240);
		stack2.myStack.displayList();

		System.out.println("\n------------------------------------------------------------------------------------------------");

		System.out.println("End of Test Cases!!!");

	}
} // end of Stack class
