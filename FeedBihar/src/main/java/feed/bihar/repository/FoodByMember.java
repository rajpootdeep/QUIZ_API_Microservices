package feed.bihar.repository;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Type;
import org.springframework.format.annotation.DateTimeFormat;


@javax.persistence.Entity
public class FoodByMember {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private int mid;
	private String food;
	private int noofperson;
	
	
	
	private String mobile;
	private String remark;
	
private String status;
	private String remarks;
	
	
	public FoodByMember () {
		
	}
	
	
	
	
	
	public FoodByMember(Long id, int mid, String food, int noofperson, String mobile, String remark, String status,
			String remarks) {
		super();
		this.id = id;
		this.mid = mid;
		this.food = food;
		this.noofperson = noofperson;
		this.mobile = mobile;
		this.remark = remark;
		this.status = status;
		this.remarks = remarks;
		
	}





	





	public void setId(long id) {
		this.id = id;
	}





	public Long getId() {
		return id;
	}



	



	public int getMid() {
		return mid;
	}



	public void setMid(int mid) {
		this.mid = mid;
	}



	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public int getNoofperson() {
		return noofperson;
	}

	public void setNoofperson(int noofperson) {
		this.noofperson = noofperson;
	}

//	public Date getDate() {
//		return date;
//	}
//
//	public void setDate(Date date) {
//		this.date = date;
//	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
	
	
	
	
}
