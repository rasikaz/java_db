//import <your_DB_file_path>
import DB;

//initialize you DB class
DB db = new DB();

//getdata ussing resultset
String sql = "<your select query>";
ResultSet rs = db.getData(sql);

//insert/update/delete
String sql="<your query>"
boolean isOk = db.putData(sql);

/*
delete query example:
	String  sql = "delete from temp_item_tbl where jobID= '"+jid+"' AND ItemID= '"+itemid+"'";

update query example:
	String sql2= "update final_job_table "
                + "set fin_hh = '"+sub_HH+"',"
                + "fin_mm = '"+sub_MM+"',"
                + "fin_am_pm = '"+getAMOrPM2()+"',"
                + "description = '"+description+"' where jid = '"+jobID+"'";

 insert query example:
 	String sql_insert1 =  "insert into subjob(jid, sub_des,sub_hh, sub_mm, sub_am_pm)"
         + "values('"+jobID+"','"+des+"','"+sub_HH+"','"+sub_MM+"', '"+getAMOrPM2()+"')";
*/