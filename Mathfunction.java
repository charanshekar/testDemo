import java.io.*;
import java.lang.Math;
import java.util.Scanner;

class PhyCal
{
	double var1,var2,var3,var4,var5;
	double k = 8.99*Math.pow(10,9);
	public double eField()throws IOException
	{
		Scanner i = new Scanner(System.in);
		System.out.println("Enter charge(in coulombs):");
		var1 = i.nextDouble();;
		System.out.println("Enter Distance:");
		var2 = i.nextDouble();;
		return (k*var1)/Math.pow(var2,2);
	}
	public double iVoltage()throws IOException
	{
		Scanner i = new Scanner(System.in);
		System.out.println("Enter Max.Volatge:");
		var1 = i.nextDouble();;
		System.out.println("Enter frequency:");
		var2 = i.nextDouble();;
		System.out.println("Enter Time:");
		var3 = i.nextDouble();;
		return var1*Math.sin(2*var2*var3);
	}
	public double rms()throws IOException
	{
		Scanner i = new Scanner(System.in);
		System.out.println("Enter Max. Volatge:");
		var1 = i.nextDouble();;
		return var1*Math.sqrt(2);
	}
	public double hField()throws IOException
	{
		Scanner i = new Scanner(System.in);
		System.out.println("Earths Total magnetic field:");
		var1 = i.nextDouble();;
		System.out.println("Enter angle of inclination:");
		var2 = i.nextDouble();;
		return var1*Math.cos(var2);
	}
	public double gEfield()throws IOException
	{
		Scanner i = new Scanner(System.in);
		double temp1,temp2;
		System.out.println("Enter charge(in coulombs):");
		var1 = i.nextDouble();;
		System.out.println("Enter Distance:");
		var2 = i.nextDouble();;
		temp1=(k*var1)/Math.pow(var2,2);
		System.out.println("Enter charge(in coulombs):");
		var3 = i.nextDouble();;
		System.out.println("Enter Distance:");
		var4 = i.nextDouble();;
		temp2 = (k*var3)/Math.pow(var4,2);
		return Math.max(temp1,temp2);
	}
	public double mEfield()throws IOException
	{
		Scanner i = new Scanner(System.in);
		double temp1,temp2;
		System.out.println("Enter charge(in coulombs):");
		var1 = i.nextDouble();;
		System.out.println("Enter Distance:");
		var2 = i.nextDouble();;
		temp1=(k*var1)/Math.pow(var2,2);
		System.out.println("Enter charge(in coulombs):");
		var3 = i.nextDouble();;
		System.out.println("Enter Distance:");
		var4 = i.nextDouble();;
		temp2 = (k*var3)/Math.pow(var4,2);
		return Math.min(temp1,temp2);
	}
	public void pi()
	{
		System.out.println(Math.PI);
	}
	public void euler()
	{
		System.out.println(Math.E);
	}
	public void menu()throws IOException
	{
		Scanner i = new Scanner(System.in);
		int ch=1;
		
		
		
		try
		{
			while(ch!=0)
			{
			System.out.println("PHYSICS CALCULATOR");
			System.out.println("\nEnter your choice:");
			System.out.println("(1)Electric Field of a point charge\n(2)Instananeous Voltage\n(3)RMS voltage\n(4)Horizontal Electric Field\n(5)max Electric field\n(6)min Electric field\n(7)show pi value\n(8)Show eulers number value\n(9)Exit");
			ch  = i.nextInt();
		
			switch(ch)
			{
				case 1: System.out.println(this.eField());
						break;
				case 2: System.out.println(this.iVoltage());
						break;
				case 3: System.out.println(this.rms());
						break;
				case 4: System.out.println(this.hField());
						break;
				case 5: System.out.println(this.gEfield());
						break;
				case 6: System.out.println(this.mEfield());
						break;
				case 7: this.pi();
						break;
				case 8: this.euler();
						break;
				case 9: System.exit(0);
						break;
				default : System.out.println("Invalid input");
			
			
			}
			}
		}
		
		
		
		catch(IOException e)
		{
			System.out.println(e.toString());
			
		}
		catch (NumberFormatException nfe)
		{
			System.out.println(nfe.toString());
		}
	}
	
}

public class Mathfunction
{
	public static void main(String [] args)throws IOException
	{
		PhyCal obj = new PhyCal();
		obj.menu();
		
	}
}