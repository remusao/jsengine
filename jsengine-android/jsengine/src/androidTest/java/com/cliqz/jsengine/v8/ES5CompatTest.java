package com.cliqz.jsengine.v8;

import org.json.JSONException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.IOException;
import java.util.Collection;

/**
 * Created by sammacbeth on 29/09/2016.
 */

@RunWith(Parameterized.class)
public class ES5CompatTest extends ESCompatTest {

    @Parameterized.Parameters (name = "{0} :: {1}")
    public static Collection<Object[]> getES5Tests() throws IOException, JSONException {
        return ESCompatTest.getTestsFromFile("es5tests.json");
    }

    public ES5CompatTest(String category, String testName, String testFn, Boolean skip) throws JSApiException {
        super(category, testName, testFn, skip);
    }
}
