package com.shajid.app.shajid2207060.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    public static Connection connect() {
        try {
            String url = "jdbc:sqlite:cv.db";  // Database file will be created in project folder
            return DriverManager.getConnection(url);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void createTable() {
        String query = """
                CREATE TABLE IF NOT EXISTS cv (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    fullName TEXT,
                    email TEXT,
                    phone TEXT,
                    address TEXT,
                    education TEXT,
                    skills TEXT,
                    experience TEXT,
                    projects TEXT
                );
                """;

        try (Connection conn = connect()) {
            conn.createStatement().execute(query);
            System.out.println("CV Table Ready.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
