/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2;

import java2.DBLoader2;
import java.sql.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class RDBMS_to_JSON 
{

    public String generateJSON(String SQLStatement) 
    {
        String JSONans = "";

        try {
            
            ResultSet rs = DBLoader2.executeQuery(SQLStatement);
            System.out.println("ResultSet Created");

            ResultSetMetaData rsmd = rs.getMetaData();

            int n = rsmd.getColumnCount();

            JSONObject ansobject = new JSONObject();

            //Define JSONArray
            JSONArray jsonArray = new JSONArray();

            ansobject.put("ans", jsonArray);

            while (rs.next()) 
            {
                //Create object for single row 
                JSONObject singlerow = new JSONObject();

                for (int j = 1; j <= n; j++) 
                {
                    String clname = rsmd.getColumnLabel(j);
                    //System.out.println(clname);

                    //Fill data in Single Row Object
                    singlerow.put(clname, rs.getString(clname));
                }

                //Add single object in array
                jsonArray.add(singlerow);
            }

            return (ansobject.toJSONString());

            ///////////////////////
        } catch (Exception e) {
            e.printStackTrace();
        }

        return JSONans;
    }

    public static void main(String[] args) 
    {
        System.out.println(new RDBMS_to_JSON().generateJSON("select * from EMP"));
    }
}

