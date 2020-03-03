package comm.example.service;

import java.io.IOException;
import java.util.List;

import comm.example.dao.PersonDAO;
import comm.example.dao.PersonDAOImpl;
import comm.example.entity.Person;

public class PersonServiceImpl implements PersonService {
	private PersonDAO dao;
	{
		dao=new PersonDAOImpl();
	}
	@Override
	public Person createPerson(Person person) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Person> getAllPerson() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Person getPersonByid(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Person updatePerson(Integer id) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deletePerson(Integer id) {
		// TODO Auto-generated method stub
		
	}


}