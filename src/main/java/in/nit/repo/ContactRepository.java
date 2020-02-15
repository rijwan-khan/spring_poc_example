package in.nit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.nit.entity.ContactInfo;


public interface ContactRepository extends JpaRepository<ContactInfo, Integer> {

	@Query("select e.name from ContactInfo e")
	public String getName();
	
	@Query("update ContactInfo set name=:name,email=:email,phoneNo=:phonno where sno=:sno")
	public ContactInfo updateCon(String name,String email,long phonno,int sno);
	
}
