import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Hash {
	public static void main(String[] args) {
		Map<Integer, TreeSet<String>> map = new TreeMap<Integer, TreeSet <String>>();
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			TreeSet<String> set = new TreeSet<String>();
			String s = in.next();
			int h = s.hashCode();
			
			if (!map.containsKey(h)) {
				map.put(h, set);
				set.add(s);
			} else {
				set = new TreeSet<String>();
				set.add(s);
				map.put(h, set);	
			}
			
			Set<Integer> keyset = map.keySet();
			
			for (int k : map.keySet()) {
				TreeSet<String> resultSet = new TreeSet<String>();
				resultSet = map.get(k);
				if (resultSet.size() > 1)  
					System.out.println(k + ":");
				for (String words : resultSet)
					System.out.println(words + ",");
			}
		}
	}
}
