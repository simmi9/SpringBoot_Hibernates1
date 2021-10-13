package com.springBoot.restfulWebServices2.restfulwebserviceswithboot2.user;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import java.net.URI;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserResource {
    @Autowired
	private UserDaoService service;
    
    @GetMapping(path="/retreiveUsers")
    public List<User> retrieveUser(){
    	return service.findAll();
    }
    @GetMapping(path="/users/{id}")
    public User retrieveSpeceficUser(@PathVariable int id) {
    	User user = service.findOne(id);
    	if(user==null) {
    		throw new UserNotFoundException("id-"+id);
    	}else {
    	return user;}
    }
    @PostMapping("/users")
    public ResponseEntity<Object> createUser(@RequestBody User user) {
    	User savedUser=service.saveOne(user);
    //reply back with created and uri location with id
    	
    	URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();//.path("/{id}").buildAndExpand(savedUser.getId())
    			return ResponseEntity.created(location).build();
    }
}
