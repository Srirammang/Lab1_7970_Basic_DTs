
public class PolyExamples {
	public class Fun_OL {
}
    
    public PolyExamples(int a)
    {
   	 System.out.println(a);
    }
    public PolyExamples(char ch,int b)
    {
   	 System.out.println(ch+" "+b);
    }
	//data type of parameters
	public void show(int a)
	{
		System.out.println(a);
	}
	public void show(char ch)
	{
		System.out.println(ch);
	}
	//number of parameters
	public void dis(int a)
	{
		System.out.println(a);
	}
	public void dis(int x,int y)
	{
		System.out.println(x+y);
	}
	//sequence of parameter
	public void call(float f,char c)
	{
		System.out.println(f+" "+c);
	}
	public void call(char ch,float f1)
	{
		System.out.println(ch+" "+f1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    PolyExamples ob=new PolyExamples(3);
    PolyExamples ob2=new PolyExamples('d',5);
    ob.show(7);
    ob.show('k');
    ob.dis(4);
    ob.dis(3,4);
    ob.call('a', 6.7f);
    ob.call(7.8f,'a');
    
	}

}


