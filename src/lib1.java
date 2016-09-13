import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class lib1 {
	public static section [] expression(String ss){
		section [] temp=new section[1000];
		for(int x=0;x<temp.length;x++)
		{
			temp[x]=new section();
		}
		int len=ss.length();
		char [] vars=ss.toCharArray();
		char [] array= new char [100];
		int cnt=0;
		for(int i=0;i<len;){
			boolean f1=false,f2=false,f3=false;
			cnt++;
			System.out.println(cnt);
			temp[cnt].val=1;
			temp[cnt].cnt=0;
			StringBuffer temps = new StringBuffer("");
			for(int j=0;j<len && vars[j]!='-' && vars[j]!='+';j++,i=j+1){
				if(vars[j]>='0' && vars[j]<='9' && f1==false && f3==true){
					if(!temps.toString().equals("")){
						String s=temps.toString();
						temp[cnt].st[temp[cnt].cnt]=s;
					}
					temp[cnt].val=vars[j];
					f2=false;
					f1=true;
					f3=false;
				}
				else if(vars[j]>='0' && vars[j]<='9' && f1==true){
					temp[cnt].val*=10;
					temp[cnt].val+=vars[j];
				}
				else if(vars[j]>='a' && vars[j]<='z' && f2==false){
					temps=new StringBuffer("");
					temp[cnt].cnt+=1;
					f1=false;
					f3=false;
					temps.append(vars[j]);
					temp[cnt].pow[temp[cnt].cnt]=1;
					f2=true;
					//String s=sb.toString();
					//temp[cnt].[temp[cnt].cnt]=
				}
				else if(vars[j]>='a' && vars[j]<='z' && f2==true){
					temps.append(vars[j]);
				}
				else if(vars[j]=='^'){
					f1=false;
					f2=false;
					f3=true;
					temp[cnt].pow[temp[cnt].cnt]=0;
				}
				else if(f3){
					temp[cnt].pow[temp[cnt].cnt]*=10;
					temp[cnt].pow[temp[cnt].cnt]+=vars[j];
				}
			}
		}
		return temp;
	}
	public static void main(String [] args) throws Exception
	{
//		BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
//		String s=br.readLine();
//		System.out.println(s);
//		section [] sec = new section[100];
//		String regx="((((([a-zA-Z]|([0-9]+))\*){0,10})(([a-zA-Z]|([0-9]+)))[/+/-]){0,10})((([a-zA-Z]|([0-9]+))\*){0,10})(([a-zA-Z]|([0-9]+)))";
//		s="x*y*2+35*z";
//		s.matches("")
		section[] a = expression("x*y*2+35*z");
		
	}
	
}
class section{
	boolean flag;//judge a section have a var or not
	int val;//the xishu of the section and if the section have no var val means the value of the section
	int cnt;//the number of the var in the section
	String [] st = new String[100] ;//the var in the section
	int [] pow=new int [100];//the pow of each var in the section
}