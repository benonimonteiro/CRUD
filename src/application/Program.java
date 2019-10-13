package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DBException;

public class Program {

	public static void main(String[] args) {
		
		Connection conn = DB.getConnection();
		System.out.println("connection stablished successfully");
		DB.closeConnection();
	}
}
