import java.util.*;

public class OneLiners {
	public static void main(String... args) {
		List list = new ArrayList();
        list.add("spam");
        list.add("sausage");
        list.add("spam");
        list.add("spam");
        list.add("bacon");
        list.add("spam");
        list.add("tomato");
        list.add("spam");

        System.out.println("list 00:\n" + list + "\n");

        list = withoutDuplicates(list);

        System.out.println("list 01:\n" + list + "\n");

        String string = "fear, surprise, ruthless efficiency, an almost fanatical devotion to the Pope, nice red uniforms";

        System.out.println("string 00:\n" + string + "\n");

        String[] outputString = parse(string);

        System.out.println("string 01:\n" + Arrays.toString(outputString) + "\n");

        int six = 666;

        int eight = 8;

        System.out.println(hasMoreBitsSet(six, eight));

        System.out.println(hasMoreBitsSet(eight, six));

	}

	static <E> List<E> withoutDuplicates(List<E> original) {
		return new ArrayList<E>(new LinkedHashSet<E>(original));
	}

	static String[] parse(String string) {
		return string.split(",\\s*");
	}

	static boolean hasMoreBitsSet(int i, int j) {
		return (Integer.bitCount(i) > Integer.bitCount(j));
	}
}