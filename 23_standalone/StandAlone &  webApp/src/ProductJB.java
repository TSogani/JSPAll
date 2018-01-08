package info.inetsolv;
import java.sql.*;
public class ProductJB{
	private Integer pid;
	private String name;
	private Double price;
	
	public void setPid(int pid){
		this.pid= pid;
	}
	public Integer getPid(){
		return pid;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}public void setPrice(Double price){
		this.price= price;
	}
	public Double getPrice(){
		return price;
	}
	
	public boolean storeData(){
		Connection con = null;
		PreparedStatement pstmt= null;
		boolean isStore=false;
		try{	
		
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hibernate","hibernate");
		String query="insert into product values(?,?,?)";
		pstmt=con.prepareStatement(query);
		pstmt.setInt(1,pid);
		pstmt.setString(2,name);
		pstmt.setDouble(3,price);
		pstmt.executeUpdate();
		isStore=true;
		}
		catch(SQLException sql){
			sql.printStackTrace();
		}
		finally{	
			try{
				pstmt.close();
			}catch(SQLException s1){
				s1.printStackTrace();
			}

			try{
				con.close();
			}catch(SQLException s){
				s.printStackTrace();
			}
		}
		return isStore;
	}
	
}