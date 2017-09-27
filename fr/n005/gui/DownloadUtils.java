/*    */ package fr.n005.gui;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import javax.swing.JDialog;
/*    */ import javax.swing.JFileChooser;
/*    */ import javax.swing.JOptionPane;
/*    */ 
/*    */ public class DownloadUtils
/*    */ {
/*    */   public static void downloadUtils(String link, String hash, String filename)
/*    */   {
/* 13 */     JDialog dialog = new JDialog();
/* 14 */     javax.swing.JLabel label = new javax.swing.JLabel("Please wait...");
/* 15 */     dialog.setLocationRelativeTo(null);
/* 16 */     dialog.setTitle("Please Wait...");
/* 17 */     dialog.add(label);
/* 18 */     dialog.pack();
/* 19 */     dialog.setSize(180, 60);
/*    */     
/* 21 */     JFileChooser fileChooser = new JFileChooser();
/* 22 */     if (fileChooser.showSaveDialog(null) == 0) {
/* 23 */       File FilePath = fileChooser.getSelectedFile();
/* 24 */       File Filefile = FilePath.getAbsoluteFile().getParentFile();
/* 25 */       String File = Filefile.toString();
/* 26 */       dialog.setVisible(true);
/* 27 */       if (Url.exists(link)) {
/* 28 */         dialog.setVisible(false);
/*    */         try {
/* 30 */           dialog.setVisible(true);
/* 31 */           HttpDownloadUtility.downloadFile(link, File);
/* 32 */           dialog.setVisible(false);
/*    */         } catch (IOException ex) {
/* 34 */           ex.printStackTrace();
/*    */         }
/* 36 */         File f = new File(File + filename);
/* 37 */         if ((f.exists()) && (!f.isDirectory())) {
/* 38 */           JOptionPane.showMessageDialog(null, "Your file has been saved: " + File + filename);
/*    */           try {
/* 40 */             File file = new File(File + filename);
/* 41 */             String sha256Hash = HashGeneratorUtils.generateSHA256(file);
/* 42 */             System.out.println("SHA-256 Hash: " + sha256Hash);
/* 43 */             String Hash = hash;
/* 44 */             if (sha256Hash.equals(Hash)) {
/* 45 */               JOptionPane.showMessageDialog(null, "The sha-256 it's ok !");
/*    */             }
/*    */             else {
/* 48 */               JOptionPane.showMessageDialog(null, "Your file can be error");
/*    */             }
/*    */           } catch (HashGenerationException e1) {
/* 51 */             e1.printStackTrace();
/*    */           }
/*    */         }
/*    */         else {
/* 55 */           JOptionPane.showMessageDialog(null, "File error: The file do not exist!");
/*    */         }
/*    */       }
/*    */       else {
/* 59 */         JOptionPane.showMessageDialog(null, "URL error: The url is dead, please check your internet connection or contact N005");
/*    */       }
/*    */     }
/* 62 */     dialog.setVisible(false);
/*    */   }
/*    */ }


/* Location:              C:\Users\N005\Desktop\N005.jar!\fr\n005\gui\DownloadUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */