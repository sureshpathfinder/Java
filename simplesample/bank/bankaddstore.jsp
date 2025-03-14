
<%@ page language="Java" import="java.sql.*" %>


<jsp:useBean id="bbank" scope="request" class="bank.Addbank">
<jsp:setProperty name="bbank" property="*"/>
</jsp:useBean>

  <%

       String bcode=request.getParameter("bcode"); 
       String bname=request.getParameter("bname");
       String loca=request.getParameter("loca");
       String nstop=request.getParameter("nstop");
       String photo1=request.getParameter("photo1");       
       String photo2=request.getParameter("photo2");
       String head=request.getParameter("head");
       String bott=request.getParameter("bott");
       String dbank=request.getParameter("dbank");
       String mname=request.getParameter("mname");
       String nemp=request.getParameter("nemp");
       String timing=request.getParameter("timing");
       String pno=request.getParameter("pno");
       String add=request.getParameter("add");
       String webs=request.getParameter("webs");
  
       
       if(bcode.trim().length()==0 || bname.trim().length()==0 || loca.trim().length()==0 || nstop.trim().length()==0 || photo1.trim().length()==0 || photo2.trim().length()==0 || head.trim().length()==0 || bott.trim().length()==0 || dbank.trim().length()==0 || mname.trim().length()==0 || nemp.trim().length()==0 || timing.trim().length()==0 || pno.trim().length()==0 || add.trim().length()==0 || webs.trim().length()==0 )
       {
       bbank.flag=true;
       %>
      <jsp:forward page="bankdetails.jsp"/>
      <%
      }
      else
      {
      out.println("All Datas Entered sucessfull");
      }
          
        try
        {
        
		 
           Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    		 Connection con = DriverManager.getConnection("jdbc:odbc:shop","sa","");

           PreparedStatement pst=con.prepareStatement("insert into banktable(B_Code,B_Name,Location,N_Stop,Photo1,Photo2,Head,Buttom,D_Bank,M_Name,N_Emp,Timing,P_NO,Address,WebSite) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
           pst.setString(1,bcode);
           pst.setString(2,bname);
           pst.setString(3,loca);
           pst.setString(4,nstop);
           pst.setString(5,photo1);
           pst.setString(6,photo2);
           pst.setString(7,head);
           pst.setString(8,bott);
           pst.setString(9,dbank);
           pst.setString(10,mname);
           pst.setString(11,nemp);
           pst.setString(12,timing);
           pst.setString(13,pno);
           pst.setString(14,add);
           pst.setString(15,webs);

           int i=pst.executeUpdate();
           if(i==1)
           {
             response.sendRedirect("bankdetails.jsp");
           }
	    	 
	    	  
  %>
  <%  }  catch(Exception sql)
           {
              out.println("Sql Exception" + sql);
             } 
             
  %>
		 



  
