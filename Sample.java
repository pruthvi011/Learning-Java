class Sample
{
	int id;
 
	String name;
 
	public Sample(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
 
	void display(Sample obj)
	{
		System.out.println("Display Method Executed");
 
		System.out.println("Id: "+id+" Name: "+name);
	}
 
	void show()
	{
		System.out.println("Show method Executed");
 
		display(this);
	}
 
	void info()
	{
		System.out.println("Info method Executed");
 
		display(this);
	}
 
	public static void main(String args[])
	{
		Sample s1=new Sample(101,"Rahul");
 
		s1.show();
 
		Sample s2=new Sample(102,"Sarika");
 
		s2.info();
	}
 
 
}
