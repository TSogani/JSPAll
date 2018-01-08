package info.inetsolv;
public class Cone{

	public Integer eno;
	public String name;
	
	
	public void setEno(Integer eno){
		this.eno = eno;
	}
	public void setName(String name){
		this.name = name;
	}
	public Integer getEno(){
		return eno;
	}
	public String getName(){
		return name;
	}
	
	
	static{
		
		System.out.println("Cone static block called");
	
	}
}