/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import java.sql.*;

/**
 *
 * @author CHETHAKA
 */
public class dbConnection 
{   
    private static Connection con = null;
    
    public static Connection dbConnection()
    {   try
        {   con= DriverManager.getConnection("jdbc:mysql://localhost:3306/bill?zeroDateTimeBehavior=convertToNull","root","");
            System.out.println("Success Save");
            
        }catch(Exception e)
         {  System.out.println(e.getMessage());
         }
    return con;
    
    }
    
    
}
