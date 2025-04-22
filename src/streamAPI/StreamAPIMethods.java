package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamAPIMethods {
//	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(23);
		l.add(56);
		l.add(23);
		l.add(14);
		l.add(12);

		System.out.println(l);

//		Stream s=l.stream(); //can create only one operation
//		Stream  s2=s.distinct();//to perform another operation another stream has to be created
//		s2.forEach(n->System.out.println(n));
		System.out.println("-------Distinct numbers--------------");

		l.stream().distinct().forEach(n -> System.out.println(n)); // method chaining in stream
		System.out.println("----------------Minimum number--------------");

		// min
		Optional<Integer> opt = l.stream().distinct().min((o1, o2) -> o1 - o2);
		if (opt.isPresent()) {
			System.out.println(opt.get());
		}

		System.out.println("----------Maximum number-----------------");

		// max
		Integer i = l.stream().max((o1, o2) -> o1 - o2).get();
		System.out.println(i);

		System.out.println("---------Ascending order----------------");

		// sorted
		l.stream().sorted().forEach(n -> System.out.println(n + " "));

		System.out.println("------Descending order-------------------");

		// sorted(Comparator)
		l.stream().sorted((o1, o2) -> o2 - o1).forEach(n -> System.out.println(n + " "));

		System.out.println("---------Multiplying the numbers-------------");

		l.stream().distinct().sorted().map(n -> n * n).forEach(n -> System.out.println(n));

		System.out.println("-------Filter(predicate)-----------");
		l.stream().distinct().filter(n -> n % 2 == 0).forEach(n -> System.out.println(n));
		
		System.out.println("Converting stream object to list");
		List<Integer> li=l.stream().distinct().filter(n->n%2==0).toList();
		System.out.println(li);
		
		//creating my own stream
		System.out.println("-------Creating user defined Stream--------");
		Stream s=Stream.of(1,4,7,3,"Demo",96.8);
		s.forEach(n->System.out.print(n+" "));
		System.out.println();
		System.out.println("------------Find first-----------------------");
		Optional<Integer> op=l.stream().findFirst();
		System.out.println(op.get());
		System.out.println("------------Find any:fetches any random element------------");
		Optional<Integer> op1=l.stream().findAny();
		System.out.println(op1.get());
		
	}

}
