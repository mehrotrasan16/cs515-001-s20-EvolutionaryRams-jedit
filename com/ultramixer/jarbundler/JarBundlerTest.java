package com.ultramixer.jarbundler;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

import org.apache.tools.ant.BuildException;

//check whether the extracted method is accessed or not 

public class JarBundlerTest {

	@Test
	public void test() {
		File mRootDir= new File("", "Contents");
		AppBundleProperties bundleProperties = new AppBundleProperties();
		JarBundler jar= new JarBundler();

		try {
		 jar.execute();
		}catch (Exception e)
		{
			assertNull(e.getMessage());

	    }

}
}
