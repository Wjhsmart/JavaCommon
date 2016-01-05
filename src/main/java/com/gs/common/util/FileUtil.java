package com.gs.common.util;

import java.io.File;

/**
 * Created by WangGenshen on 1/5/16.
 */
public class FileUtil {

    public void mkdir(String path) {
        File file = new File(path);
        if (!file.exists()) {
            file.mkdir();
        }
    }

}
