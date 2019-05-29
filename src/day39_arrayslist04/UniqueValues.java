package day39_arrayslist04;
import java.util.*;
public class UniqueValues {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(10); nums.add(10); nums.add(7); nums.add(8);
		nums.add(8); nums.add(3); nums.add(4); nums.add(8);
		
		System.out.println(nums);
		
		//1) find NON Duplicate unique values. if there 2 A A. -> A
		//[10, 10, 7, 8, 8, 3, 4, 8]
		//[10, 7, 8, 3, 4]
		
		List<Integer> unique1 = new ArrayList<>();
		for (Integer num : nums) {
			//assign num to unique1 if nums is not already there
			if(!unique1.contains(num)) {
				unique1.add(num);
			}
		}
		System.out.println(unique1.toString());
		
		//2. find unique(appearing once) values
		//[10, 10, 7, 8, 8, 3, 4, 8]
		//[7, 3, 4]
		
		List<Integer> unique2 = new ArrayList<>();
		for (int i = 0; i < nums.size(); i++) {
			int count = 0;
			Integer value = nums.get(i);
			for(int k = 0; k < nums.size(); k++) {
				if(nums.get(k) == value && i != k) {
					count++;
					break;
				}
			}
			if(count == 0) {
				unique2.add(value);
			}
		}
		System.out.println(unique2.toString());
		
		
	}
}
