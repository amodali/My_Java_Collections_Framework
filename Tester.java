import java.util.ArrayList;
import java.util.Iterator;

public class Tester {

	public static void main(String[] args) {
		DataSetGeneric d1 = new DataSetGeneric();
		LightBulb m1 = new LightBulb(100);
		Measurable m2 = new LightBulb(50);
		Measurable m3 = new ChristmasTree(75);
		Measurable m4 = new ChristmasTree(26);
		Measurable m5 = new ChristmasTree(27);
		Measurable m6 = new ChristmasTree(30);
		ArrayList<Measurable> objects = new ArrayList<>();
		objects.add(m1);
		objects.add(m2);
		objects.add(new LightBulb(1000));
		d1.add(m1);
		d1.add(m2);
		d1.add(m3);
		d1.add(m4);
		d1.add(m5);
		d1.add(m6);
		Iterator it = objects.iterator();
		while (it.hasNext()) {
			Object d = it.next();
			if (d1.contains(d)) {
				System.out.println(d);
				
				
			}
		}
		System.out.println(d1.sort());
		System.out.println(d1.getMax());
		System.out.println(d1.get(1));
		System.out.println(d1.containsAll(objects));
		System.out.println(d1);
		System.out.println(objects);
		System.out.println(d1.addAll(objects));
		System.out.println(d1.sort());
		System.out.println(d1.containsAll(objects));
		System.out.println(d1.removeAll(objects));
		System.out.println(d1.sort());
		d1.retainAll(objects);
		System.out.println(d1.sort());

	}

}
