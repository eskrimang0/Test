package Test.CRUD.Rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Test.CRUD.Model.User;
import Test.CRUD.UserService.UserService;

@RestController
@RequestMapping("user")
public class UserRest {
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	public ResponseEntity<List<User>> getAllUser(){
		return new ResponseEntity<>(userService.semuaUser(), HttpStatus.OK);
	}
	
	@GetMapping("/{userid}")
	public ResponseEntity<User> getUserId(@PathVariable int userid) throws Exception{
		return new ResponseEntity<User>(userService.pilihUser(userid), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<User> saveEdit(@Valid @RequestBody User user){
		return new ResponseEntity<>(userService.saveEdit(user), HttpStatus.OK);	
	}
	
	@DeleteMapping("/{userid}")
	public String deleteUser(@PathVariable int userid) {
		userService.hapusUser(userid);
		return "hapus sukses";
	}

}
