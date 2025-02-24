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
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import usu.util.StringUtil;
import usu.widget.text.DefaultDocument;

/**
 *
 * @author usu
 */
public class PasswordBox extends usu.widget.glass.PasswordBox {

    /*
     * Serial version UID
     */
    private static final long serialVersionUID = 1L;

    public PasswordBox() {
        super();
        setSelectionColor(Color.BLUE.brighter());
        setCaretColor(Color.white);
        setFont(getFont().deriveFont(Font.BOLD));
        setForeground(Color.WHITE);
        setHorizontalAlignment(LEFT);
        addFocusListener(new FocusAdapter() {

            @Override
            public void focusGained(FocusEvent e) {
                selectAll();
            }
        });
        setDocument(new DefaultDocument() {

            /*
             * Serial version UID
             */
            private static final long serialVersionUID = 1L;

            @Override
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                if (StringUtil.containQuote(str)) {
                    return;
                }
                super.insertString(offs, str, a);
            }
        });
    }
}
