 Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/md","root","root");
        Statement st=con.createStatement();
        System.out.println("enter jdbc print");
        Scanner s=new Scanner("System.in");
        System.out.println("Enter id");
        
        String id=s.nextLine();
        System.out.println("Enter name");
        String name=s.nextLine();
        System.out.println("Enter city");
        String city=s.nextLine();
        
        String sql_query="insert into student values('"+id+"', '"+name+"','"+city+"')";
        
        int rowCount=st.executeUpdate(sql_query);
        if(rowCount>0)
            
        {
            System.out.println("------------------------------\r\n" + 
					"Values inserted successfully\r\n" + 
					"------------------------------");
        }else{
            System.out.println("------------------------------\r\n" + 
					"Values insertion failed\r\n" + 
					"------------------------------");
        }
        con.close();
        Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/md","root","root");
        Statement st1=con1.createStatement();
        ResultSet rs1=st1.executeQuery("select * from student");
        while(rs1.next())
        {
            System.out.println(rs1.getString(1));
            System.out.println(",  "+rs1.getString(2));
             System.out.println(",  "+rs1.getString(3));
             
        }
        con1.close();
    }
    
}
