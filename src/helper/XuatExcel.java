/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Dell
 */
public class XuatExcel {

    public static void XuatExcel(String duongDan, JTable tbl, ArrayList<String> arr) {
        try {
            XSSFWorkbook workBook = new XSSFWorkbook();
            XSSFSheet sheet = workBook.createSheet("Danh sách nhân viên");
            XSSFRow row = null;
            Cell cell = null;
            row = sheet.createRow(0);
            for (int i = 0; i < arr.size(); i++) {
                cell = row.createCell(i, CellType.STRING);
                cell.setCellValue(arr.get(i));
            }
//            ArrayList<NhanVien> arrNV = BLL.BLLNhanVien.GetAll();
            for (int i = 0; i < tbl.getRowCount(); i++) {
                row = sheet.createRow(1 + i);
                for (int j = 0; j < arr.size(); j++) {
                    if (tbl.getValueAt(i, j) != null) {
                        cell = row.createCell(j, CellType.STRING);
                        cell.setCellValue(tbl.getValueAt(i, j).toString() + " ");
                    } else {
                        cell = row.createCell(j, CellType.STRING);
                        cell.setCellValue(" ");
                    }
                }

//                CellStyle cellStyle = workBook.createCellStyle(); 
//                CreationHelper createHelper = workBook.getCreationHelper(); 
//                cellStyle.setDataFormat(  
//                createHelper.createDataFormat().getFormat("dd/MM/yyyy"));  
//                cell.setCellStyle(cellStyle);  
            }

            for (int columnIndex = 0; columnIndex < arr.size(); columnIndex++) {
                sheet.autoSizeColumn(columnIndex);//Tự động điều chỉnh độ rộng của cột vừa đủ để hiển thị đầy đủ nội dung
            }
            File file = new File(duongDan);
            try {
                FileOutputStream fos = new FileOutputStream(file);
                workBook.write(fos);
                fos.close();
                ThongBao.ThongBaoDonGian("Thông báo", "In thành công");
            } catch (Exception e) {
                ThongBao.ThongBaoDonGian("Thông báo", "Thất bại 2");
            }
        } catch (Exception e) {
            ThongBao.ThongBaoDonGian("Thông báo", "Thất bại 1");
            System.out.println(e.getMessage());
        }

    }

    public static void XuatExcelTB(JTable tbl, ArrayList<String> arr) {
        JFileChooser fc = new JFileChooser("D:\\");
        fc.setFileFilter(new FileNameExtensionFilter("*.xlsx", "xlsx"));
        fc.setDialogTitle("Open File");
        fc.showSaveDialog(null);
        try {
            File file = fc.getSelectedFile();
            if (file.equals(null)) {
                return;
            }
            XuatExcel(file + ".xlsx", tbl, arr);
        } catch (Exception e) {
        }

    }

private void DocExcel(String duongDan)
    {
        try {
            FileInputStream excelFile  = new FileInputStream(duongDan);
            Workbook workbook = new XSSFWorkbook(excelFile );
            Sheet datatypeSheet = workbook.getSheetAt(0);
            DataFormatter fmt = new DataFormatter();
            Iterator<Row> iterator = datatypeSheet.iterator();
            Row firstRow = iterator.next();
            Cell firstCell = firstRow.getCell(0);
            while (iterator.hasNext()) 
            {
            Row currentRow = iterator.next();
//            NhanVien nhanVien = new NhanVien();
//            nhanVien.setMaNhanVien(Integer.parseInt(fmt.formatCellValue(currentRow.getCell(1))));
//            nhanVien.setTenNhanVien(currentRow.getCell(2).getStringCellValue());
//            nhanVien.setDiaChi(currentRow.getCell(3).getStringCellValue());
//            nhanVien.setSoDienThoai(currentRow.getCell(4).getStringCellValue());
//            nhanVien.setGioiTinh(currentRow.getCell(5).getBooleanCellValue());
//            nhanVien.setChucVu(currentRow.getCell(6).getStringCellValue());
//            nhanVien.setNgaySinh(currentRow.getCell(7).getDateCellValue());
//            nhanVien.setNgayVaoLam(currentRow.getCell(8).getDateCellValue());
//            nhanVien.setLuong(currentRow.getCell(9).getNumericCellValue());
//            nhanVien.setTenDangNhap(currentRow.getCell(10).getStringCellValue());
//            nhanVien.setMatKhau(currentRow.getCell(11).getStringCellValue());
//            BLL.BLLNhanVien.AddCoMaNhanVien(nhanVien);
            }
            workbook.close();
            
//        đổ dữ liệu lên table
//        ArrayList<NhanVien> arrNV = BLL.BLLNhanVien.GetAll();
//        BLL.BLLNhanVien.DoVaoTable(arrNV, tblNhanVien);
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {            
        }
        
    }
}
