package edu.unq.TraiFlix.models

import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class Movie extends Content{

	def getRating() {
		var Integer sum = 0
		for (Assessment critc : assessments) {
			sum = sum + critc.getValue()
		}
		return sum/assessments.size
	}

	
	
	
	
}
