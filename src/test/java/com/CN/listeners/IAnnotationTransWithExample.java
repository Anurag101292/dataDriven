package com.CN.listeners;

import org.testng.annotations.Test;

public class IAnnotationTransWithExample {
    AnnotationTransformer n = new AnnotationTransformer();

    @Test(invocationCount=5)
    public void changeInvocationCountOfMethod()
    {
        System.out.println("This method have invocation count set to 5 but at run time it shall become "+ n.counter);
    }
}
