package by.overone.lesson21;

import java.util.*;

public class Homework {

    public static int countUnique(List<Integer> numbers) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        Iterator<Integer> itr = numbers.iterator();
        while (itr.hasNext()) {
            uniqueNumbers.add(itr.next());
        }
        return uniqueNumbers.size();
    }    
    void testCountUnique() {

        List<Integer> numbers = new ArrayList<Integer>();
        assertEquals(0, countUnique(numbers));

        int[] numberArray = {3, 7, 3, -1, 2, 3, 2, 7, 15, 15};
        for (int n : numberArray) {
            numbers.add(n);
        }
        assertEquals(5, countUnique(numbers));

        numbers.clear();
        numbers.add(3);
        numbers.add(7);
        assertEquals(2, countUnique(numbers));
    }

    private void assertEquals(int i, int countUnique) {
    }

}

