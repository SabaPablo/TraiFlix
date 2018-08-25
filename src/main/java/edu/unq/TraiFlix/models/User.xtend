package edu.unq.TraiFlix.models

import java.util.List
import java.util.Date

class User {
	Integer id;
	String nick;
	String name;
	Date created;
	Date dateOfBirth;
	List<User> friends;
	List<Content> seen;
	List<Content> favorite;
	
	
	
}
