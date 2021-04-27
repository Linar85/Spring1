package org.springframework;

public class ClassicalMusic implements Music{
    private ClassicalMusic() {
    }

    @Override
    public String getSong() {
        return "Hungary Rapsody";
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
