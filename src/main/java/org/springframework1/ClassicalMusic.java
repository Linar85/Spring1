package org.springframework1;

import java.util.ArrayList;
import java.util.List;

public class ClassicalMusic implements Music {


    private List<String> list = new ArrayList<>();

    {
        list.add("Rapsody I");
        list.add("Rapsody II");
        list.add("Rapsody III");
    }


    @Override
    public List<String> getSong() {
        return list;
    }


}
