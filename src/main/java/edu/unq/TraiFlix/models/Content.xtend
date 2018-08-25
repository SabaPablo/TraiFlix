package edu.unq.TraiFlix.models

import java.util.List
import java.util.Date
import java.util.Calendar

class Content {
	 Integer id
	 String title
	 List<Category> categories
	 Clasification clasification
	 Date release
	 Calendar time
	 List<Director> directors
	 List<Actor> actors
	 List<Content> relateds
	 String link
}
