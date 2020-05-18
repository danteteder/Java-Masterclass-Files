package com.company;

import java.util.ArrayList;
import java.util.List;

public interface ISaveable {
    //these are the 2 methods we need to use for this challenge
    List<String> write();
    void read(List<String> savedValues);


}
