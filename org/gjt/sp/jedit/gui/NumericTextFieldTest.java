package org.gjt.sp.jedit.gui;

import static org.junit.Assert.*;

import org.gjt.sp.jedit.gui.NumericTextField.IntegerDocumentFilter;
import org.junit.Test;

public class NumericTextFieldTest {

	@Test
	public void test() {
		
		NumericTextField NTF= new NumericTextField();
		IntegerDocumentFilter filt= NTF.new IntegerDocumentFilter();
		boolean s= filt.isInteger("4");
		assertTrue(s);
	
		
}
}
