package lsn.task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PairSumFinder {

	public static List<List<Integer>> findPairsWithSum(List<Integer> inputList, int targetSum) {

		Set<List<Integer>> pairsSet = new HashSet<>();

		inputList.stream().flatMap(i -> inputList.stream().filter(j -> i + j == targetSum && i <= j).map(j -> Arrays.asList(i, j)))
				.collect(Collectors.toCollection(() -> pairsSet));

		return pairsSet.stream().sorted(Comparator.comparingInt(pair -> pair.get(0))).collect(Collectors.toList());
	}
}
