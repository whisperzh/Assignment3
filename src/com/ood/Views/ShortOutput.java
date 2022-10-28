package com.ood.Views;

/**
 * my own output interface
 */
public interface ShortOutput {
    public default void jout(String str) {
        System.out.println(str);
    }

    public default void joutDivider(){
        System.out.println("========================================================================================");
    }
}
