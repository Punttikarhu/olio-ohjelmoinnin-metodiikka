package fi.utu.tech;

import net.jqwik.api.*;

public class CalculatorTest {
	
	// Pettämätön logiikkani:
	// ohjelma toimii jos syöte != null ja lopputulos != null
	//
	// t. 1. vuoden opiskelija
	@Property
	boolean toimii() {
		return new CalculatorApp().calculate("1 2 3") != null;
	}
	
	@Property
	boolean testi1() {
		return new CalculatorApp().calculate("1 1 1") == "kelvoton syöte (b*b - 4*a*c < 0)";
	}
	
	@Property
	boolean testi2() {
		return new CalculatorApp().calculate("a b c") == "kelvoton syöte";
	}

	@Property
	boolean testi3() {
		return new CalculatorApp().calculate("123") == "kelvoton syöte";
	}
	
}