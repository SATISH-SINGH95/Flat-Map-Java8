package flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapImplementation {
	
	public static void main(String[] args) {
		
		List<Integer> number1 = Arrays.asList(123, 234,345,456);
		List<Integer> number2 = Arrays.asList(981, 987,876,765);
		List<Integer> number3 = Arrays.asList(456, 678,467,274);
		
		Employee emp1 = new Employee("Satish", number1);
		Employee emp2 = new Employee("Manish", number2);
		Employee emp3 = new Employee("Sudhir", number3);
		
		List<Employee> emps = Arrays.asList(emp1, emp2, emp3);
		
		List<List<Integer>> empNumberWithMap = emps.stream().map(e -> e.getPhoneNumbers()).collect(Collectors.toList());
		System.out.println(empNumberWithMap);
		
		List<Integer> empNumberWithFlatMap = emps.stream().flatMap(e -> e.getPhoneNumbers().stream()).collect(Collectors.toList());
		System.out.println(empNumberWithFlatMap);
		
		
	}

}
