import java.util.HashMap;

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
		String [] vars=s.split(",");
		HashMap<String,Double> hm=new HashMap();
		for(String var:vars)
		{
			String[] lines=var.split("=");
			hm.put(lines[0],Double.valueOf(lines[1]));
		}
		String out="";
		double out_num=0;
		boolean f1=false;//false代表 并非全部变量给出了初值
		for(section se:sec)
		{
			Double cnt=(Double)se.cnt;
			String element="";
			for(String var:se.st)
			{
				if(hm.containsKey(var))
				{
					cnt*=hm.get(var);
				}
				else
				{
					element+=("*"+var);
					f1=true;
				}
			}
			//判断se后的符号，然后决定out_num是+=还是-=
			//out=out+se.*+element.substring(0, element.length()-1);   *代表每个se后的加减号
		}
		if(f1=true)
		{
			System.out.println("resul:"+out_num);
		}
		else
		{
			System.out.println(out);
		}
		
		return ;
	}
	public void d(String s,section [] sec)
	{
		
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
