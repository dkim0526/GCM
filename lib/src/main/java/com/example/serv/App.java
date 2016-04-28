package com.example.serv;

/**
 * Created by Agneev on 22-04-2016.
 */
import com.example.server.vo.Content;

public class App {
    public static void main(String[] args) {

        System.out.println("Sending POST to GCM");

        String apiKey = "AIzaSyCEO5zVwZjO55U2qrO5_hy9j-xM2nY9vWo";
        Content content = createContent();

        Post2Gcm.post(apiKey, content);
    }

    public static Content createContent() {
        Content c = new Content();

        c.addRegId("APA91bE_WZ-xwqriSvk38IfrzxoC0vM5qUB3BsWtYXVgEZ-2h7dkooRrHa6sWSDoasff9cDZ1Ymchr8EACg3ERaj3X6K-c3DIeBHxyY9PUWc2P20cnvT14_EjGWVxIGVHgaxu8JP7D3Q");

        c.createData("Working!!", "Test message");

        return c;
    }
}

