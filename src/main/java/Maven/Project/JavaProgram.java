package Maven.Project;

import org.testng.annotations.Test;

public class JavaProgram {
	
	
	
	
	
	@Test
	
	public void test1()
	{
		
	
		String str = "This is java program";
		
		
		String str2= " ";
		
		char[] b = str.toCharArray();
		for(int i=0;i<b.length;i++)
		{
			if(b[i]!=' ')
			{
				str2=str2+str.charAt(i);
			}
		}
		
		
		System.out.println(str2);
		
		
	}
	}
