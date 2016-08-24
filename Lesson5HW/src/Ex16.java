
public class Ex16 {

	public static void main(String[] args) {

		double[] values = { -1.12, -2.43, 3.1, 4.2, 0, 6.4, -7.5, 8.6, 9.1, -4 };
		double x = -0.231;
		double y = 41.25;
		double a, b, c;

		for (int i = 0; i < values.length; i++) {

			c = i + 1;
			a = (c * c) + y;
			b = values[i] * c;
			if (values[i] < x) {
				System.out.print(a + ",");

			}

			if (values[i] > x) {
				System.out.print(b + ",");
			}

		}

	}

}