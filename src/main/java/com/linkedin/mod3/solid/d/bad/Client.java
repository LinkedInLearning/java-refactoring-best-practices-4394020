package com.linkedin.mod3.solid.d.bad;


public class Client {
    private Database database;

    public Client() {
        this.database = new Database();
    }

    public void saveData(String data) {
        database.save(data);
    }
}
