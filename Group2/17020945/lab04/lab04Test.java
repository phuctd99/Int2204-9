import org.junit.Test;

import static org.junit.Assert.*;

public class lab04Test {
	//gtln
	@Test
	public void gtln() {
		int a=lab04.gtln(4,7);
		assertEquals(7,a);
	}
	@Test
	public void gtln1() {
		int a=lab04.gtln(4,17);
		assertEquals(17,a);
	}

	@Test
	public void gtln2() {
		int a=lab04.gtln(47,7);
		assertEquals(47,a);
	}

	@Test
	public void gtln3() {
		int a=lab04.gtln(44,74);
		assertEquals(74,a);
	}

	@Test
	public void gtln4() {
		int a=lab04.gtln(4,75);
		assertEquals(75,a);
	}
	//gtnn
	@Test
	public void gtnn() {
		int[] n={1,2,3};
		int a=lab04.gtnn(n);
		assertEquals(1,a);
	}

	@Test
	public void gtnn1() {
		int[] n={101,22,32};
		int a=lab04.gtnn(n);
		assertEquals(22,a);
	}

	@Test
	public void gtnn2() {
		int[] n={-1,2,3};
		int a=lab04.gtnn(n);
		assertEquals(-1,a);
	}

	@Test
	public void gtnn3() {
		int[] n={11,2,3,5};
		int a=lab04.gtnn(n);
		assertEquals(2,a);
	}

	@Test
	public void gtnn4() {
		int[] n={11,22,23,26,7};
		int a=lab04.gtnn(n);
		assertEquals(7,a);
	}
	//bmi
	@Test
	public void BMI() {
		String a=lab04.BMI(45,1.60);
		assertEquals("Thiếu cân",a);
	}

	@Test
	public void BMI1() {
		String a=lab04.BMI(49,1.58);
		assertEquals("Bình thường",a);
	}

	@Test
	public void BMI2() {
		String a=lab04.BMI(55,1.62);
		assertEquals("Bình thường",a);
	}

	@Test
	public void BMI3() {
		String a=lab04.BMI(65,1.79);
		assertEquals("Bình thường",a);
	}

	@Test
	public void BMI4() {
		String a=lab04.BMI(75,1.80);
		assertEquals("Thừa cân",a);
	}
}