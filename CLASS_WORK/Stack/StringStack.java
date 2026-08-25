package Stack;

public class StringStack {
	private String s = "";
	public int size;
	private int top = -1;

	public StringStack(String str) {
		this.s = str;
		this.size = str.length();
		this.top = size - 1;
	}

	public void push(char element) {
		this.s += element;
		top++;
	}

	public char pop() {
		char del = s.charAt(top);
		top--;
		return del;
	}

	public char peek() {
		return s.charAt(top);
	}

	public String value() {
		return s;
	}
}