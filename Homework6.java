// Michael Maddalon

public class Homework6 {

private String string;
private int intA;
private int intB;
private int intC;

	/* Finish the constructor and create any necessary instance
	 * variables
	 */
	public Homework6(String s, int a, int b, int c) {
		string = s;
		intA = a;
		intB = b;
		intC = c;
	}

	/* Return true if the stored String comes before the provided
	 * String lexicographically, return false if it does not
	 */
	public boolean isBefore(String other) {
		if (string.compareTo(other) > 0) {
			return true;
		} else {
			return false;
		}
	}

	/* Return the maximum of the stored integers
	 */
	public int max() {
		if (intA > intB && intA > intC) {
			return intA;
		}	if (intB > intA && intB > intC) {
			return intB;
		} else {
			return intC;
		}
	}

	/* Return the middle value of the stored integers. If two numbers
	 * have the same value, return the lowest value. If all three numbers
	 * have the same value, return any. You must call the max() function
	 * to receive full credit
	 */
	public int mid() {
		if (max() == intA && intA > intB && intA > intC) {
			if (intB > intC) {
		 		return intB;
		 	} else {
		 		return intC;
		 	}
		}
		else if (max() == intB && intB > intA && intB > intC) {
			if (intA > intC) {
				return intA;
			} else {
				return intC;
			}
		}
		else if (max() == intC && intC > intA && intC > intB) {
			if (intA > intB) {
				return intA;
			} else {
				return intB;
			}
		}
		else if (intA == intB) {
			if (max() == intA) {
				return intC;
			} else {
				return intA;
			}
		}
		else if (intB == intC) {
			if (max() == intC) {
				return intA;
			} else {
				return intC;
			}
		}
		else if (intA == intC) {
			if (max() == intC) {
				return intB;
			} else {
				return intC;
			}
		}
		else {
			return intA;
		}
	}

	/* Return true if the stored numbers were provided in ascending
	 * order. They are considered ascending if each number is greater
	 * than or equal to the previous. To get full credit, do not use
	 * >= or =<; instead use < or > and invert them with !
	 */
	public boolean isAscending() {
		if (!(intA > intB && intB > intC)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		int exitCode = 0;

		Homework6 hw6 = new Homework6("Drive", 4, 5, 6);

		if (hw6.isBefore("Cars")) {
			System.out.println("Pass 1");
		} else {
			System.out.println("Fail 1");
			exitCode += 1;
		}

		if (hw6.max() == 6) {
			System.out.println("Pass 2");
		} else {
			System.out.println("Fail 2");
			exitCode += 1;
		}

		if (hw6.mid() == 5) {
			System.out.println("Pass 3");
		} else {
			System.out.println("Fail 3");
			exitCode += 1;
		}

		hw6 = new Homework6("Drive", 4, 5, 5);
		if (hw6.mid() == 4) {
			System.out.println("Pass 4");
		} else {
			System.out.println("Fail 4");
			exitCode += 1;
		}

		if (hw6.isAscending()) {
			System.out.println("Pass 5");
		} else {
			System.out.println("Fail 5");
			exitCode += 1;
		}

		if (exitCode == 0) {
			System.out.println("All Pass");
		} else {
			System.out.println("Fail");
		}

		System.exit(exitCode);
	}

}
