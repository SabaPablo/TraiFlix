package edu.unq.TraiFlix.models;

import edu.unq.TraiFlix.models.Assessment;
import edu.unq.TraiFlix.models.Content;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;

@Accessors
@SuppressWarnings("all")
public class Movie extends Content {
  public int getRating() {
    Integer sum = Integer.valueOf(0);
    List<Assessment> _assessments = this.getAssessments();
    for (final Assessment critc : _assessments) {
      Integer _value = critc.getValue();
      int _plus = ((sum).intValue() + (_value).intValue());
      sum = Integer.valueOf(_plus);
    }
    int _size = this.getAssessments().size();
    return ((sum).intValue() / _size);
  }
}
