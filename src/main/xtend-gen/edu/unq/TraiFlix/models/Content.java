package edu.unq.TraiFlix.models;

import edu.unq.TraiFlix.models.Actor;
import edu.unq.TraiFlix.models.Category;
import edu.unq.TraiFlix.models.Clasification;
import edu.unq.TraiFlix.models.Director;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@SuppressWarnings("all")
public class Content {
  private Integer id;
  
  private String title;
  
  private List<Category> categories;
  
  private Clasification clasification;
  
  private Date release;
  
  private Calendar time;
  
  private List<Director> directors;
  
  private List<Actor> actors;
  
  private List<Content> relateds;
  
  private String link;
}
