package sorts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class heap_sort_PQ {
	
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
	
		pq.add(10);
		pq.add(3);
		pq.add(5);
		pq.add(20);
		pq.add(30);
		pq.add(4);

		System.out.println(pq);
		List<Integer> newlist = new ArrayList<>();
		for(int i =0;i<6;i++) {
			newlist.add(pq.poll());
		}
		System.out.println(newlist);
	}

}
