/*    */ package fr.n005.gui;
/*    */ 
/*    */ import java.awt.Container;
/*    */ import java.awt.EventQueue;
/*    */ import java.awt.Font;
/*    */ import java.awt.event.ActionEvent;
/*    */ import java.awt.event.ActionListener;
/*    */ import javax.swing.JButton;
/*    */ import javax.swing.JFrame;
/*    */ import javax.swing.JLabel;
/*    */ import javax.swing.JToolBar;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class test
/*    */ {
/*    */   private JFrame frmN;
/*    */   
/*    */   public static void main(String[] args)
/*    */   {
/* 23 */     EventQueue.invokeLater(new Runnable() {
/*    */       public void run() {
/*    */         try {
/* 26 */           test window = new test();
/* 27 */           window.frmN.setVisible(true);
/*    */         } catch (Exception e) {
/* 29 */           e.printStackTrace();
/*    */         }
/*    */       }
/*    */     });
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public test()
/*    */   {
/* 39 */     initialize();
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   private void initialize()
/*    */   {
/* 46 */     this.frmN = new JFrame();
/* 47 */     this.frmN.setResizable(false);
/* 48 */     this.frmN.setTitle("N005 beta 2.2");
/* 49 */     this.frmN.setBounds(100, 100, 450, 161);
/* 50 */     this.frmN.setDefaultCloseOperation(3);
/*    */     
/* 52 */     JToolBar toolBar = new JToolBar();
/* 53 */     this.frmN.getContentPane().add(toolBar, "North");
/*    */     
/* 55 */     JButton btnDownloadPlugin = new JButton("Download Plugins");
/* 56 */     btnDownloadPlugin.addActionListener(new ActionListener() {
/*    */       public void actionPerformed(ActionEvent e) {
/* 58 */         Plugins.main(null);
/*    */       }
/* 60 */     });
/* 61 */     toolBar.add(btnDownloadPlugin);
/*    */     
/* 63 */     JButton btnNewButton = new JButton("About");
/* 64 */     btnNewButton.addActionListener(new ActionListener() {
/*    */       public void actionPerformed(ActionEvent arg0) {
/* 66 */         About.main(null);
/*    */       }
/*    */       
/* 69 */     });
/* 70 */     JButton btnDownload = new JButton("Download Software and script");
/* 71 */     btnDownload.addActionListener(new ActionListener() {
/*    */       public void actionPerformed(ActionEvent arg0) {
/* 73 */         Download.main(null);
/*    */       }
/* 75 */     });
/* 76 */     toolBar.add(btnDownload);
/* 77 */     toolBar.add(btnNewButton);
/*    */     
/* 79 */     JLabel label = new JLabel("Welcome to N005 java software !");
/* 80 */     label.setHorizontalAlignment(0);
/* 81 */     label.setFont(new Font("Tahoma", 0, 16));
/* 82 */     this.frmN.getContentPane().add(label, "Center");
/*    */   }
/*    */ }


/* Location:              C:\Users\N005\Desktop\N005.jar!\fr\n005\gui\test.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */