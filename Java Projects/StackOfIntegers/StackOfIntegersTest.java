public class StackOfIntegersTest {
	public static void main(String [] args) {
	StackOfIntegers stack = new StackOfIntegers();
	
	System.out.print("Pop all elements in the stack, you will get:\n");
	for(int i = 0; i < 10; i++)
	stack.push(i);
	
	 while(!stack.empty())
	 System.out.print(stack.pop() + " ");
	}
}
