package com.springBoot.restfulWebServices2.restfulwebserviceswithboot2.user;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

@Component
public class UserDaoService {
private static List<User> users= new ArrayList<>();
private static Integer userCount=0;
static {
	users.add(new User(1,"Adam",new Date()));
	users.add(new User(1,"Jass",new Date()));
	users.add(new User(1,"Mink",new Date()));
}

public List<User> findAll(){
	return users;
}
public User findOne(int id) {
	User found=null;//=new User(0,"",new Date());
	for(User user:users) {
		if(user.getId()==id) {
		found=user;
		return found;
		}
	}
return found;
}

public User deleteOne(int id) {
	Iterator<User> itUser= users.iterator();
	while(itUser.hasNext()) {
		User user =itUser.next();
		if(user.getId()==id) {
			itUser.remove();
			return users;
		}
	}
	return null;
}
public User saveOne(User u) {
	if(u.getId()==null) {
		u.setId(++userCount);
	}
	users.add(u);
	return u;
}
}
