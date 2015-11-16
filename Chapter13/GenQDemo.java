class GenQDemo {
	public static void main(String args[]) {

		Integer iStore[] = new Integer[10];
		GenQueue<Integer> q = new GenQueue<Integer>(iStore);

		Integer iVal;

		try {
			for(int i = 0; i < 11; i++) {
				System.out.println("Adding " + i + " to q.");
				q.put(i);
			}
		}
		catch (QueueFullException exc) {
			System.out.println(exc);
		}
		System.out.println();

		try {
			for(int i=0; i < 11; i++) {
				System.out.println("Getting next integer from q.");
				iVal = q.get();
				System.out.println(iVal);
			}
		}
		catch (QueueEmptyException exc) {
			System.out.println(exc);
		}
		System.out.println();
	}
}