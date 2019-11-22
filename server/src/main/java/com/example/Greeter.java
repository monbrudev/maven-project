/**
* Info about this package doing something for package-info.java file.
*/
package com.example;

/**
 * This is a class.
 */
public class Greeter {

	/**
	 * This is a constructor .
	 */
	public Greeter() {

	}

	/** {@inheritDoc} **/
	public String greet(final String someone) {
		/**
		 * This is a Javadoc required comment
		 */
		return String.format("Hello, %s!", someone);
	}
}
