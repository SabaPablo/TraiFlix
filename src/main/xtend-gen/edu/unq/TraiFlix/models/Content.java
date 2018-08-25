package edu.unq.TraiFlix.models;

import edu.unq.TraiFlix.models.Actor;
import edu.unq.TraiFlix.models.Assessment;
import edu.unq.TraiFlix.models.Category;
import edu.unq.TraiFlix.models.Clasification;
import edu.unq.TraiFlix.models.Director;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class Content {
  private Integer id;
  
  private String title;
  
  private List<Category> categories;
  
  private Clasification clasification;
  
  private Date release;
  
  private List<Assessment> assessments;
  
  private Calendar time;
  
  private List<Director> directors;
  
  private List<Actor> actors;
  
  private List<Content> relateds;
  
  private String link;
  
  public Content() {
    this.categories = CollectionLiterals.<Category>newArrayList();
    this.assessments = CollectionLiterals.<Assessment>newArrayList();
    this.directors = CollectionLiterals.<Director>newArrayList();
    this.actors = CollectionLiterals.<Actor>newArrayList();
    this.relateds = CollectionLiterals.<Content>newArrayList();
  }
  
  public boolean addAssessment(final Assessment critic) {
    return this.assessments.add(critic);
  }
  
  @Pure
  public Integer getId() {
    return this.id;
  }
  
  public void setId(final Integer id) {
    this.id = id;
  }
  
  @Pure
  public String getTitle() {
    return this.title;
  }
  
  public void setTitle(final String title) {
    this.title = title;
  }
  
  @Pure
  public List<Category> getCategories() {
    return this.categories;
  }
  
  public void setCategories(final List<Category> categories) {
    this.categories = categories;
  }
  
  @Pure
  public Clasification getClasification() {
    return this.clasification;
  }
  
  public void setClasification(final Clasification clasification) {
    this.clasification = clasification;
  }
  
  @Pure
  public Date getRelease() {
    return this.release;
  }
  
  public void setRelease(final Date release) {
    this.release = release;
  }
  
  @Pure
  public List<Assessment> getAssessments() {
    return this.assessments;
  }
  
  public void setAssessments(final List<Assessment> assessments) {
    this.assessments = assessments;
  }
  
  @Pure
  public Calendar getTime() {
    return this.time;
  }
  
  public void setTime(final Calendar time) {
    this.time = time;
  }
  
  @Pure
  public List<Director> getDirectors() {
    return this.directors;
  }
  
  public void setDirectors(final List<Director> directors) {
    this.directors = directors;
  }
  
  @Pure
  public List<Actor> getActors() {
    return this.actors;
  }
  
  public void setActors(final List<Actor> actors) {
    this.actors = actors;
  }
  
  @Pure
  public List<Content> getRelateds() {
    return this.relateds;
  }
  
  public void setRelateds(final List<Content> relateds) {
    this.relateds = relateds;
  }
  
  @Pure
  public String getLink() {
    return this.link;
  }
  
  public void setLink(final String link) {
    this.link = link;
  }
}
