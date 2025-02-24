/*
 * DILARANG MENGHAPUS ATAU MENGEDIT COPYRIGHT INI.
 * 
 * Copyright 2008 echo.khannedy@gmail.com. 
 * All rights reserved.
 * 
 * Semua isi dalam file ini adalah hak milik dari echo.khannedy@gmail.com
 * Anda tak diperkenankan untuk menggunakan file atau mengubah file
 * ini kecuali anda tidak menghapus atau merubah lisence ini.
 * 
 * File ini dibuat menggunakan :
 * IDE        : NetBeans
 * NoteBook   : Acer Aspire 5920G
 * OS         : Windows Vista
 * Java       : Java 1.6
 */
package com.apotik.widget;

import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author usu
 */
public class TextArea extends JTextArea {

    /*
     * Serial version UID
     */
    private static final long serialVersionUID = 1L;

    public TextArea() {
        super();
        setOpaque(false);
        setLineWrap(true);
        setWrapStyleWord(true);
        setFont(new java.awt.Font("Tahoma", 1, 11));
        setBorder(new EmptyBorder(5, 5, 5, 5));
        setForeground(Color.WHITE);
    }
}
