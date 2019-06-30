
public class Foo {
	void main(String parameter, Locker locker) {
		// int lockId = locker.lock();
		// try {
			int i = parameter.length();
			firstOperation(i);
			// log(" first Operation executed with parameter " + i);
			secondOperation();
		/*
		 * } finally {
				locker.unlock(lockId);
		 * }
		*/
	}
	
	void firstOperation(int i) {
		System.out.println("First Operation " + i);
	}
	
	void secondOperation() {
		System.out.println("Second Operation executing...");
	}

}