/*
 * The MIT License (MIT)	 
 *
 * Copyright (c) 2015 LeanIX GmbH
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package net.leanix.benchmark;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.kohsuke.randname.RandomNameGenerator;

import net.leanix.api.models.FactSheetHasLifecycle;

/**
 * Collection of helper methods
 * 
 * @author andre.christ
 */
public class Helper {
    protected RandomNameGenerator rnd;

    public Date getRandomDate(String begin, String end) {
        long beginTime = Timestamp.valueOf(begin + " 00:00:00").getTime();
        long endTime = Timestamp.valueOf(end + " 00:58:00").getTime();

        long diff = endTime - beginTime + 1;
        long timeBetween = beginTime + (long) (Math.random() * diff);
        return new Date(timeBetween);
    }

    public List<FactSheetHasLifecycle> getRandomLifecycle(String start, String end) {
        List<FactSheetHasLifecycle> lcs = new ArrayList<>();

        Date active = this.getRandomDate(start, end);
        Calendar cal = Calendar.getInstance();
        cal.setTime(active);
        cal.add(Calendar.YEAR, 3);
        Date phaseOut = cal.getTime();
        cal.add(Calendar.YEAR, 2);
        Date endOfLife = cal.getTime();

        FactSheetHasLifecycle fActive = new FactSheetHasLifecycle();
        fActive.setStartDate(active);
        fActive.setLifecycleStateID("3");
        lcs.add(fActive);

        FactSheetHasLifecycle fPhaseOut = new FactSheetHasLifecycle();
        fPhaseOut.setStartDate(phaseOut);
        fPhaseOut.setLifecycleStateID("4");
        lcs.add(fPhaseOut);

        FactSheetHasLifecycle fEndOfLife = new FactSheetHasLifecycle();
        fEndOfLife.setStartDate(endOfLife);
        fEndOfLife.setLifecycleStateID("5");
        lcs.add(fEndOfLife);

        return lcs;
    }

    public Helper() throws Exception {
        rnd = new RandomNameGenerator(Integer.parseInt(this.getProperty("random.seed", "0")));
    }

    /**
     * Creates a random string. Current implementation returns a UUID, but this can change in the future to more meaningful string
     * 
     * @return
     */
    public String getUniqueString() {
        return rnd.next();
    }

    public String getUniqueText(int length) {
        String ret = null;

        for (int i = 0; i < length; i++) {
            if (i > 0)
                ret += " ";

            ret += rnd.next();
        }

        return ret;
    }

    /**
     * Returns property as String or default value in case property is not set.
     * 
     * @param key
     * @param defaultValue
     * @return
     * @throws Exception
     */
    public final String getProperty(String key, String defaultValue) throws Exception {
        String value = System.getProperty(key);
        if (value == null && defaultValue == null) {
            throw new Exception("Property " + key + " not set and no default given");
        }

        if (value == null) {
            value = defaultValue;
        }

        return value;
    }
}
