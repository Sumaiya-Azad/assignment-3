class seriesPrinter{
	
	
	static void printSeries(int startIndex, int endIndex){
		
		printSeries(startIndex, endIndex, 1);
	}
	
	
	static void printSeries(int startIndex, int endIndex, int interval)
	{
		
		for(int x=startIndex; x<=endIndex; x+=interval)
		{
			System.out.println(x + " ");
		}
		System.out.println();
	}
	
	static void printSeries(int n)
	{
		printSeries(0, n);
	}
	
	
} 

public class task2 {

	public static void main(String[] args) {
		
		seriesPrinter.printSeries(5); seriesPrinter.printSeries(5,10); seriesPrinter.printSeries(5,15,3);
	
	}

}
