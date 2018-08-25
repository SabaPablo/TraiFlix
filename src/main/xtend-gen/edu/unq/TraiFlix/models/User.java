package edu.unq.TraiFlix.models;

import edu.unq.TraiFlix.models.Content;
import java.util.Date;
import java.util.List;

@SuppressWarnings("all")
public class User {
  private Integer id;
  
  private String nick;
  
  private String name;
  
  private Date created;
  
  private Date dateOfBirth;
  
  private List<User> friends;
  
  private List<Content> seen;
  
  private List<Content> favorite;
}
