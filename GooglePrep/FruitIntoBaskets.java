package GooglePrep.GooglePrep;

import java.util.HashSet;
import java.util.Set;

public class FruitIntoBaskets {

	public int totalFruit(int[] fruits) {
        
		if(fruits == null || fruits.length == 0) return 0;
		int currentIndex = 0;
		int currentFruits = 0;
		int maxFruits = 0;
		int nextPossibleRunStartIndex = 0;
		Set<Integer> currentFruitTypes = new HashSet<>();
		
		while(currentIndex < fruits.length) {
			currentFruitTypes.add(fruits[currentIndex]);
			if(currentFruitTypes.size() == 3) {
				currentFruitTypes.clear();
				currentFruitTypes.add(fruits[currentIndex]);
				currentFruitTypes.add(fruits[nextPossibleRunStartIndex]);
				if(currentFruits > maxFruits) maxFruits = currentFruits;
				currentFruits = currentIndex - nextPossibleRunStartIndex + 1;
				nextPossibleRunStartIndex = currentIndex;
			} else {
				currentFruits++;
				if(fruits[nextPossibleRunStartIndex] != fruits[currentIndex]) {
					nextPossibleRunStartIndex = currentIndex;
				}
			}
			currentIndex++;
		}
		if(currentFruits > maxFruits) maxFruits = currentFruits;
		return maxFruits;
    }

}
