class Quicksort {

	static void qsort(char items[]) { 
		qs(items, 0, items.length-1);
	}

	private static void qs(char items[], int left, int right) {
		System.out.print("Calling qs on " + left + " to " + right + "\n");
		int i, j;
		char x, y;

		i = left; j = right;
		x = items[(left+right)/2];

		do { 
			while((items[i] < x) && (i < right)) 
				i++;
			while((x < items[j]) && (j > left))
				j--;

			if (i <= j) {
				System.out.print("Swapping " + i + " and " + j + "\n");
				y = items[i];
				items[i] = items[j];
				items[j] = y;
				i++;
				j--;
			}
		} while (i <= j);

		// for (i = 0; i < items.length; i++) 
			// System.out.print(items[i]);
		// System.out.print("\n");

		if (left < j)
			qs(items, left, j);
		if (i < right)
			qs(items, i, right);
	}
}

class QSDemo {
	public static void main(String args[]) {
		char a[] = {'d', 'x', 'a', 'r', 'p', 'j', 'i' };
		int i;

		Quicksort.qsort(a);

		for (i = 0; i < a.length; i++) 
			System.out.print(a[i]);
		System.out.print("\n");
	}
}