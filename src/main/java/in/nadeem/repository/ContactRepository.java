package in.nadeem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nadeem.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
