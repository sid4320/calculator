package com.example.ankita.cal;

import android.content.Context;

import static junit.framework.Assert.assertEquals;


import android.support.Test.InstrumentationRegistry;
import android.support.Test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import dalvik.annotation.TestTarget;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.ankita.cal", appContext.getPackageName());
    }
}
