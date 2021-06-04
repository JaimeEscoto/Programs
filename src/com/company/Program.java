package com.company;

import java.util.Locale;

public class Program {
    private String name;
    private String user;
    private double memorySize;

    public Program()
    {
        name = "";
        user = "";
        memorySize=0.0;
    }

    public String getName() {
        return name;
    }

    public String getUser() {
        return user;
    }

    public double getMemorySize() {
        return memorySize;
    }

    public void setName(String name) {

        this.name = name.toLowerCase();
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setMemorySize(double memorySize) {
        this.memorySize = memorySize;
    }
}
