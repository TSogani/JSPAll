package info.inetsolv;

public class Product{
	public Product(){
			System.out.println("Constructor  called");
	}
	
	
	private int pid;
	private String name;
	
	public void setPid(int pid){
		this.pid= pid;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public int getPid(){
		System.out.println(pid);
	return pid;
	}
	
	public String getName(){
		System.out.println(name);
	return name;
	}
}
