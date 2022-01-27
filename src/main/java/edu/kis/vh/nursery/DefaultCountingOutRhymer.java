package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int MAX_SIZE = 12;
	public static final int MAX_SIZE_2 = 11;
	private int[] numbers = new int[MAX_SIZE];

	public static final int EMPTY_TOTAL_RHYMER = -1;
	public int total = EMPTY_TOTAL_RHYMER;
	public static final int DEFAULT_RETURN = -1;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

		public boolean callCheck() {
			return total == EMPTY_TOTAL_RHYMER;
		}
		
			public boolean isFull() {
				return total == MAX_SIZE_2;
			}
		
				protected int peekaboo() {
					if (callCheck())
						return DEFAULT_RETURN;
					return numbers[total];
				}
			
					public int countOut() {
						if (callCheck())
							return DEFAULT_RETURN;
						return numbers[total--];
					}

}
