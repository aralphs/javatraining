package com.anthony;

import java.util.List;

public interface saveable {

    List<String> write();

    void read(List<String> savedValues);


}
