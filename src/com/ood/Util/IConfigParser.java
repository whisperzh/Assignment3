package com.ood.Util;

import java.io.IOException;

public interface IConfigParser {
    void readFile() throws IOException;
    void reset();
}
