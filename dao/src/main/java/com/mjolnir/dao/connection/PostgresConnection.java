package com.mjolnir.dao.connection;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Value;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresConnection {

    private static final Logger LOGGER = LogManager.getLogger(PostgresConnection.class);

    @Value("${postgres.connection.url}")
    private String url;

    @Value("${postgres.user}")
    private String user;

    @Value("${postgres.password}")
    private String password;

    public Connection connect() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
            LOGGER.info("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            LOGGER.error("Failed to establish PostgreSQL Connection.", e);
        }
        return connection;
    }
}
