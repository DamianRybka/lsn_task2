package lsn.task2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NumberProvider {

	public static int TARGET_SUM = 13;

	protected static void provideNumbersToProcess() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter integers separated by commas or spaces (press Enter when done):");
		String input = scanner.nextLine();

		String cleanedInput = input.replace(",", " ");

		List<Integer> inputList = Arrays.stream(cleanedInput.split("\\s+")).map(String::trim).filter(s -> !s.isEmpty()).map(Integer::parseInt)
				.collect(Collectors.toList());

		List<List<Integer>> pairs = PairSumFinder.findPairsWithSum(inputList, TARGET_SUM);

		System.out.println("Pairs that sum up to 13:");
		pairs.forEach(pair -> System.out.println(pair.get(0) + " " + pair.get(1)));

		scanner.close();
	}
}
