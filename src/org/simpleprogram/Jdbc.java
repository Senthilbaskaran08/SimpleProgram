package org.simpleprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc {
public static void main(String[] args) {
	Class.forName("");
  Connection conn = DriverManager.getConnection(url);
   Statement state = conn.createStatement();
   ResultSet set = state.executeQuery("sql query");
   while(set.next()) {
	   System.out.println(set.getString("columnname"));
   }
}
}
