package es.upm.griseprofundizacion2018.prof2018_CeliaCaroExam;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test_compareTo {
	
	private MyString s1;
	private MyString s2;
	
	@Test
	public void test_diferente_longitud() {
		s1 = new MyString("celia");
		s2 = new MyString("celiac");
		assertEquals(-1, this.s1.compareTo(s2));
	}
	
	@Test
	public void test_diferentes() {
		s1 = new MyString("celia");
		s2 = new MyString("celea");
		assertEquals(-1, this.s1.compareTo(s2));
	}
	
	@Test
	public void test_iguales() {
		s1 = new MyString("celia");
		s2 = new MyString("celia");
		assertEquals(0, this.s1.compareTo(s2));
	}
    
}
