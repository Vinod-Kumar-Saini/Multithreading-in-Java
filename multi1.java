
// the Runnable Interface
class Multithreading implements Runnable {
	public void run()
	{
try 
{
			
System.out.println("Thread  is running");
}
		
catch (Exception e) 
	{
System.out.println("Error");
	}
		
}
	
}

// Main Class
class multi1 {
	public static void main(String[] args)
	{
		int n = 6; 
		for (int i = 0; i < n; i++) {
			Thread object = new Thread(new Multithreading());
			object.start();
		}
	}
}

