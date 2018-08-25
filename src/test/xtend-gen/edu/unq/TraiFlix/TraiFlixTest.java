package edu.unq.TraiFlix;

import edu.unq.TraiFlix.models.Movie;
import edu.unq.TraiFlix.models.Serie;
import edu.unq.TraiFlix.models.TriFlix;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TraiFlixTest {
  /**
   * Rigourous Test :-)
   */
  @Test
  public void obtenerElListadoDeLasPelículas() {
    TriFlix triflix = new TriFlix();
    Movie _movie = new Movie();
    triflix.setNewContent(_movie);
    Movie _movie_1 = new Movie();
    triflix.setNewContent(_movie_1);
    Serie _serie = new Serie();
    triflix.setNewContent(_serie);
    int _size = IterableExtensions.size(triflix.getMovies());
    boolean _equals = (_size == 2);
    Assert.assertTrue(_equals);
  }
  
  @Test
  public void obtenerElListadoDeLasSeries() {
    TriFlix triflix = new TriFlix();
    Movie _movie = new Movie();
    triflix.setNewContent(_movie);
    Movie _movie_1 = new Movie();
    triflix.setNewContent(_movie_1);
    Serie _serie = new Serie();
    triflix.setNewContent(_serie);
    int _size = IterableExtensions.size(triflix.getSeries());
    boolean _equals = (_size == 1);
    Assert.assertTrue(_equals);
  }
  
  @Test
  public void obtenerElListadoDeLosUsuarios() {
    TriFlix triflix = new TriFlix();
    Movie _movie = new Movie();
    triflix.setNewContent(_movie);
    Movie _movie_1 = new Movie();
    triflix.setNewContent(_movie_1);
    Serie _serie = new Serie();
    triflix.setNewContent(_serie);
    int _size = IterableExtensions.size(triflix.getSeries());
    boolean _equals = (_size == 1);
    Assert.assertTrue(_equals);
  }
}
