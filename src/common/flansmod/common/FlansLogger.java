package flansmod.common;

public class FlansLogger
{
	public static void log(String s)
	{
		//TODO : Make better logger
		System.out.println("Flan's Mod : " + s);
	}
	
	public static void logQuietly(String s)
	{
		//TODO : Log dis.
	}
	
	public static void logLoudly(String s)
	{
		errorString = s;
		errorStringTimer = 100;
		System.out.println("SERIOUS PROBLEM!");
		System.out.println("Flan's Mod : " + s);
	}
}