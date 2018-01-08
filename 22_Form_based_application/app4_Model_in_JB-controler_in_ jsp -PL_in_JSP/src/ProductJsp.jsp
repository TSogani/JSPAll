<%@ page import="info.inetsolv.*"%>
<%
			try{
			int pid =  (Integer.parseInt(request.getParameter("pid")));
			String name = request.getParameter("name");
			Double price = (Double.parseDouble(request.getParameter("price")));
			
			ProductJB pjb=new ProductJB();
			
			pjb.setPid(pid);
			pjb.setName(name);
			pjb.setPrice(price);
			
			Boolean isStore = pjb.storeData();
			
			if(isStore == true){
				
				request.setAttribute("pid",pid);
				request.setAttribute("name",name);
				request.setAttribute("price",price);
				
				RequestDispatcher rd = request.getRequestDispatcher("Display.jsp");
				rd.forward(request,response);
		
			}else{
			out.print("Product not stored...! <a href=Product.html>try Again..!!</a>");
			}
		}catch(NumberFormatException ne){
			out.println("please Enter Valid data "+ne.getMessage());
			out.println("try again <a href=Product.html>try Again..!!</a>");
		}
	%>