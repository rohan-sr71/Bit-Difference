import java.util.*;


class Rohan
{
	public static void main (String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		while(n>0)
		{
		    n--;
		    String str[]=br.readLine().trim().split("\\s+");
		    String str1=Integer.toBinaryString(Integer.parseInt(str[0]));
		    String str2=Integer.toBinaryString(Integer.parseInt(str[1]));
		    int count=0;
		    
		    if(str1.length()>str2.length())
		    {
		        int x=str1.length()-str2.length();
		        while(x!=0)
		        {
		            str2="0"+str2;
		            x--;
		        }
		        
		    }
		    else if(str2.length()>str1.length())
		    {
		        int x=str2.length()-str1.length();
		        while(x!=0)
		        {
		            str1="0"+str1;
		            x--;
		        }
		        
		    }
		    System.out.println(str1+" "+str2);
		    for(int i=0;i<str1.length();i++)
		    {
		        if(str1.charAt(i)==(str2.charAt(i)))
		        {
		            
		        }
		        else
		        {
		            count++;
		        }
		    }
		  
		}
	}
}
