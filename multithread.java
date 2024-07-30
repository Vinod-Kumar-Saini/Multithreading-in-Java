
// the Thread class
class Multithreading extends Thread {
	public void run()
	{
	try {
	System.out.println("Thread  is running");
	}
		catch (Exception e)
		{
			
			System.out.println("Error");
		}
	}
}

// Main Class
public class multithread {
	public static void main(String[] args)
	{
		int n = 5; 
		for (int i = 0; i < n; i++) {
			Multithreading object = new Multithreading();
			object.start();
		}
	}
}
