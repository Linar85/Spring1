package org.springframework;

public class PopMusic implements Music{
    @Override
    public String getSong() {
        return "Tro-lo-lo";
    }
    @Override
    public void init() {
        System.out.println("initing");
    }

    @Override
    public void destroy() {
        System.out.println("destroing");

    }
}
