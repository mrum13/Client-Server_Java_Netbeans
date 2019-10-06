/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package krs;

import com.jtattoo.plaf.aero.AeroLookAndFeel;
import com.wordpress.yyaayyaatt.JFrame.LaunchProgressBar;
import com.wordpress.yyaayyaatt.JFrame.LoginDialog;
import com.wordpress.yyaayyaatt.JFrame.MainMenu;
import com.wordpress.yyaayyaatt.service.DetailKrsService;
import com.wordpress.yyaayyaatt.service.DosenService;
import com.wordpress.yyaayyaatt.service.KelasService;
import com.wordpress.yyaayyaatt.service.LoginService;
import com.wordpress.yyaayyaatt.service.MahasiswaService;
import com.wordpress.yyaayyaatt.service.MkService;
import com.wordpress.yyaayyaatt.service.PembimbingService;
import com.wordpress.yyaayyaatt.service.WaktuKrsService;
import com.wordpress.yyaayyaatt.service.report.KRSReportService;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Mr.Blue
 */
public class KRS {

    private static MainMenu mainMenu;
    private static LoginDialog loginDialog;
    private static LaunchProgressBar launchProgressBar;
    private static MahasiswaService mahasiswaService;
    private static DosenService dosenService;
    private static KelasService kelasService;
    private static MkService mkService;
    private static PembimbingService pembimbingService;
    private static DetailKrsService detailKrsService;
    private static KRSReportService kRSReportService;
    private static LoginService loginService;
    private static WaktuKrsService waktuKrsService;

    public static LoginService getLoginService() {
        return loginService;
    }

    public static LaunchProgressBar getLaunchProgressBar() {
        return launchProgressBar;
    }

    public static MainMenu getMainMenu() {
        return mainMenu;
    }

    public static WaktuKrsService getWaktuKrsService() {
        return waktuKrsService;
    }

    public static DetailKrsService getDetailKrsService() {
        return detailKrsService;
    }

    public static MahasiswaService getMahasiswaService() {
        return mahasiswaService;
    }

    public static DosenService getDosenService() {
        return dosenService;
    }

    public static KelasService getKelasService() {
        return kelasService;
    }

    public static MkService getMkService() {
        return mkService;
    }

    public static PembimbingService getPembimbingService() {
        return pembimbingService;
    }

    public static KRSReportService getkRSReportService() {
        return kRSReportService;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ApplicationContext appContext
                = new ClassPathXmlApplicationContext("appContext.xml");
        mahasiswaService = (MahasiswaService) appContext.getBean("mahasiswaService");
        detailKrsService = (DetailKrsService) appContext.getBean("detailKrsService");
        dosenService = (DosenService) appContext.getBean("dosenService");
        kelasService = (KelasService) appContext.getBean("kelasService");
        mkService = (MkService) appContext.getBean("mkService");
        pembimbingService = (PembimbingService) appContext.getBean("pembimbingService");
        kRSReportService = (KRSReportService) appContext.getBean("kRSReportService");
        loginService = (LoginService) appContext.getBean("loginService");
        waktuKrsService = (WaktuKrsService) appContext.getBean("waktuKrsService");
        try {
            UIManager.setLookAndFeel(new AeroLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(KRS.class.getName()).log(Level.SEVERE, null, ex);
        }
//        mainMenu = new MainMenu();
//        mainMenu.setVisible(true);
        try {
            
                loginDialog = new LoginDialog(KRS.getMainMenu(), true);
                loginDialog.setVisible(true);
             
        } catch (Exception e) {
            System.err.println("error : "+e.toString());
        }
    }

}
