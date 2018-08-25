package edu.unq.TraiFlix.models;

import edu.unq.TraiFlix.models.Content;
import edu.unq.TraiFlix.models.Movie;
import edu.unq.TraiFlix.models.Serie;
import edu.unq.TraiFlix.models.User;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

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
}
