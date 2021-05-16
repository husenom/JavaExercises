package Question3;

public class RightAngleTriangle {

	private int rows;

	public RightAngleTriangle(int rows) {
		this.rows = rows;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public void triangle() {

		for (int j = 0; j < rows; j++) {

			for (int i = 0; i < rows && i <= j; i++) {

				System.out.print("*");

			}

			System.out.println("");
		}
	}

}
