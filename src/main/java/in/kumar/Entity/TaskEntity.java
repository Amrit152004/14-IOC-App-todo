package in.kumar.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TaskEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer tId;
	private String temailid;
	private  String tname;
	private  String tdate;
	private String ttime;
	public Integer gettId() {
		return tId;
	}
	public void settId(Integer tId) {
		this.tId = tId;
	}
	public String getTemailid() {
		return temailid;
	}
	public void setTemailid(String temailid) {
		this.temailid = temailid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTdate() {
		return tdate;
	}
	public void setTdate(String tdate) {
		this.tdate = tdate;
	}
	public String getTtime() {
		return ttime;
	}
	public void setTtime(String ttime) {
		this.ttime = ttime;
	}

}
