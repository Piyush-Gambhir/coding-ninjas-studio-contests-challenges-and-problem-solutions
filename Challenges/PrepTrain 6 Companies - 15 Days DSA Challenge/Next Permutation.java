import java.util.*;
import java.io.*;

public class Solution {
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) {

		int n = permutation.size();

		for (int i = n - 2; i >= 0; i--) {
			if (permutation.get(i) < permutation.get(i + 1)) {
				int id = n - 1;

				for (int j = i + 1; j < n; j++) {
					if (permutation.get(j) < permutation.get(i)) {
						id = j - 1;
						break;
					}
				}
				Collections.swap(permutation, i, id);

				for (int j = 0; j < (n - i) / 2; j++) {
					Collections.swap(permutation, (i + 1 + j), (n - 1 - j));
				}

				return permutation;
			}
		}
		for (int i = 0; i < n; i++) {
			permutation.set(i, i + 1);
		}

		return permutation;
	}
}
