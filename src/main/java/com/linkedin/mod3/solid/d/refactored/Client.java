package com.linkedin.mod3.solid.d.refactored;

public class Client {
    private Database database;

    public Client(Database database) {
        this.database = database;
    }

    public void saveData(String data) {
        database.save(data);
    }
}

