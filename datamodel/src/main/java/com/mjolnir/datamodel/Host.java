package com.mjolnir.datamodel;

import java.util.HashMap;
import java.util.Map;

public class Host {

    private String hostName;
    private String ipAddress;

    // TODO: Change this to JSON when serializing.
    private Map<String, Object> properties = new HashMap<>();

    public Host(String hostName) {
        this.hostName = hostName;
    }

    public Host(String hostName, String ipAddress) {
        this(hostName);
        this.ipAddress = ipAddress;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getHostName() {
        return hostName;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    public void addProperty(String name, Object value) {
        properties.put(name, value);
    }

    public Object removeProperty(String name) {
        return properties.remove(name);
    }
}
