package comm.example.spring.hibernate.demo;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import comm.example.spring.hibernate.demo.entity.UserDetail;

@Service("service")
public class UserServiceImpl implements UserService{
private UserDao dao;

public UserServiceImpl(UserDao dao) {
	super();
	this.dao = dao;
}
@Override
@Transactional
public UserDetail createUser(UserDetail user)
{
	return dao.createUser(user);
}

}
