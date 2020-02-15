package in.nit.model;

public class Contact {
	
	private Integer sno;
	private String name;
	private String email;
	private Long phonNo;
	private boolean activeSwich=true;
	public Contact() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Contact [sno=" + sno + ", name=" + name + ", email=" + email + ", phonNo=" + phonNo + ", activeSwich="
				+ activeSwich + "]";
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
	public boolean isActiveSwich() {
		return activeSwich;
	}
	public void setActiveSwich(boolean activeSwich) {
		this.activeSwich = activeSwich;
	}
	public Contact(Integer sno, String name, String email, Long phonNo, boolean activeSwich) {
		super();
		this.sno = sno;
		this.name = name;
		this.email = email;
		this.phonNo = phonNo;
		this.activeSwich = activeSwich;
	}
	
	

}
