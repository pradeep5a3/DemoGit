//package com.embitel.aidlexamples;
//
//import android.content.Context;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mock;
//import org.mockito.runners.MockitoJUnitRunner;
//
//import static org.hamcrest.CoreMatchers.is;
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.mockito.Mockito.when;
//
//@RunWith(MockitoJUnitRunner.class)
//public class UnitTestSample {
//
//    private static final String FAKE_STRING = "HELLO WORLD";
//
//    @Mock
//    Context mMockContext;
////
//    @Test
//    public void readStringFromContext_LocalizedString() {
//        // Given a mocked Context injected into the object under test...
//        when(mMockContext.getString(R.string.hello_word))
//                .thenReturn(FAKE_STRING);
//        MainActivity myObjectUnderTest = new MainActivity(mMockContext);
//
//        // ...when the string is returned from the object under test...
//        String result = myObjectUnderTest.getHelloWorldString();
//
//        // ...then the result should be the expected one.
//        assertThat(result, is(FAKE_STRING));
//    }
//}