package matriz;

public class Marco {

	public static void main(String[] args) {

		int matriz[][] = new int[5][5];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {

				if (i == 0 || j == 0 || i == (matriz.length-1) || j == (matriz.length-1)) {
					matriz[i][j] = 1;
				} else {
					matriz[i][j] = 0;
				}
			}
		}

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j]);
			}

			System.out.print("\n");
		}

	}

}
