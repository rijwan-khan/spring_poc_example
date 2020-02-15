package in.nit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="contacttab")
public class ContactInfo {
	@Id
	@Column(name="sno")
	@GeneratedValue
	private Integer sno;
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;
	@Column(name="phoneno")
	private Long phonNo;
	@Column(name="activeswich")
	private boolean activeSwich=true;
	public ContactInfo() {
		// TODO Auto-generated constructor stub
	}
	public Integer getSno() {
		return sno;
	}
	public void setSno(Integer sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhonNo() {
		return phonNo;
	}
	public void setPhonNo(Long phonNo) {
		this.phonNo = phonNo;
	}
	public boolean getActiveSwich() {
		return activeSwich;
	}
	public void setActiveSwich(boolean activeSwich) {
		this.activeSwich = activeSwich;
	}
	public ContactInfo(Integer sno, String name, String email, Long phonNo, boolean activeSwich) {
		super();
		this.sno = sno;
		this.name = name;
		this.email = email;
		this.phonNo = phonNo;
		this.activeSwich = activeSwich;
	}
	@Override
	public String toString() {
		return "ContactInfo [sno=" + sno + ", name=" + name + ", email=" + email + ", phonNo=" + phonNo
				+ ", activeSwich=" + activeSwich + "]";
	}
	
}
