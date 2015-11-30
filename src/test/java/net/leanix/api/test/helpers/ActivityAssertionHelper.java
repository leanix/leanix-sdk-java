/*
 * The MIT License
 *
 * Copyright 2015 LeanIX GmbH.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package net.leanix.api.test.helpers;

import java.util.List;
import net.leanix.api.common.ApiException;
import net.leanix.api.models.Activity;
import static org.junit.Assert.assertEquals;

/**
 * Contains assert-methods for checking activities.
 *
 * @author patrick
 */
public class ActivityAssertionHelper {

    public static void assertActivitiesForFactSheet(List<Activity> activities, String factSheetName, int expectedCount) throws ApiException {
        int count = 0;
        for (Activity activity : activities) {
            if (activity.getFactSheet().getName().equals(factSheetName)) {
                count++;
            }
        }

        assertEquals("Count of activities for Fact Sheet " + factSheetName,
                expectedCount, count);
    }

    public static void assertActivitiesWithEventType(List<Activity> activities, String eventType, int expectedCount) throws ApiException {
        int count = 0;
        for (Activity activity : activities) {
            if (activity.getEventType().equals(eventType)) {
                count++;
            }
        }

        assertEquals("Count of activities with event type " + eventType,
                expectedCount, count);
    }
}
