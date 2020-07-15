class MultiDimensionalArraySearch {
	public static void main (String[]args) {
	int[][] searchBase = { {1, 2, 3}, { 3, 2, 7}, {4, 7, 4} };
	int searchTerm = 4;
	int coordinateX = -1;
	int coordinateY = -1;

	PARENT_LOOP: for(int i = 0; i < searchBase.length; i++) {
		for(int j = 0; j < searchBase[i].length; j++) {
			if (searchBase[i][j] == searchTerm) {
			coordinateX = i;
			coordinateY = j;
			break PARENT_LOOP;
				}
			}
	}

	System.out.println(coordinateX + " " + coordinateY);
	
}

}