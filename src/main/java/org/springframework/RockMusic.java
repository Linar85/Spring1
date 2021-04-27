package org.springframework;

public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Unfogiven";
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
