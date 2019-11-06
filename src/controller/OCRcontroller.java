/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.OCRimg;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

/**
 *
 * @author acer
 */
public class OCRcontroller {
    private OCRimg img;

    public OCRcontroller(OCRimg img) {
        this.img = img;

    }
    public OCRimg getImg() {
        return img;
    }
    public String DocImg()
    {
        String ans = "ERORR 404";
        ITesseract instance = new Tesseract();
        instance.setLanguage(img.getLanguage());
        try {
            ans = instance.doOCR(img.getImg());
            System.out.println(ans);
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
        return ans;
    }
     public static void main(String[] args) {
        OCRimg img = new OCRimg("eng","C:\\Users\\acer\\Desktop\\Capture.png");
        OCRcontroller o = new OCRcontroller(img);
        o.DocImg();
    }
}