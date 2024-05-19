import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Задание 1

		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		System.out.println("Введенное число:" + num);
		if (num > 7) {
			System.out.println("Привет");
		}

		String name = s.next();
		System.out.println("Введенное имя:" + name);
		if (name.equalsIgnoreCase("Вячеслав")) {
			System.out.println("Привет, Вячеслав");
		} else {
			System.out.println("Нет такого имени");
		}

		System.out.println("Введите количество элементов массива:");
		int n = s.nextInt();
		int[] numbers = new int[n];

		System.out.println("Введите элементы массива:");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = s.nextInt();
		}

		System.out.println("Элементы массива кратные 3:");
		for (int number : numbers) {
			if (number % 3 == 0) {
				System.out.println(number);
			}
		}
		s.close();

	}

}
