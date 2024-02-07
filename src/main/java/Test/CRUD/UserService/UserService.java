package Test.CRUD.UserService;

import java.util.List;

import Test.CRUD.Model.User;

public interface UserService {
	
	List<User> semuaUser();
	User pilihUser(int userid);
	User saveEdit(User user);
	void hapusUser(int userid);

}
