package com.connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Connection con=MyConnection.openConnection();
     String SQL_INSERT ="insert into Book Values(1,'Core Java','Citi publication','Author1',123)";
     String SQL_FINAL ="select * from Book";
     try {
    	 Statement st=con.createStatement();
    	 /*int rows=st.executeUpdate(SQL_INSERT);
    	 if(rows>0)
    	 {
    		 System.out.println("row added successfulyy");
    	 }
    	 else {
    		 System.out.println("sorry");
    	 }*/
    	// st.executeQuery(SQL_INSERT);
    	 ResultSet set = st.executeQuery(SQL_FINAL); 
    	 while(set.next()) {
    		 int ISBN=set.getInt(1);
    		 String bookName=set.getString(2);
    		 String bookPublication=set.getString(3);
    		 String author=set.getString(4);
    		 float price=set.getFloat(5);
    		 System.out.println("ISBN:"+ISBN+"\tbookName:"+bookName+"\tbookPublication:"+bookPublication+"\tauthor:"+author+"\tprice:"+price);
    	 }
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     }

}
