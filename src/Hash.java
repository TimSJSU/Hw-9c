import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Hash {
	public static void main(String[] args) {
		Map<Integer, TreeSet<String>> map = new TreeMap<Integer, TreeSet <String>>();
		TreeSet<String> set = new TreeSet<String>();
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String input = in.next();
			int hash = input.hashCode();
			
			if (!map.containsValue(hash)) {
				set = map.get(hash);
				set.add(input);
			} else {
				set = new TreeSet<String>();
				set.add(input);
				map.put(hash, set);	
			}
			
			for (int h : map.keySet()) {
				TreeSet<String> resultSet = new TreeSet<String>();
				resultSet = map.get(map.keySet());
				if (!resultSet.isEmpty())  
					System.out.println(resultSet.hashCode());
				for (String words : resultSet)
					System.out.println(input);
			}
		}
	}
}
