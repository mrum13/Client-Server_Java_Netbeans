package com.wordpress.yyaayyaatt.jxl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


public class JTableToExcelConverter {

    private JTable jtable;

    public JTableToExcelConverter(JTable table) {
        this.jtable = table;
    }

    public void convert(File file) {
        // ambil table model
        TableModel tableModel = jtable.getModel();

        // ambil data header table
        List<String> header = new ArrayList<String>();
        for (int i = 0; i < tableModel.getColumnCount(); i++) {
            header.add(tableModel.getColumnName(i));
        }

        // ambil data seluruh tabel
        List<List<Object>> data = new ArrayList<List<Object>>();

        // ambil data tiap baris
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            List<Object> row = new ArrayList<Object>();
            for (int j = 0; j < tableModel.getColumnCount(); j++) {
                row.add(tableModel.getValueAt(i, j));
            }
            data.add(row);
        }

        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet();

        HSSFRow rowHeader = sheet.createRow(0);
        for (int i = 0; i < header.size(); i++) {
            HSSFCell rowCell = rowHeader.createCell(i);
            rowCell.setCellValue(header.get(i));
        }

        for (int i = 0; i < data.size(); i++) {
            HSSFRow row = sheet.createRow(i + 1);
            List<Object> dataRow = data.get(i);
            for (int j = 0; j < dataRow.size(); j++) {
                HSSFCell cell = row.createCell(j);
                cell.setCellValue(dataRow.get(j).toString());
            }
        }

        FileOutputStream stream = null;
        try {
            stream = new FileOutputStream(file);
            workbook.write(stream);
        } catch (IOException ex) {
            Logger.getLogger(JTableToExcelConverter.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (stream != null) {
                try {
                    stream.close();
                } catch (IOException ex) {
                    Logger.getLogger(JTableToExcelConverter.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
