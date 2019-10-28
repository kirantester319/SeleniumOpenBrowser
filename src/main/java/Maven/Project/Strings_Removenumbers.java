package Maven.Project;

import org.testng.annotations.Test;

public class Strings_Removenumbers {
	
	
	
	@Test
	
	public void StrinProgram()
	{
		
		String str = "This is Java Program 404";
		
		
		String str2 = str.replaceAll("[0-9]", "");
		
		System.out.println(str2);
		
		String str3= "THis is Selenium Program";
		String str4 ="";
		
		char[] a = str3.toCharArray();
		
		for(int i=0;i<a.length;i++)
		{
			if (a[i]!=' ')
			{
				
				str4 = str4+str3.charAt(i);
				
			}
		}
		
		System.out.println(str4);
		
		
		
		
	}

}
