package lambdaExpressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaDriver {
	public static void main(String[] args) {
		LambdaDemo l1 = () -> System.out.println("Hello");
		l1.print();

		Demo d2 = () -> System.out.println("Hi");
		d2.greet();

//		Demo3 d3= (5,10)->return x+y;

//		Demo3 d3 = (x, y) -> {
//			if (x > y) {
//				return x;
//			} else {
//				return y;
//			}
//		};

		Demo3 d3 = (x, y) -> {
			return x + y;
		};
		System.out.println(d3.add(5, 10));

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		System.out.println(list);
		Comparator<Integer> comparator = (o1, o2) -> o2 - o1;

		Collections.sort(list, comparator);
		System.out.println(list);
	}
}
