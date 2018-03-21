package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Home work2 Recursion class.
 * 
 * @author Pittayut Sothanakul
 *
 */
public class Recursion {
	/**
	 * Remove duplicate consecutive items from a list, changing the list
	 * parameter. For example, if list = { a, b, b, b, c, b, c, c} then after
	 * calling unique the list will contain {a, b, c, b, c}. Only consecutive
	 * duplicates are removed. Objects are compared using their own equals
	 * method.
	 * 
	 * @param list
	 *            of any kind of object. The elements are not null.
	 * @return reference to the list parameter with consecutive duplicates
	 *         removed.
	 */
	public static List<?> unique(List<?> list) {
		if (list.get(0) == null) {
			return null;
		}
		if (list.size() <= 1) {
			return list;
		}

		List<?> sub = list.subList(1, list.size());
		if (list.get(0).equals(list.get(1))) {
			sub.remove(0);
			unique(list);
		} else {
			unique(sub);
		}
		return list;

	}

	/**
	 * Method recursive fibonacci.
	 * 
	 * @param n
	 *            is sequence for number of fibonacci.
	 * @return fibonacci number.
	 */
	public static int fibonacci(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		return fibonacci(n - 1) + fibonacci(n - 2);

	}

	/**
	 * Method recursive is faster than normal fibonacci.
	 * 
	 * @param n
	 *            is sequence for number of fibonacci.
	 * @return fibonacci number.
	 */
	public static long fasterFibonacci(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		return helpFibonacci(n, 0, 1);
	}

	/**
	 * Method recursive help for fasterFibonacci method,
	 * 
	 * @param num
	 *            is sequence for number of fibonacci.
	 * @param start
	 *            is the start fibonacci number.
	 * @param next
	 *            is the next fibonacci number.
	 * @return fibonacci number.
	 */
	public static long helpFibonacci(int num, long start, long next) {
		if (num == 0)
			return start;
		if (num == 1)
			return next;
		else
			return helpFibonacci(num - 1, next, start + next);

	}

	/**
	 * Main to test recursive.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("c");
		System.out.println(unique(list));
		System.out.println(fibonacci(45));
		System.out.println(fasterFibonacci(50));

	}
}
