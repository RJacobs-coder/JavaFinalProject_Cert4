package idnamedatabase.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;

public class IDNameDataBaseJava {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306";
        String user = "root";
        String password = "";
         JFrame frame = new JFrame();

        Connection con = null;
        Statement stmt = null;
        ResultSet result = null;
        String drop;
        String createDatabase;
        String createTable;
        String query;
        String insert;
        String queryUser;

        String useDatabase;

        try {
            
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            
            useDatabase = "USE Assessment;";
            drop = "DROP DATABASE IF EXISTS Assessment;";
            createDatabase = "CREATE DATABASE Assessment;";

            createTable = "CREATE TABLE idname(\n"
                    + "ID INTEGER NOT NULL AUTO_INCREMENT,\n"
                    + "Name VARCHAR(32),\n"
                    + "PRIMARY KEY(ID));";

            query = "SELECT * FROM idname;";

            insert = "INSERT INTO idname\n"
                    + "(Name)\n"
                    + "VALUES\n"
                    + "(\"Robert\"),\n"
                    + "(\"Ryan\"),\n"
                    + "(\"Jessica\"),\n"
                    + "(\"Sue\"),\n"
                    + "(\"Nika\"),\n"
                    + "(\"Ned\"),\n"
                    + "(\"Susan\"),\n"
                    + "(\"Karen\"),\n"
                    + "(\"Bert\"),\n"
                    + "(\"Bob\");";
            
            String userInput = JOptionPane.showInputDialog("Please enter the ID Number here");
            queryUser = "SELECT * FROM idname\n"
                    + "WHERE ID = '" + userInput + "';";

            stmt.execute(drop);
            stmt.execute(createDatabase);
            stmt.execute(useDatabase);
            stmt.execute(createTable);
            stmt.execute(insert);
            stmt.execute(query);
            
            result = stmt.executeQuery(queryUser);

            while (result.next()) {
                int compare = Integer.parseInt(userInput);
               
                
                   
                    int ID = result.getInt("ID");
                    String Name = result.getString("Name");
                
                    JOptionPane.showMessageDialog(frame, "The results of your search is - " +  Name + " - "+ ID); 
            }
            
        } catch (Exception ex) {
            System.out.println("Gone Wrong" + ex.getMessage());
            return;
        } finally {
            try {
                if (result != null) {
                    result.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
                JOptionPane.showMessageDialog(frame, "Please put in an existing ID Number.");
                
            } catch (SQLException ex) {
                System.out.println("SQLException Caught" + ex.getMessage());
            }
        }

    }
}
