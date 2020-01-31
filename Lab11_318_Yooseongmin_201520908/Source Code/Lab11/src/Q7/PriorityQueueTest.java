package Q7;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Double> queue = new PriorityQueue<Double>();
		queue.offer(3.2);
		queue.offer(9.8);
		queue.offer(5.4);

		PriorityQueue<Double> rqueue = new PriorityQueue<Double>(3, new DoubleComparator());
		rqueue.addAll(queue);

		System.out.printf("Polling from queue : ");
		while (queue.size() > 0) {
			System.out.printf("%.1f ", queue.peek());
			queue.poll();
		}

		System.out.printf("%nPolling from reversed queue : ");
		while (rqueue.size() > 0) {
			System.out.printf("%.1f ", rqueue.peek());
			rqueue.poll();
		}
	}

	private static class DoubleComparator implements Comparator<Double> {
		// write your code on the space provided
		@Override
		public int compare(Double o1, Double o2) {
			// TODO Auto-generated method stub
			if (o1 < o2) {
				return 1;
			} else if (o1 > o2) {
				return -1;
			} else
				return 0;
		}
	}
}
