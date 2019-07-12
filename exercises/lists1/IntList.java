public class IntList {
	public int first;
	public IntList rest;

	public IntList(int f, IntList r) {
		first = f;
		rest = r;
	}

	/** Return the size of the list using... recursion! */
	public int size() {
		if (rest == null){
			return 1;
		}return 1 + this.rest.size();
	}

	/** Return the size of the list using no recursion! */
	public int iterativeSize() {
		IntList p = this; /** A final variable may only be assigned to once. We could not use this = this.rest.*/
		int iterSize = 0; /** Be sure to tell Java what type the variable is!! */
		for (p != null){
			iterSize += 1;
			p = p.rest;
		}return iterSize;
	}

	/** Returns the ith value in this list.*/
	public int get(int i) {
		if (i == 0){
			return first;
		}return rest.get(i-1);
	}

	public static void main(String[] args) {
		IntList L = new IntList(15, null);
		L = new IntList(10, L);
		L = new IntList(5, L);

		System.out.println(L.iterativeSize());
	}
} 
