package probem_statement;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer a[] = { 3, 7, 3, 5, 2, 3, 8, 5, 1, 9, 0 };
		List<Integer> list = Arrays.asList(a);
		Set<Integer> set = new LinkedHashSet<>(list);
		a = set.toArray(new Integer[0]);
		for (Integer integer : a) {

			System.out.print(integer+",");
		}

	}
}
