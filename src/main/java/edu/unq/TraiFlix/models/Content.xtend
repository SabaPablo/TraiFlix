package edu.unq.TraiFlix.models

import java.util.List
import java.util.Date
import java.util.Calendar
import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class Content {
	 Integer id
	 String title
	 List<Category> categories
	 Clasification clasification
	 Date release
	 List<Assessment> assessments
	 Calendar time
	 List<Director> directors
	 List<Actor> actors
	 List<Content> relateds
	 String link
	 
	 new(){
	 	categories = newArrayList
	 	assessments = newArrayList
	 	directors = newArrayList
	 	actors = newArrayList
	 	relateds = newArrayList
	 } 
	 
	 def addAssessment(Assessment critic){
	 	assessments.add(critic)
	 }
	 
	 
}
