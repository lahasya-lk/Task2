package student;

	// Main class
	public class StudentScoreLogger {
	    public static void main(String[] args) {
	        FileHandler handler = new FileHandler();

	        //student objects
	        Person s1 = new Person("Anushka", 1001, 80);
	        Person s2 = new Person("Brinda", 1002, 95);
	        Person s3 = new Person("Chikara", 1003, 63);

	        //threads for each student
	        Thread t1 = new PersonThread(handler, s1);
	        Thread t2 = new PersonThread(handler, s2);
	        Thread t3 = new PersonThread(handler, s3);

	        // Start threads
	        t1.start();
	        t2.start();
	        t3.start();

	        //Wait for all threads to complete
	        try {
	            t1.join();
	            t2.join();
	            t3.join();
	        } catch (InterruptedException e) {
	            System.err.println("Thread interrupted: " + e.getMessage());
	        }

	        System.out.println("All threads are completed. Scores saved to scores.csv");
	    }
	}

	   