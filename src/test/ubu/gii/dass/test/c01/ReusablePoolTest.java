/**
 * 
 */
package ubu.gii.dass.test.c01;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ubu.gii.dass.c01.DuplicatedInstanceException;
import ubu.gii.dass.c01.NotFreeInstanceException;
import ubu.gii.dass.c01.Reusable;
import ubu.gii.dass.c01.ReusablePool;

/**
 * @author alumno
 *
 */
public class ReusablePoolTest {

	private ReusablePool pool;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		pool = ReusablePool.getInstance();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		pool = null;
	}

	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#getInstance()}.
	 */
	@Test
	public void testGetInstance() {
		ReusablePool pool = ReusablePool.getInstance();
		// No es nulo
		assertNotNull(pool);
		// El objeto devuelto es una instancia de ReusablePool
		assertTrue(pool instanceof ReusablePool);
	}

	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#acquireReusable()}.
	 * @throws NotFreeInstanceException 
	 */
	@Test
	public void testAcquireReusable() throws NotFreeInstanceException {
		Reusable reus1 = null;
		Reusable reus2 = null;

		// ReusablePool pueden tener 2 Reusable
		reus1 = pool.acquireReusable();
		reus2 = pool.acquireReusable();

		// No son nulos
		assertNotNull(reus1);
		assertNotNull(reus2);
		
		// Los objetos devueltos son instancias de ReusablePool
		assertTrue(reus1 instanceof Reusable);
		assertTrue(reus2 instanceof Reusable);

		// Si no queda espacio libre el ReusablePool devuelve una excepcion
		try {
			Reusable reus3 = pool.acquireReusable();
		} catch (Exception e) {

			assertTrue(e instanceof NotFreeInstanceException);
		}
	}

	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#releaseReusable(ubu.gii.dass.c01.Reusable)}.
	 * @throws NotFreeInstanceException 
	 * @throws DuplicatedInstanceException 
	 */
	@Test
	public void testReleaseReusable() throws NotFreeInstanceException, DuplicatedInstanceException {
		Reusable reus = pool.acquireReusable();

		// Se libera el reusable
		pool.releaseReusable(reus);
		
		// Si ya existe instancia en el pool del resuable que queremos liberar obtenemos la excepcion
		try {
			pool.releaseReusable(reus);
		} catch (Exception e) {
			assertTrue(e instanceof DuplicatedInstanceException);
		}
	}

}
