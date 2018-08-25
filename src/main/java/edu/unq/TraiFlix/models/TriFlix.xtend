package edu.unq.TraiFlix.models

import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class TriFlix {
	
	List<Content> contents;
	List<User> users;
	
	
	new(){
		contents = newArrayList;
		users = newArrayList;
	}
	
	def getMovies(){
		contents.filter[it instanceof Movie]
	}
	
		def getSeries(){
		contents.filter[it instanceof Serie]
	}
	
	def setNewContent(Content content) {
		contents.add(content);
	}
	
	def setNewUser(User user) {
		users.add(user);
	}
	
}
