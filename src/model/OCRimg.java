/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;

/**
 *
 * @author acer
 */
public class OCRimg {
    private String language;
    private String fileImg;
    File img;

    public OCRimg(String language, String fileImg) {
        this.language = language;
        this.fileImg = fileImg;
        img = new File (fileImg);
    }
    
    public String getLanguage() {
        return language;
    }

    public String getFileImg() {
        return fileImg;
    }

    public File getImg() {
        return img;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setFileImg(String fileImg) {
        this.fileImg = fileImg;
    }

    public void setImg(File img) {
        this.img = img;
    }
    public void LoadImg()
    {
        img = new File (fileImg);
    }
}
