
public class lib1_compute {
	public void simplify(String s,section [] sec)
	{
		if(s=="")
		{
			String out ="";
			for(section element:sec)
			{
				
				
				out=out+element.val;
				for(int x=0;x<element.cnt;x++)
				{
					out+="*";
					out+=element.st[x];
				}
				//out+=element.+   需要定义每项后的符号
					
			}
			out=out.substring(0,out.length()-1);
			System.out.println("the expression is:"+out);
			return ;
		}
		
	}
	
}

/*
 *class section{
	boolean flag;//judge a section have a var or not
	int val;//the xishu of the section and if the section have no var val means the value of the section
	int cnt;//the number of the var in the section
	String [] st = new String[100] ;//the var in the section
	int [] pow=new int [100];//the pow of each var in the section
} 
 */
