package Test.CRUD.UserServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Test.CRUD.Model.User;
import Test.CRUD.UserDao.UserDao;
import Test.CRUD.UserService.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDao userDao;

	@Override
	public List<User> semuaUser() {
		
		return userDao.findAll();
	}
	
	@Override
	public User pilihUser(int userid) {
		User user = userDao.findById(userid).orElse(new User());
				
				return user;
	}

	@Override
	public User saveEdit(User user) {
		// TODO Auto-generated method stub
		return userDao.save(user);
	}

	@Override
	public void hapusUser(int userid) {
		// TODO Auto-generated method stub
		
		User user = userDao.findById(userid).orElse(new User());
		userDao.delete(user);
		
	}

}
