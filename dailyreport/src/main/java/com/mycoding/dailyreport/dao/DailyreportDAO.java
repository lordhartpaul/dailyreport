package com.mycoding.dailyreport.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Service;

import com.mycoding.dailyreport.model.Dailyreport;





@Service
public class DailyreportDAO {
	
	
JdbcTemplate template;
	
	@Autowired
	public void setDataSource(DataSource datasource) {
		template = new JdbcTemplate(datasource);
	}
	
	public void save(Dailyreport p)
	{
		String sql = "insert into dailyreport(date,candidate_name,mobile_number,email_id,client,req_name,ams_req_id,ams_candidate_id,weekday_interview_scheduled,weekday_interview_happened,weekend_interview_scheduled,selects) values ('"+ConvertDate(p.getDate())+"','"+p.getCandidate_name()+"',"+p.getMobile_number()+",'"+p.getEmail_id()+"','"+p.getClient()+"','"+p.getReq_name()+"',"+p.getAms_req_id()+","+p.getAms_candidate_id()+","+p.getWeekday_interview_scheduled()+","+p.getWeekday_interview_happened()+","+p.getWeekend_interview_scheduled()+","+p.getSelects()+")";
	
	    template.update(sql);
	
	}
	
public List<Dailyreport> getAllDailyreports(){
		
		return template.query("select * from dailyreport", new ResultSetExtractor<List<Dailyreport>>() {
			
			public List<Dailyreport> extractData(ResultSet rs) throws SQLException,DataAccessException
			{
				List<Dailyreport> list = new ArrayList<Dailyreport>();
				while(rs.next())
				{
					Dailyreport e = new Dailyreport();
					e.setId(rs.getInt(1));
					e.setDate(rs.getDate(2));
					e.setCandidate_name(rs.getString(3));
					e.setMobile_number(rs.getInt(4));
					e.setEmail_id(rs.getString(5));
					e.setClient(rs.getString(6));
					e.setReq_name(rs.getString(7));
					e.setAms_req_id(rs.getInt(8));
					e.setAms_candidate_id(rs.getInt(9));
					e.setWeekday_interview_scheduled(rs.getInt(10));
					e.setWeekday_interview_happened(rs.getInt(11));
					e.setWeekend_interview_scheduled(rs.getInt(12));
					e.setSelects(rs.getInt(13));
					
					
					list.add(e);
					
					}
				return list;
			}
			
		});
	}

public List<Dailyreport> getDailyreportsByPage(int pageid, int total){
	
	
	String sql = "select * from dailyreport limit "+(pageid-1)+","+total;
	
	return template.query(sql, new ResultSetExtractor<List<Dailyreport>>() {
			
			public List<Dailyreport> extractData(ResultSet rs) throws SQLException,DataAccessException
			{
				List<Dailyreport> list = new ArrayList<Dailyreport>();
				while(rs.next())
				{
					Dailyreport e = new Dailyreport();
					e.setId(rs.getInt(1));
					e.setDate(rs.getDate(2));
					e.setCandidate_name(rs.getString(3));
					e.setMobile_number(rs.getInt(4));
					e.setEmail_id(rs.getString(5));
					e.setClient(rs.getString(6));
					e.setReq_name(rs.getString(7));
					e.setAms_req_id(rs.getInt(8));
					e.setAms_candidate_id(rs.getInt(9));
					e.setWeekday_interview_scheduled(rs.getInt(10));
					e.setWeekday_interview_happened(rs.getInt(11));
					e.setWeekend_interview_scheduled(rs.getInt(12));
					e.setSelects(rs.getInt(13));
					
					
					list.add(e);
					
					}
				return list;
			}
			
		});
	}
	
public Dailyreport getDailyreportById(int id){
	   return template.query("select * from dailyreport where ID="+id,new ResultSetExtractor<Dailyreport>() {
			
			public Dailyreport extractData(ResultSet rs) throws SQLException,DataAccessException
			{
				Dailyreport e = new Dailyreport();
				while(rs.next())
				{
					
					e.setId(rs.getInt(1));
					e.setDate(rs.getDate(2));
					e.setCandidate_name(rs.getString(3));
					e.setMobile_number(rs.getInt(4));
					e.setEmail_id(rs.getString(5));
					e.setClient(rs.getString(6));
					e.setReq_name(rs.getString(7));
					e.setAms_req_id(rs.getInt(8));
					e.setAms_candidate_id(rs.getInt(9));
					e.setWeekday_interview_scheduled(rs.getInt(10));
					e.setWeekday_interview_happened(rs.getInt(11));
					e.setWeekend_interview_scheduled(rs.getInt(12));
					e.setSelects(rs.getInt(13));
					
					
					}
				return e;
			}
			
		});
	
}	

public void update(Dailyreport p)
{
	String sql="update Dailyreport set date='"+ConvertDate(p.getDate())+"',candidate_name='"+p.getCandidate_name()+"', mobile_number ="+p.getMobile_number()+",email_id='"+p.getEmail_id()+"',client='"+p.getClient()+"',req_name='"+p.getReq_name()+"',ams_req_id ="+p.getAms_req_id()+",ams_candidate_id ="+p.getAms_candidate_id()+",weekday_interview_scheduled ="+p.getWeekday_interview_scheduled()+",weekday_interview_happened ="+p.getWeekday_interview_happened()+",weekend_interview_scheduled ="+p.getWeekend_interview_scheduled()+",selects ="+p.getSelects()+" where ID="+p.getId()+"";
    template.update(sql);

}

public void delete(int id) {
	
	String sql="delete from Dailyreport where ID="+id+"";
	template.update(sql);
}

public void delete() {
	
	String sql = "delete from Dailyreport where ID>0";
	template.update(sql);
}
	
private String ConvertDate(Date date) {
		
		String formatDate = "";
		
		try
		{
			DateFormat formatter = new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy");
			date = (Date)formatter.parse(date.toString());
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			formatDate = cal.get(Calendar.YEAR)+"-"+cal.get(Calendar.MONTH)+"-"+cal.get(Calendar.DATE);
			
		}catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return formatDate;
	}

public int count() {
	String sql ="select count(*) from Dailyreport";
	int count = template.queryForObject(sql, Integer.class);
	return count;
}


}
