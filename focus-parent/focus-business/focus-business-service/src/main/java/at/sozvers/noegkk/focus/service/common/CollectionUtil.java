package at.sozvers.noegkk.focus.service.common;

import java.util.*;

public class CollectionUtil {
  private CollectionUtil() {
	//Private Constructor
  }

  public static boolean isNotEmpty(Collection<?> coll) {
	return !isEmpty(coll);
  }

  public static boolean isEmpty(Collection<?> coll) {
	return (coll == null) || (coll.isEmpty());
  }

  public static <T> List<List<T>> partitioniereListe(List<T> original, int maxSize) {
	if(maxSize <= 0) {
	  throw new IllegalArgumentException("maxSize = " + maxSize);
	}
	List<List<T>> result = new ArrayList<>();

	int size = original.size();
	for(int i = 0; i < size; i += maxSize) {
	  result.add(new ArrayList<>(original.subList(i, Math.min(size, i + maxSize))));
	}

	return result;
  }
}
