package org.testng;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.apache.xmlbeans.impl.xb.xsdschema.AnnotationDocument.Annotation;
import org.testng.annotations.ITestAnnotation;

public class FailedAll implements IAnnotationTransformer {

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {

		IRetryAnalyzer r = annotation.getRetryAnalyzer();
		if (r==null) {
			annotation.setRetryAnalyzer(Faild.class);
		}
		
	}

}
