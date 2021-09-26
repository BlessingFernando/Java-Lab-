package lab10;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {

	private HashSet<String> variable = new HashSet<>(Arrays.asList("Albania", "Andorra", "Austria", "Belarus", "Belgium","Bosnia Herzegovina", "Bulgaria", "Croatia", "Cyprus", "Czech Republic",  "Denmark", "Estonia",    "Hungary",  "Iceland",  "Ireland",  "Italy",  "Kosovo",  "Latvia",  "Liechtenstein", "Lithuania",  "Luxemburg",  "Macedonia",  "Malta",  "Moldova",  "Monaco",  "Montenegro",  "Norway",  "Poland", "Portugal", "Romania", "Russia", "San Marino", "Serbia", "Slovakia", "Slovenia", "Spain", "Sweden", "Switzerland", "the Netherlands", "the United Kingdom", "Turkey", "Ukraine"));

	public TestHashSet()
	{
		System.out.println(this.variable);
		
	}
	
	public void printSet()
	{
		Iterator<String> i = variable.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
	
	public void addCountry(String country)
	{
		variable.add(country);
	}
	public boolean matchCountry(String country)
	{
		boolean output = false;
		Iterator<String> i = variable.iterator();
		while(i.hasNext())
		{
			if(i.next().equals(country))
			{
				output = true;
			}
		}
		
			return output;
		}
	public void clearSet()
	{
		variable.clear();
	}
}