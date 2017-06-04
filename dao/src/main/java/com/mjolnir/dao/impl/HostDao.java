package com.mjolnir.dao.impl;

import com.mjolnir.dao.IBaseDao;
import com.mjolnir.dao.connection.PostgresConnection;
import com.mjolnir.datamodel.Host;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class HostDao implements IBaseDao {

    private static final Logger LOGGER = LogManager.getLogger(HostDao.class);

    // properties will be JSON
    private static final String CREATE_HOST_TABLE = "CREATE TABLE IF NOT EXISTS hosts (hostName STRING PRIMARY KEY, ipAddress STRING, properties BYTES)";

    private static final String INSERT_HOST = "";

    private static final String DELETE_HOST = "";

    private static final String GET_ALL_HOSTS = "";
    private static final String GET_HOST = "";

    // TODO: How to pass in Connection? Create everytime? Share via Spring?
    private Connection connection = new PostgresConnection().connect();

    @Override
    public void init() {
        try {
            PreparedStatement ps = connection.prepareStatement(CREATE_HOST_TABLE);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            LOGGER.error("Failed to create Host table", e);
        }
    }

    public Host getHost(String hostName) {
        return new Host("test");
    }

    public List<Host> getHosts() {
        return Arrays.asList(new Host("Test"), new Host("Test2"));
    }

    public void addHost(Host host) {

    }

    public void deleteHost(String hostName) {

    }

    public void updateHost(Host host) {

    }
}
