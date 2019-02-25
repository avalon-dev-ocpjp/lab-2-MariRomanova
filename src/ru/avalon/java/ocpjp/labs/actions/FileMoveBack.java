package ru.avalon.java.ocpjp.labs.actions;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FileMoveBack implements Action{

    @Override
    public void close() throws Exception {

    }

    @Override
    public void run() {
        File source1 = FileUtils.getFile ("c:\\Users\\UIS\\Desktop\\Avalon\\lab-1\\lab-1\\src\\ru\\avalon\\java\\ocpjp\\labs\\newresources\\last-names.txt");
        File distination1 = FileUtils.getFile("c:\\Users\\UIS\\Desktop\\Avalon\\lab-1\\lab-1\\src\\ru\\avalon\\java\\ocpjp\\labs\\resources\\");
        try {
            FileUtils.moveFileToDirectory(source1, distination1, false);
        } catch (IOException e) {
            System.out.println("File cant't be move");;
        }
    }

    @Override
    public void start() {

    }
}
