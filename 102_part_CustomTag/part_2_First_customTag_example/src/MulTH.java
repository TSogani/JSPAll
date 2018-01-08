package info.inetsolv;
import javax.servlet.jsp.tagext.TagSupport;
import javax.servlet.jsp.*;
import java.io.*;


public class MulTH extends TagSupport{

	private int pone;
	private int ptwo;
	
	public void setPone(int pone){
		this.pone= pone;
	}

	public void setPtwo(int ptwo){
		this.ptwo= ptwo;
	}
	@Override
	public int doEndTag(){
		int result = pone*ptwo;
		try
		{
		JspWriter out = pageContext.getOut();
		out.println(result);
		}catch(IOException ie){
			ie.printStackTrace();
		}
		return EVAL_PAGE;
	}
	

}