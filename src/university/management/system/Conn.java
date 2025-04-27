/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package university.management.system;

import java.sql.*;


public class Conn {

    Connection c;
    Statement s;
    public Conn() {
       
        try {
            Class.forName("org.postgresql.Driver");

            String url = "jdbc:postgresql://localhost:5432/UniversityManagementSystem";
            String username = "postgres";
            String password = "Nithish@18";
            c = DriverManager.getConnection(url, username, password);
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        
        }
        
    }

   }
