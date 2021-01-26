import java.util.*;
public class SortStack {
    public Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
		Stack<Integer> tmpStack = new Stack<Integer>();
		 while(!s.isEmpty())
        {
            int tmp = s.pop();
            while(!tmpStack.isEmpty() && tmpStack.peek() 
                                                 > tmp)
            {
               s.push(tmpStack.pop());
            }
            tmpStack.push(tmp);
        }
        return tmpStack;
	}
}
