package com.epam.lab.hw3;

import java.io.File;
import java.io.IOException;

public class Task {
    private String name;
    private String string;

    public String getString() {
        return string;
    }

    public String getName() {
        return name;
    }

    public Task(String name){
        this.name = name;
    }

    public Task(String name, String string){
        this.name = name;
        this.string = string;
    }

    public static int multiply(int a, int b){
        return a*b;
    }

    public boolean notEmptyName(){
        return (this.name!=null);
    }

    private static int adding(int a, int b){
        return a+b;
    }

    public static void fileCreation() throws IOException {
        File file = new File("/Users/lni/IdeaProjects/h3w/file.txt");
        file.createNewFile();
    }
}
