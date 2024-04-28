package pertemuan9;

public class Latihan5 {
	   public static void main(String[] args) {
	        StrukturQueue queue = new StrukturQueue();
	        System.out.println("### Sebelum Enqueue 4x ###");
	        System.out.println("Size : " + queue.size());
	        System.out.println("isEmpty: " + queue.isEmpty());
	        System.out.print("Elemen Queue: ");
	        queue.displayElement();

	        queue.enqueue(2);
	        queue.enqueue(7);
	        queue.enqueue(6);
	        queue.enqueue(1);
	        System.out.println("\n### Enqueue 4x ###");
	        System.out.println("Size : " + queue.size());
	        System.out.println("isEmpty: " + queue.isEmpty());
	        System.out.print("Elemen Queue: ");
	        queue.displayElement();
	        System.out.println("\nFront : " + queue.front());
	    }
	}

