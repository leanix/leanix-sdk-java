package net.leanix.api.filter;

public class DateFilter {
    public enum DateFilterType {
        POINT, RANGE, TODAY, END_OF_MONTH, END_OF_YEAR
    }

    private String minDate;
    private String maxDate;
    private String from;
    private String to;
    private DateFilterType dateFilterType;

    public String getMinDate() {
        return minDate;
    }

    public void setMinDate(String minDate) {
        this.minDate = minDate;
    }

    public String getMaxDate() {
        return maxDate;
    }

    public void setMaxDate(String maxDate) {
        this.maxDate = maxDate;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public DateFilterType getDateFilterType() {
        return dateFilterType;
    }

    public void setDateFilterType(DateFilterType dateFilterType) {
        this.dateFilterType = dateFilterType;
    }
}