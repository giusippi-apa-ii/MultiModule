package com.exist.app;

import com.exist.service.TableService;
import com.exist.service.impl.TableServiceImpl;
import com.exist.service.FileService;
import com.exist.service.impl.FileServiceImpl;
import com.exist.utilities.ScanUtils;


import java.io.IOException;

public class MenuApplication {

    public void start(String[] args) {
        try {

            FileService fileService = new FileServiceImpl();
            String fileName = (args.length == 0) ? FileService.DEFAULT_RESOURCE : fileService.getFileName(args);

            MenuManager menu = new MenuManager();
            menu.startApplication(fileName);
            menu.displayMenu();

        } catch (Exception e) {
            System.err.println("System Error: " + e.getMessage());
        }
    }
}
