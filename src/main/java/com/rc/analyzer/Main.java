package com.rc.analyzer;

import org.apache.commons.codec.binary.Base64;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;

public class Main {

    public static void main(String args[]) {
        try {
            System.out.println("superman");
            BufferedImage sourceimage = ImageIO.read(new File("C:\\Users\\lenovo\\Desktop\\faces.jpg"));
            ByteArrayOutputStream bytes = new ByteArrayOutputStream();
            ImageIO.write(sourceimage, "png", bytes);
            String resultantimage = Base64.encodeBase64String(bytes.toByteArray());
            System.out.println(resultantimage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
