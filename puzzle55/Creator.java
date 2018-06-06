public class Creator {
	public static void main(String... args) {
		for (int i = 0; i < 100; i++) {
			Creature creature = new Creature();
		}
		System.out.println(Creature.numCreated());
	}
}

// // Thread-safe creation counter
// class Creature {
// 	private static long numCreated = 0;

// 	public Creature() {
// 		synchronized (Creature.class) {
// 			numCreated++;
// 		}
// 	}

// 	public static synchronized long numCreated() {
// 		return numCreated;
// 	}
// }

// Thread-safe creation counter using AtimicLong
//import java.util.concurrent.atomic.AtomicLong;
import java.util.*;

class Creature {
	private static AtomicLong numCreated = new AtomicLong();

	public Creature() {
		numCreated.incrementAndGet();
	}

	public static long numCreated() {
		return numCreated.get();
	}
}