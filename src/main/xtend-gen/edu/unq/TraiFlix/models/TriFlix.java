package edu.unq.TraiFlix.models;

import edu.unq.TraiFlix.models.Content;
import edu.unq.TraiFlix.models.Movie;
import edu.unq.TraiFlix.models.Serie;
import edu.unq.TraiFlix.models.User;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class TriFlix {
  private List<Content> contents;
  
  private List<User> users;
  
  public TriFlix() {
    this.contents = CollectionLiterals.<Content>newArrayList();
    this.users = CollectionLiterals.<User>newArrayList();
  }
  
  public Iterable<Content> getMovies() {
    final Function1<Content, Boolean> _function = new Function1<Content, Boolean>() {
      public Boolean apply(final Content it) {
        return Boolean.valueOf((it instanceof Movie));
      }
    };
    return IterableExtensions.<Content>filter(this.contents, _function);
  }
  
  public Iterable<Content> getSeries() {
    final Function1<Content, Boolean> _function = new Function1<Content, Boolean>() {
      public Boolean apply(final Content it) {
        return Boolean.valueOf((it instanceof Serie));
      }
    };
    return IterableExtensions.<Content>filter(this.contents, _function);
  }
  
  public boolean setNewContent(final Content content) {
    return this.contents.add(content);
  }
  
  public boolean setNewUser(final User user) {
    return this.users.add(user);
  }
  
  @Pure
  public List<Content> getContents() {
    return this.contents;
  }
  
  public void setContents(final List<Content> contents) {
    this.contents = contents;
  }
  
  @Pure
  public List<User> getUsers() {
    return this.users;
  }
  
  public void setUsers(final List<User> users) {
    this.users = users;
  }
}
