package in.nit.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nit.entity.ContactInfo;
import in.nit.model.Contact;
import in.nit.repo.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {
	@Autowired
	private ContactRepository repo;

	@Override
	public boolean saveContact(Contact c) {
		ContactInfo entity = new ContactInfo();
		entity.setActiveSwich(true);
		// copy property contact to entity
		BeanUtils.copyProperties(c, entity);
		entity = repo.save(entity);
		if (entity.getSno() != null) {
			return true;
		}
		return false;
	}

	@Override
	public List<ContactInfo> getAllContact() {
		List<ContactInfo> list = repo.findAll();

		return list;
	}

	@Override
	public ContactInfo getOneContact(Integer sno) {
		ContactInfo ci = repo.getOne(sno);
		return ci;
	}

	@Override
	public boolean UpdateContact(Contact c) {
		ContactInfo entity = new ContactInfo();
		/*
		 * //copy property contact to entity BeanUtils.copyProperties(c, info);
		 * //info=repo.updateCon(info.getName(),info.getEmail(),info.getPhonNo(),info.
		 * getSno()); return true;
		 */
		// copy property contact to entity
		BeanUtils.copyProperties(c, entity);
		entity = repo.save(entity);
		if (entity.getSno() != null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteContact(Integer sno) {
		repo.deleteById(sno);
		return true;
	}
}
