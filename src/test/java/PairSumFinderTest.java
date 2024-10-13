import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PairSumFinderTest {

	@Test
	public void findPairs_WithSum() {
		// Given
		List<Integer> inputNumbers = List.of(1, 2, 3, 10, 4, 9, 0, 13, 5, 8);

		// When
		List<List<Integer>> result = lsn.task2.PairSumFinder.findPairsWithSum(inputNumbers, 13);

		// Then
		assertThat(result).containsExactlyInAnyOrder(List.of(4, 9), List.of(5, 8), List.of(0, 13), List.of(3, 10));
	}

	@Test
	public void findPairs_WithSum_NoPairs() {
		// Given
		List<Integer> inputNumbers = List.of(1, 2, 3, 4, 5);

		// When
		List<List<Integer>> result = lsn.task2.PairSumFinder.findPairsWithSum(inputNumbers, 13);

		// Then
		assertThat(result).isEmpty();
	}

	@Test
	public void findPairs_WithSum_EmptyList() {
		// Given
		List<Integer> inputNumbers = List.of();

		// When
		List<List<Integer>> result = lsn.task2.PairSumFinder.findPairsWithSum(inputNumbers, 13);

		// Then
		assertThat(result).isEmpty();
	}

	@Test
	public void findPairs_WithSum_DuplicateElements() {
		// Given
		List<Integer> inputList = List.of(6, 7, 6, 7, 7, 6);

		// When
		List<List<Integer>> result = lsn.task2.PairSumFinder.findPairsWithSum(inputList, 13);

		// Then
		assertThat(result).containsExactlyInAnyOrder(List.of(6, 7));
	}
}
