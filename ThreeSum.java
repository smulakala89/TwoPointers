import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { -1, 0, 1, 2, -1, -4 };
		Set<List<Integer>> result = new HashSet<>();
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length; i++) {
			int left = i + 1;
			int right = numbers.length - 1;
			while (left < right) {
				if (numbers[i] + numbers[left] + numbers[right] == 0) {
					result.add(Arrays.asList(numbers[i], numbers[left], numbers[right]));
					left++;
					right--;
				}
				else if(numbers[i] + numbers[left] + numbers[right] >0) {
					right --;
					
				}
				else {
					left++;
				}
			}

		}
		new ArrayList(result);

	}

}
