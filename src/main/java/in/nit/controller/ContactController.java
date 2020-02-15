package in.nit.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import in.nit.entity.ContactInfo;
import in.nit.model.Contact;
import in.nit.service.ContactService;

@Controller
public class ContactController {
	@Autowired
	private ContactService service;

	@RequestMapping("/info")
	public String showInfo(@ModelAttribute("info") Contact c) {
		return "contactpage";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String readContact(@ModelAttribute("info") Contact c, Model model) {
		boolean msg = service.saveContact(c);
		// opopopo
		// fdsgkjhdfgjdfhgk
		bolean msgne - false;
		intg aSda f
		// kakakka new commit conflic
		// kkaaa
		model.addAttribute("ob", c);
		model.addAttribute("msg", msg);

		return "contactData";
	}

	/** This mwthod is used for getting the contact records **/
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public String getContact(Model model) {
		List<ContactInfo> list = service.getAllContact();
		model.addAttribute("list", list);
		System.out.println(list);
		// ok i recieved ur commetns
		return "contactData";
	}

	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public String editContact(@ModelAttribute("edit") Contact c, @RequestParam("sno") Integer sno, Model model) {
		ContactInfo info = service.getOneContact(sno);
		// Contact contact=new Contact();
		BeanUtils.copyProperties(info, c);
		model.addAttribute("data", c);
		
		return "editpage";
	}
	@RequestMapping(value="/update",method = RequestMethod.POST)
	public String updateContact(@ModelAttribute("edit") Contact c,Model model) {
	ContactInfo info=new ContactInfo();
	//BeanUtils.copyProperties(c, info);
	boolean msg=service.UpdateContact(c);
	model.addAttribute("ob", c);
	model.addAttribute("msg", msg);
		return "contactData";
	}
	@RequestMapping(value = "/delete" ,method = RequestMethod.GET)
	public String deleteContact(Contact c,Model model) {
		Integer sno=c.getSno();
		String name=c.getName();
	boolean msg=service.deleteContact(sno);
	model.addAttribute("sno", sno);
	model.addAttribute("msg", msg);
		return "deletecontact";
		
	}
}
