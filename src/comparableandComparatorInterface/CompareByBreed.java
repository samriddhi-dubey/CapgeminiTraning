package comparableandComparatorInterface;

import java.util.Comparator;

public class CompareByBreed implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Dog d1=(Dog)o1;
		Dog d2=(Dog)o2;
		
		return d2.breed.compareTo(d1.breed);
	}

}
