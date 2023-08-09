package feed.bihar.repository;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;


@Entity
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false, updatable = false)
	//@CurrentTimestamp
	//@CreationTimestamp
	@CreationTimestamp
	private Date edate;
	private String hname;
	private String mname;
	private String mobile;
	@Column(nullable = true)
	private String addr;
	private String email;
	private String status;
	private String pass;
	
	
	
	
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Member(int id, Date edate, String hname, String mname, String mobile, String addr, String pass, String email,String status) {
		super();
		this.id = id;
		this.edate = edate;
		this.hname = hname;
		this.mname = mname;
		this.mobile = mobile;
		this.addr = addr;
		this.pass=pass;
		this.email=email;
		this.status=status;
		
	}

	public Member() {
		
	}
	
	
	
	


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Date getEdate() {
		return edate;
	}


	public void setEdate(Date edate) {
		this.edate = edate;
	}


	public String getHname() {
		return hname;
	}


	public void setHname(String hname) {
		this.hname = hname;
	}


	public String getMname() {
		return mname;
	}


	public void setMname(String mname) {
		this.mname = mname;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	
	
	
}
