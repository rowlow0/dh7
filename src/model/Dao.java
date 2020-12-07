package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Dao {
private Connection con;
private PreparedStatement pstmt;
private ResultSet rs;
StringBuffer query=new StringBuffer();
List<Dto> list=new ArrayList<Dto>();

public Connection connect() {
	try{Class.forName("oracle.jdbc.OracleDriver");
	con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orcl","system6","1234");}
	catch(ClassNotFoundException e) {e.printStackTrace();}
	catch(SQLException e) {e.printStackTrace();}
	catch(Exception e) {e.printStackTrace();}
return con;}

public void close(Connection con,PreparedStatement pstmt,ResultSet rs) {
	if(con!=null) {
		try{con.close();}catch(SQLException e) {e.printStackTrace();}
	}
	if(pstmt!=null) {
		try{pstmt.close();}catch(SQLException e) {e.printStackTrace();}
		
}
	if(rs!=null) {
		try{rs.close();}catch(SQLException e) {e.printStackTrace();}
}
}

public void insert(Dto dto) {
	query.append("insert into personnel values(?,?,?,?,?,?)");
	try {
		con=connect();
		pstmt=con.prepareStatement(query.toString());
		pstmt.setString(1, dto.getId());
		pstmt.setString(2, dto.getName());
		pstmt.setString(3, dto.getDept());
		pstmt.setString(4, dto.getPosition());
		pstmt.setString(5, dto.getDuty());
		pstmt.setString(6, dto.getPhone());
		pstmt.executeUpdate();
	}catch(SQLException e) {e.printStackTrace();}finally{close(con,pstmt,rs);}
}

public void delete(Dto dto) {
	query.append("delete personnel where name=? and id=?");
	try {
		con=connect();
		pstmt=con.prepareStatement(query.toString());
		pstmt.setString(2, dto.getId());
		pstmt.setString(1, dto.getName());
		System.out.println(dto.getId());
		System.out.println(dto.getName());
		pstmt.executeUpdate();
	}catch(SQLException e) {e.printStackTrace();}finally{close(con,pstmt,rs);}
	
}

public void update(Dto dto) {
	query.append("update personnel set name=?,dept=?,position=?,duty=?,phone=? where id=?");
	try {
		con=connect();
		pstmt=con.prepareStatement(query.toString());
		pstmt.setString(1, dto.getName());
		pstmt.setString(2, dto.getDept());
		pstmt.setString(3, dto.getPosition());
		pstmt.setString(4, dto.getDuty());
		pstmt.setString(5, dto.getPhone());
		pstmt.setString(6, dto.getId());
		pstmt.executeUpdate();
	}catch(SQLException e) {e.printStackTrace();}finally{close(con,pstmt,rs);}
}

public List<Dto> selectDept(Dto dto){
	query.append("select *from personnel where dept=?");
	try {
		con=connect();
		pstmt=con.prepareStatement(query.toString());
		pstmt.setString(1, dto.getDept());
		rs=pstmt.executeQuery();
		if(rs==null) {System.out.println("rs is null");}
		while(rs.next()) {
			Dto dtoLi=new Dto();
			dtoLi.setId(rs.getString(1));
			dtoLi.setName(rs.getString(2));
			dtoLi.setDept(rs.getString(3));
			dtoLi.setPosition(rs.getString(4));
			dtoLi.setDuty(rs.getString(5));
			dtoLi.setPhone(rs.getString(6));
			list.add(dtoLi);
		}
	}catch(SQLException e) {e.printStackTrace();}finally{close(con,pstmt,rs);}
	return list;
}

public List<Dto> selectId(Dto dto){
	query.append("select *from personnel where id=?");
	try {
		con=connect();
		pstmt=con.prepareStatement(query.toString());
		pstmt.setString(1, dto.getId());
		rs=pstmt.executeQuery();
		while(rs.next()) {
			Dto dtoLi=new Dto();
			dtoLi.setId(rs.getString(1));
			dtoLi.setName(rs.getString(2));
			dtoLi.setDept(rs.getString(3));
			dtoLi.setPosition(rs.getString(4));
			dtoLi.setDuty(rs.getString(5));
			dtoLi.setPhone(rs.getString(6));
			list.add(dtoLi);
		}
	}catch(SQLException e) {e.printStackTrace();}finally{close(con,pstmt,rs);}
	return list;
}


}
