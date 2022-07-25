package com.greatlearning.balanced;

public class BalancedBrackets {

	public static void main(String[] args) {
		String expr = "([{)(}])}";

        // Function call
        if (CheckBalancedBrackets.areBracketsBalanced(expr))
            System.out.println("The entered String has Balanced Brackets");
        else
            System.out.println("The entered Strings do not contain Balanced Brackets");
	}

}
