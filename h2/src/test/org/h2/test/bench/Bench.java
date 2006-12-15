/*
 * Copyright 2004-2006 H2 Group. Licensed under the H2 License, Version 1.0 (http://h2database.com/html/license.html).
 * Initial Developer: H2 Group
 */
package org.h2.test.bench;

public interface Bench {
    
    void init(Database db, int size) throws Exception;
    void run() throws Exception;
    String getName();

}
