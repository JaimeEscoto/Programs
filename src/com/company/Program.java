package com.company;

import java.util.Locale;

public class Program {
    private String name;
    String user;
    double memorySize;

    public Program()
    {
        name = "";
        user = "";
        memorySize=0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name.toLowerCase();
    }
}
