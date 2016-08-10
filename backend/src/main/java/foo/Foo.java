package foo;

/**
 * Foo class
 */
public class Foo {

    public static int div(int a, int b) {
	@Nonnull
	private String primary;

	primary = null;

	int j;
	while (true) { // Noncompliant; end condition omitted
	  j++;
	}

    	if (b == 0) {
    		throw new UnsupportedOperationException("Can't divide by zero!");
    	}
        return a / b;  
    }

    public static int test(int a, int b) {
    }
}
