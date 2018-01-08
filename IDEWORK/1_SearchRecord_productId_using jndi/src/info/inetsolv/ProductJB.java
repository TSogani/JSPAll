package info.inetsolv;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductJB{
	
	private Integer pid;
	private String name;
	private Double price;
	
	public void setPid(Integer pid){
		this.pid = pid;
	}
	public Integer getPid(){
		return pid;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setPrice(Double price){
		this.price = price;
	}
	public Double getPrice(){
		return price;
	}
	
	public boolean storeData(){
		boolean isStore = false;	
		Connection con =null;
		PreparedStatement pstmt= null;
		Object obj = null;
		try{
	
		/*	
		obj = JndiConnectionFactory.getJndiInstance();
		System.out.println("jb obj___________________"+obj);
		
		System.out.println("___________________");
		
		DataSource ds = (DataSource)obj;
		
		System.out.println("jb ds____________"+ds);
		con = ds.getConnection();
		System.out.println("jb Con_________"+con);
		*/
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			// Driver d = new oracle.jdbc.driver.OracleDriver();
			// DriverManager.registerDriver(d);
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "hibernate", "hibernate");

			System.out.println(con);
			
		String query="insert into product values(?,?,?)";
		pstmt = con.prepareStatement(query);
		pstmt.setInt(1,pid);
		pstmt.setString(2,name);
		pstmt.setDouble(3,price);
		pstmt.executeUpdate();
		isStore = true;
		}
		catch(SQLException sql){
			sql.printStackTrace();
		}
		finally{
			try{
				if(pstmt != null){
					pstmt.close();
				}
			}catch(SQLException sq){
				System.out.println("p_satement problem");
			}
			try{
				if(con != null){
					con.close();
				}
			}catch(SQLException sq){
				System.out.println("Connection problem");
			}
		}
		return isStore;
	}
}