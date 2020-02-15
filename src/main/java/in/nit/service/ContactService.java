package in.nit.service;

import java.util.List;

import in.nit.entity.ContactInfo;
import in.nit.model.Contact;

public interface ContactService {
	public boolean saveContact(Contact c);
	public List<ContactInfo> getAllContact();
	public ContactInfo getOneContact(Integer sno);
	public boolean UpdateContact(Contact c);
	public boolean deleteContact(Integer sno);

}
