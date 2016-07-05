/*
 * The MIT License
 *
 * Copyright 2016 LeanIX GmbH
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

import net.leanix.api.ActivitiesApi;
import net.leanix.api.common.ApiClient;
import net.leanix.api.common.ApiClientBuilder;
import net.leanix.api.models.Activity;
import net.leanix.api.models.ActivityStream;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ActivityStreamTest {
    public static void main(String[] args) {
        try {
            ApiClient apiClient = new ApiClientBuilder()
                    .withBasePath("https://app.leanix.net/demo/api/v1")
                    .withTokenProviderHost("svc.leanix.net")
                    .withApiToken("NOnrUpMXEh87xbDCYkLfrBmfbzLOFznjqVqEbNMp")
                    .build();

            ActivitiesApi api = new ActivitiesApi(apiClient);

            Calendar calendar = new GregorianCalendar(2015, 1, 1);
            Date startDate = calendar.getTime();
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

            ActivityStream stream = api.getActivities(null, df.format(startDate), null, null, null, null);

            System.out.println("Last update = " + stream);

            for (Activity act : stream.getData()) {
                System.out.println(act.getID() + " " + act.getEventType() + " " + (act.getFactSheet() != null ? act.getFactSheet().getName() : ""));
            }

        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }

}
