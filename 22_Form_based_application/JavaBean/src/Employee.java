package info.inetsolv;
public class Employee implements Serializable{
	public Employee(){
		// use no-opp 
	}
	/*
	we use serializable in java bean. because we use javabean for managing the load. ( load balanceing)
	 we can write businesslogic in servlet but we can not reuse. so we recommended to write business in javaBean. 
	
	javabean contains :-
		1) property
		2) events
		3) additional method
1) property:-
	
	- property name and instance variable name may be different,  but recommended to use property name same as instance variable. 
	- property name we get via setter and getter method. 
	
	in case of boolean we use instance of getter()  write isXXX(). 

2) event:-
	void addXXXListener(XXXListener l)
	void removeXXXListener(XXXListener l)
		
	*/
}