/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package com.mycompany.app;

public class App {
    public static void main(String[] args) {
        String version = System.getProperty("java.version");
        System.out.printf("Hello from java %s!\n", version);
        System.out.printf("java.home=%s\n", System.getProperty("java.home"));
        System.out.printf("user.home=%s\n", System.getProperty("user.home"));
    }
}
