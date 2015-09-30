
class Queue {
	private char q[];
	private int putloc, getloc;

	Queue(Queue ob) {
		putloc = ob.putloc;
		getloc = ob.getloc;
		q = new char[ob.q.length];

		for (int i=getloc; i < putloc; i++)
			q[i] = ob.q[i];
	}

	Queue(char a[]) {
		this(a.lenght);
		for (i=0; i < a.length; i++)
			put(a[i]);
	}

	Queue(int size) {
		q = new char[size];
		putloc = getloc = 0;
	}

	void put(char ch) {
		if (putloc==q.length) {
			System.out.println("Queue is full.");
			return;
		}
		q[putloc++] = ch;
	}

	char get() {
		if (getloc==putloc) {
			System.out.println("Queue is empty.");
			return (char) 0;
		}
		return q[getloc++];
	}
}
