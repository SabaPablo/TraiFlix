package edu.unq.TraiFlix

import edu.unq.TraiFlix.models.Movie
import edu.unq.TraiFlix.models.TriFlix
import edu.unq.TraiFlix.models.Serie
import org.junit.Test
import static org.junit.Assert.*
class TraiFlixTest{
	/*
	 * a. Obtener el listado de las películas
	 * b. Obtener el listado de las series
	 * c. Obtener el listado de los usuarios
	 * d. Conocer el rating de una película
	 * 1
	 * e. Conocer el rating de un capítulo de una serie
	 * f. Obtener películas y series por categoría
	 * g. Obtener películas y series por clasificación
	 * h. La cantidad de temporadas de una serie
	 * i. La cantidad de capítulos de una serie
	 * j. Los amigos de un usuario
	 * k. Dado un usuario, saber qué películas vió
	 * l. Dado un usuario, saber qué series vió de forma completa
	 * 2
	 * m. Dado un usuario, conocer el contenido recomendado por sus amigos
	 * n. Obtener el contenido que no tenga cargado el trailer
	 */
	/** 
	 * Rigourous Test :-)
	 */
	@Test
	def void obtenerElListadoDeLasPelículas() {
		var TriFlix triflix = new TriFlix()
		triflix.setNewContent(new Movie)
		triflix.setNewContent(new Movie)
		triflix.setNewContent(new Serie)
		
		assertTrue(triflix.getMovies().size == 2)
	}
	
	@Test
	def void obtenerElListadoDeLasSeries() {
		var TriFlix triflix = new TriFlix()
		triflix.setNewContent(new Movie)
		triflix.setNewContent(new Movie)
		triflix.setNewContent(new Serie)
		
		assertTrue(triflix.getSeries().size == 1)
	}
	
	@Test
	def void obtenerElListadoDeLosUsuarios() {
		var TriFlix triflix = new TriFlix()
		triflix.setNewContent(new Movie)
		triflix.setNewContent(new Movie)
		triflix.setNewContent(new Serie)
		
		assertTrue(triflix.getSeries().size == 1)
	}
	
}
