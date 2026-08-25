class StringStack{
	String s="";
	public int size;
	int top=-1;
	public StringStack(String str){
		this.s=str;
		this.size=str.length();
		this.top=size-1;
	}
	public void push(char element){
		this.s+=element;
		top++;
	}
	public char pop(){
		char del = s.charAt(top);
		top--;
		return del;
	}
	public char peek(){
		return s.charAt(top);
	}
}

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

		System.out.println(reversed.s);
	}
}