package com.example.config;

public class DatabaseConfig {
    public static String getDbConnection() {
        // Логика подключения к базе данных
        return "jdbc:mysql://localhost:3306/mydb";
    }
}
