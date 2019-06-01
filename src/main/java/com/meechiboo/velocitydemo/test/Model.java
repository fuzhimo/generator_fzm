package com.meechiboo.velocitydemo.test;


/**
 * 配置信息
 *
 * @author xi.yang
 * @create 2018-10-16 15:40
 **/

public class Model {

    private String fileOutPath;
    private String fileExcelPath;
    private String toPackage;
    private String baseToPackage;

    public String getFileExcelPath() {
        return fileExcelPath;
    }

    public void setFileExcelPath(String fileExcelPath) {
        this.fileExcelPath = fileExcelPath;
    }

    public String getToPackage() {
        return toPackage;
    }

    public void setToPackage(String toPackage) {
        this.toPackage = toPackage;
    }

    public String getBaseToPackage() {
        return baseToPackage;
    }

    public void setBaseToPackage(String baseToPackage) {
        this.baseToPackage = baseToPackage;
    }

    public String getFileOutPath() {

        return fileOutPath;
    }

    public void setFileOutPath(String fileOutPath) {
        this.fileOutPath = fileOutPath;
    }
}