package dBTOOBJECTOBJECTTOPOJO;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.commons.text.StringEscapeUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class jsontojava {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, JsonGenerationException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
Class.forName("com.mysql.cj.jdbc.Driver");
Connection conn=null;

//Convert into ARRAY jSON
JSONArray ja = new JSONArray();

ArrayList<CustomerDetails> a=new ArrayList<CustomerDetails>();

conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Business", "root", "root");

//object of statement class will help us to execute queries
Statement st=conn.createStatement();
ResultSet rs=st.executeQuery("select * from CustomerInfo where location = 'Asia' and purchasedDate=curdate();");
while(rs.next())
{
	CustomerDetails c=new CustomerDetails();
	//3 different json files, 3 diff java objects
	c.setCourseName(rs.getString(1));
	c.setPurchasedDate(rs.getString(2));
	c.setAmount(rs.getInt(3));
	c.setLocation(rs.getString(4));
	a.add(c);
	
}
for(int i=0;i<a.size();i++)
{
	
	// to create file of JSON
	ObjectMapper o=new ObjectMapper();
	o.writeValue(new File("/home/anurag/eclipse-workspace/dataDriven/customerInfo"+i+".json"),a.get(i));
	
	//Convert object into String using GSON
	Gson g = new Gson();
	String obj= g.toJson(a.get(i));
	ja.add(obj);
}
//Convert into a array json
JSONObject jo = new JSONObject();
jo.put("data", ja);
System.out.println(jo.toJSONString());
// Remove unescape string from json using Apache common text
String unescapejson=StringEscapeUtils.unescapeJava(jo.toString());

String string1=unescapejson.replace("\"{", "{");
string1.replace("}\"", "}");
System.out.println(string1);

FileWriter fw = new FileWriter("/home/anurag/eclipse-workspace/dataDriven/singlejson.json");
fw.write(string1);
conn.close();

	}

}