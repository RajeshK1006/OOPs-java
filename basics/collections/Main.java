import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      List<Integer> arr  = Arrays.asList(1,2,3,4,5,6);
      List<Integer> filt = arr.stream().filter(x->x%2==0).collect(Collectors.toList());
      System.out.println(filt.toString());
      
      List<String> names = Arrays.asList("alice", "bob", "charlie");
      names = names.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
      System.out.println(names.toString());
      
      List<String> names = Arrays.asList("Alice", "Bob", "Amanda", "alex", "Brian");
      names = names.stream().filter(x->x.toLowerCase().startsWith("a")).collect(Collectors.toList());
      System.out.println(names);
      
      List<String> words = Arrays.asList("Java", "Streams", "API", "Practice");
      String res = words.stream().collect(Collectors.joining(","));
      System.out.println(res);
      
      List<String> names = Arrays.asList("Alice", "Bob", "Amanda", "Alex", "Brian");
      Map<Integer,List<String>> map = new HashMap<>();
      map = names.stream().collect(Collectors.groupingBy(String::length));
      System.out.println(map);
      
      
      List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
      Map<Boolean ,List<Integer>> map = new HashMap<>();
      map = numbers.stream().collect(Collectors.partitioningBy(x->x%2==0));
      System.out.println(map);
      
      List<String> names = Arrays.asList("Alice", "Bob", "Amanda", "Alex", "Brian");
      Optional<String> name = names.stream().max(Comparator.comparingInt(String::length));
      System.out.println(name.orElse("Not found"));
      
      List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
      int ans = numbers.stream().map(x->x*x).reduce(0,Integer::sum);
      System.out.println(ans);
            
      List<List<Integer>> listOfLists = Arrays.asList(
          Arrays.asList(1, 2, 3),
          Arrays.asList(6, 7),
          Arrays.asList(4, 8, 9)
      );

      List<Integer> ans = listOfLists.stream().flatMap(List::stream).filter(x->x>=6).collect(Collectors.toList());
      System.out.println(ans);
      
      List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
      HashMap<String, Long> map = new HashMap<>(
    words.stream().collect(Collectors.groupingBy(w -> w, Collectors.counting()))
);
    System.out.println(map);



      
  }
}
