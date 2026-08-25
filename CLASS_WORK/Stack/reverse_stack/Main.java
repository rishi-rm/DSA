package Stack.reverse_stack;

import Stack.StringStack;

public class Main{
	
	static StringStack reverse(StringStack str){
		StringStack reversed=new StringStack("");

		for (int i = 0; i < str.size; i++) {
			char c = str.pop();
			reversed.push(c);
		}

		return reversed;
	}
	public static void main(String[] args){
		StringStack s = new StringStack("MCA");
		StringStack reversed = reverse(s);

		System.out.println(reversed.value());
	}
}