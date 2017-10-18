package net.leanix.api.common.graphQL;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Patch {
    public enum PatchOperation {
        ADD, REPLACE, REMOVE;

        @Override
        public String toString() {
            return super.toString().toLowerCase();
        }

        @JsonCreator
        public static PatchOperation fromJson(String rawValue) {
            return valueOf(rawValue.toUpperCase());
        }
    }

    @JsonProperty("path")
    private String path;

    @JsonProperty("op")
    private PatchOperation operation;

    @JsonProperty("value")
    private Object value;

    public Patch(PatchOperation operation, String path, Object value) {
        this.path = path;
        this.operation = operation;
        this.value = value;
    }

    public PatchOperation getOperation() {
        return operation;
    }

    public void setOperation(PatchOperation operation) {
        this.operation = operation;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
