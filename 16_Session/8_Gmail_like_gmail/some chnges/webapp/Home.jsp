<!DOCTYPE html>
<html>
<head>
<style>
#header {
    background-color:pink;
    color:white;
    text-align:right;
    padding:5px;
}
#nav {
    line-height:30px;
    background-color:#eeeeee;
    height:490px;
    width:100px;
    float:left;
    padding:5px;	      
}
#section {
    width:350px;
    height:480px;
    float:left;
    padding:10px;	 	 
}
#aside {
    width:1080px;
    height:480px;
    float:left;
    padding:10px;	
	overflow: scroll;	
}
#footer {
    background-color:black;
    color:white;
    clear:both;
    text-align:center;
   padding:5px;	 	 
}
</style>
</head>
<body>
							<div id="header">
								<%@ include file="Header.jsp"%>
							</div>

<div id="nav">
	<%@ include file="SlideHeader.jsp"%>
</div>

						<div id="aside">
							<%@ include file="One.jsp"%>
						</div>

<div id="footer">
Copyright © gmail.com
</div>

</body>
</html>
