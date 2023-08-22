package lab_17_august;

public class Thread_massage1_Q1 extends Thread{
	String msg=" ";
	Thread_massage1_Q1(String msg)
	{
		this.msg=msg;
	}
	public void run() {
		try
		{
			while(true)
			{
				System.out.println(msg);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("interrpted");
		}
	}
}
