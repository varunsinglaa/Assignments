import java.util.Stack;

class QueueUsingStack<T> {
	private Stack<T> sa, sb;

	QueueUsingStack() {
		sa = new Stack<>();
		sb = new Stack<>();
	}

	public void enqueue(T data) {
		
		while (!sa.isEmpty()) {
			sb.push(sa.pop());
		}

		sa.push(data);

		while (!sb.isEmpty()) {
			sa.push(sb.pop());
		}
	}

	public T dequeue() {
		
		if (sa.isEmpty()) {
			System.exit(0);
		}

		return sa.pop();
	}

	public static void main(String[] args) {
		int[] data1 = { 6, 2, 8, 4, 5 };
		QueueUsingStack q = new QueueUsingStack();

		for (int key : data1) 
                  {
			q.enqueue(key);
		}

		System.out.println(q.dequeue());	
		System.out.println(q.dequeue());
       	        System.out.println(q.dequeue());
        	System.out.println(q.dequeue());
                System.out.println(q.dequeue());	
	}
}