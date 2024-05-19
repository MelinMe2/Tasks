import java.util.Stack;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sequence = "[((())()(())]]";
		// String sequence = "[(())()(())]";
		Boolean result = isValid(sequence);

		if (result) {
			System.out.println("Скобочная последовательность правильная");
		} else {
			System.out.println(
					"Скобочная последовательность неправильная. Нужно убрать лишние '(' и'['. Могу предложить следующий вариант: [(())()(())]");

		}

	}

	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();

		for (char ch : s.toCharArray()) {
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			} else if (ch == ')' || ch == '}' || ch == ']') {
				if (stack.isEmpty()) {
					return false;
				}

				char top = stack.pop();
				if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
}