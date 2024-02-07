package Test.CRUD.UserDao;

import org.springframework.data.jpa.repository.JpaRepository;

import Test.CRUD.Model.User;

public interface UserDao extends JpaRepository <User, Integer>{
	

}
