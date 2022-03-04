package com.CN.listeners;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

//Scenario may appear in which the user seeks to override the content of the annotation
// based on a condition. In such a case it is not necessary to make changes in the source code.
// Simply use IAnnotationTransformer to override the content of the annotations
public class AnnotationTransformer implements IAnnotationTransformer {
    int counter = 3;

    @Override
    public void transform(ITestAnnotation testAnnotation, Class testClass, Constructor testConstrutor, Method testMethod) {
        if (testMethod.getName().equals("changeInvocationCountOfMethod")) {
            System.out.println("Changing invocation for the following method: " + testMethod.getName());
            testAnnotation.setInvocationCount(counter);
        }
    }


}
