import java.util.Scanner;

public class Rectangle {

	int width;
	int height;

	public Rectangle() {

	}

	public int getArea() {
		return width * height;

	}

	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		Scanner scanner = new Scanner(System.in);

		System.out.print("���� �Է��ϼ���.>>");
		rect.height = scanner.nextInt();
		rect.width = scanner.nextInt();
		System.out.println("�簢���� ������" + rect.getArea());
		scanner.close();

	}

}