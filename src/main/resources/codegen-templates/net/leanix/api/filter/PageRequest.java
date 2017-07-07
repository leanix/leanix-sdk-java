package net.leanix.api.filter;

import java.util.ArrayList;
import java.util.List;
import jersey.repackaged.com.google.common.base.Joiner;
import org.apache.commons.lang3.StringUtils;

public class PageRequest {
    private Integer first;
    private String after;
    private Integer last;
    private String before;

    public Integer getFirst() {
        return first;
    }

    public void setFirst(Integer first) {
        this.first = first;
    }

    public String getAfter() {
        return after;
    }

    public void setAfter(String after) {
        this.after = after;
    }

    public Integer getLast() {
        return last;
    }

    public void setLast(Integer last) {
        this.last = last;
    }

    public String getBefore() {
        return before;
    }

    public void setBefore(String before) {
        this.before = before;
    }

    public String toQuery() {
        List<String> queryParts = new ArrayList<>();
        if (first != null) {
            queryParts.add("first:" + first);
        }
        if (StringUtils.isNotEmpty(after)) {
            queryParts.add("after:\"" + after + "\"");
        }

        if (last != null) {
            queryParts.add("last:" + last);
        }
        if (StringUtils.isNotEmpty(before)) {
            queryParts.add("before:\"" + before + "\"");
        }

        return Joiner.on(" , ").join(queryParts);
    }
}