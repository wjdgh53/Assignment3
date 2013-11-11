package support;

public class ThreadDemo extends Thread 
{
	int minute = 0;
	int hour = 9;
	public void run()
	{
		for(int i = 0; i<720; i++)
		{
			minute++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(minute == 60)
			{
				hour++;
				minute = 0;
			}
			
		System.out.println(hour+ " : "+minute);
	}

	
}

}
