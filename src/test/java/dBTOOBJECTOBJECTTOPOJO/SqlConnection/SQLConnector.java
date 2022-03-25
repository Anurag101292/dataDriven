package dBTOOBJECTOBJECTTOPOJO.SqlConnection;

import java.sql.Connection;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;



import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;

public enum SQLConnector {
    INSTANCE;
   // private static Logger log	=LogManager.getLogger(SQLConnector.class.getName());
    public void executeSqlQuery(String sqlQuery, String var) {
        String dbUrl = GetPropertyvalue.getpropertyvalue("dburl");
        String dbusername = GetPropertyvalue.getpropertyvalue("dbusername");
        String dbpassword = GetPropertyvalue.getpropertyvalue("dbpassword");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        //    log.info(" System.out.println(\"Trying to connect\");");

            try (Connection con = DriverManager.getConnection(dbUrl, dbusername, dbpassword)) {
             //   log.info("Connection Established Successfull and the DATABASE NAME IS:"
             //           + con.getMetaData().getDatabaseProductName());

                try (Statement stmt = con.createStatement()) {

                    try (ResultSet rs = stmt.executeQuery(sqlQuery))
                    {  //  log.info(sqlQuery);
                        QueryResponsedata.getInstance().getQueryResponsedata().put(var, getResponse(rs));
                    }
                }
            }
        }

        catch (SQLException se)
        {

            se.printStackTrace();
        } catch (Exception e)
        {

            e.printStackTrace();
        }
    }

    private List<Map<String, String>> getResponse(ResultSet rs) throws SQLException {
        List<Map<String, String>> resultSet = new ArrayList<Map<String, String>>();
        List<String> columnName = new ArrayList<String>();
        while (rs.next()) {
            if (rs.getMetaData().getColumnCount() != 0)
            {
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++)
                {
                    System.out.println(rs.getMetaData().getColumnCount());
                    columnName.add(rs.getMetaData().getColumnName(i));
                }
            }
            Map<String, String> map = new HashMap<>();
            for (String col : columnName) {
                System.out.println(col);
                map.put(col, rs.getString(col));
            }
            resultSet.add(map);
        }
        return resultSet;
    }}
