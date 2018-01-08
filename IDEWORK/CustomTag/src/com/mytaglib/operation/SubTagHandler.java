package com.mytaglib.operation;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class SubTagHandler extends TagSupport{
	private int pOne;
	
	private int pTwo;

	
	public int getpOne() {
		return pOne;
	}


	public void setpOne(int pOne) {
		this.pOne = pOne;
	}


	public int getpTwo() {
		return pTwo;
	}


	public void setpTwo(int pTwo) {
		this.pTwo = pTwo;
	}


	@Override
	public int doEndTag() throws JspException {

				
		int result = pOne - pTwo;
		
		JspWriter  out = pageContext.getOut();
		try {
			out.println("from sub tag handlar"+result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return EVAL_PAGE;
	}
}
