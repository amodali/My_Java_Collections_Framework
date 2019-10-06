import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DataSetGenericTester {

	@Test
	void test() {
		DataSetGeneric d1 = new DataSetGeneric();
		Measurable m1 = new ChristmasTree(50);
		d1.add(m1);
		assertEquals(1, d1.size());
	}
	
	@Test
	void test2() {
		DataSetGeneric d1 = new DataSetGeneric();
		Measurable m1 = new LightBulb(50);
		d1.add(m1);
		assertEquals(1, d1.size());
	}
	
	@Test
	void test3() {
		DataSetGeneric d1 = new DataSetGeneric();
		LightBulb m1 = new LightBulb(100);
		d1.add(m1);
		assertEquals(1, d1.size());
	}
	
	@Test
	void test4() {
		DataSetGeneric d1 = new DataSetGeneric();
		LightBulb m1 = new LightBulb(100);
		Measurable m2 = new LightBulb(50);
		Measurable m3 = new ChristmasTree(75);
		Measurable m4 = new ChristmasTree(26);
		Measurable m5 = new ChristmasTree(27);
		Measurable m6 = new ChristmasTree(30);
		d1.add(m1);
		d1.add(m2);
		d1.add(m3);
		d1.add(m4);
		d1.add(m5);
		d1.add(m6);
		System.out.println(d1.sort());
		System.out.println(d1.getMax());
		System.out.println(d1.get(1));
		assertEquals(6, d1.size());
	}

}

