package com.shajid.app.shajid2207060.database;

import com.shajid.app.shajid2207060.model.CVData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CVDAO {

    public static void insert(CVData cv) {
        String query = """
                INSERT INTO cv(fullName, email, phone, address,
                               education, skills, experience, projects)
                VALUES (?, ?, ?, ?, ?, ?, ?, ?)
                """;

        try (Connection conn = DatabaseConnection.connect();
             PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setString(1, cv.getFullName());
            ps.setString(2, cv.getEmail());
            ps.setString(3, cv.getPhone());
            ps.setString(4, cv.getAddress());
            ps.setString(5, cv.getEducation());
            ps.setString(6, cv.getSkills());
            ps.setString(7, cv.getExperience());
            ps.setString(8, cv.getProjects());

            ps.executeUpdate();
            System.out.println("CV saved successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<CVData> getAll() {
        ArrayList<CVData> list = new ArrayList<>();

        String query = "SELECT * FROM cv";

        try (Connection conn = DatabaseConnection.connect();
             PreparedStatement ps = conn.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                CVData cv = new CVData(
                        rs.getString("fullName"),
                        rs.getString("email"),
                        rs.getString("phone"),
                        rs.getString("address"),
                        rs.getString("education"),
                        rs.getString("skills"),
                        rs.getString("experience"),
                        rs.getString("projects")
                );
                list.add(cv);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}
