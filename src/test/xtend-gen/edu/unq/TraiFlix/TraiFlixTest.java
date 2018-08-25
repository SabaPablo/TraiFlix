package edu.unq.TraiFlix;

import edu.unq.TraiFlix.models.Assessment;
import edu.unq.TraiFlix.models.Movie;
import edu.unq.TraiFlix.models.Serie;
import edu.unq.TraiFlix.models.TriFlix;
import edu.unq.TraiFlix.models.User;
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
    User _user = new User();
    triflix.setNewUser(_user);
    User _user_1 = new User();
    triflix.setNewUser(_user_1);
    int _size = triflix.getUsers().size();
    boolean _equals = (_size == 2);
    Assert.assertTrue(_equals);
  }
  
  @Test
  public void conocerElRatingDeUnaPelicula() {
    TriFlix triflix = new TriFlix();
    final Movie elPadrino = new Movie();
    final User pepito = new User();
    final User pepita = new User();
    elPadrino.setTitle("El Padrino");
    pepito.setNick("Pepito");
    pepito.setName("Pepito");
    pepita.setNick("Pepita");
    pepita.setName("Pepita");
    triflix.setNewContent(elPadrino);
    triflix.setNewUser(pepito);
    Assessment _assessment = new Assessment(pepito, Integer.valueOf(5), "violentas como me gustan a mi");
    elPadrino.addAssessment(_assessment);
    Assessment _assessment_1 = new Assessment(pepito, Integer.valueOf(1), "me gustan las romanticas, una mierda");
    elPadrino.addAssessment(_assessment_1);
    int _rating = elPadrino.getRating();
    boolean _equals = (_rating == 3);
    Assert.assertTrue(_equals);
  }
}
