package in.nadeem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nadeem.entity.Contact;
import in.nadeem.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository repo;

	@Override
	public String upsert(Contact contact) {
		Contact save = repo.save(contact);

		return "SUCCESS";
	}

	@Override
	public List<Contact> getAllContacts() {

		return repo.findAll();
	}

	@Override
	public Contact getContact(int cid) {
		Optional<Contact> findById = repo.findById(cid);

		if (findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public String deletContact(int cid) {
		repo.deleteById(cid);
		return "SUCCESS";
	}

}
