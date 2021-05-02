package org.springframework1;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{
    private List<String> list = new ArrayList<>();
    {
        list.add("Unfogiven I");
        list.add("Unfogiven II");
        list.add("Unfogiven III");
    }



    @Override
    public List<String> getSong() {
        return list;
    }

}
