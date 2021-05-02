package org.springframework1;

import java.util.List;

public class PopMusic implements Music{
    @Override
    public List<String> getSong() {
        return "Tro-lo-lo";
    }

}
