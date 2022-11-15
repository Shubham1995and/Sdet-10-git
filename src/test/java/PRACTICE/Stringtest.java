package PRACTICE;

public class Stringtest {

	public static void main(String[] args) {
		
		int count=0;
		
		String sbi="Test@yantra12";
		
		for(int i=0;i<sbi.length()-1;i++)
		{
			char ch=sbi.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				count++;
			}
		}
		System.out.println(count);
		
		for(int i=0;i<sbi.length()-1;i++)
		{
			char ch=sbi.charAt(i);
			if(ch>='a' && ch<='a')
			{
				count++;
			}
		}
		System.out.println(count);
		for(int i=0;i<sbi.length()-1;i++)
		{
			char ch=sbi.charAt(i);
			if(ch>='0' && ch<='9')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
