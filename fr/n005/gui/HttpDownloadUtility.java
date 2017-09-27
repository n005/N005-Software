/*    */ package fr.n005.gui;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.FileOutputStream;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.PrintStream;
/*    */ import java.net.HttpURLConnection;
/*    */ import java.net.URL;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class HttpDownloadUtility
/*    */ {
/*    */   private static final int BUFFER_SIZE = 4096;
/*    */   
/*    */   public static void downloadFile(String fileURL, String saveDir)
/*    */     throws IOException
/*    */   {
/* 26 */     URL url = new URL(fileURL);
/* 27 */     HttpURLConnection httpConn = (HttpURLConnection)url.openConnection();
/* 28 */     int responseCode = httpConn.getResponseCode();
/*    */     
/*    */ 
/* 31 */     if (responseCode == 200) {
/* 32 */       String fileName = "";
/* 33 */       String disposition = httpConn.getHeaderField("Content-Disposition");
/* 34 */       String contentType = httpConn.getContentType();
/* 35 */       int contentLength = httpConn.getContentLength();
/*    */       
/* 37 */       if (disposition != null)
/*    */       {
/* 39 */         int index = disposition.indexOf("filename=");
/* 40 */         if (index > 0) {
/* 41 */           fileName = disposition.substring(index + 10, 
/* 42 */             disposition.length() - 1);
/*    */         }
/*    */       }
/*    */       else {
/* 46 */         fileName = fileURL.substring(fileURL.lastIndexOf("/") + 1, 
/* 47 */           fileURL.length());
/*    */       }
/*    */       
/* 50 */       System.out.println("Content-Type = " + contentType);
/* 51 */       System.out.println("Content-Disposition = " + disposition);
/* 52 */       System.out.println("Content-Length = " + contentLength);
/* 53 */       System.out.println("fileName = " + fileName);
/*    */       
/*    */ 
/* 56 */       InputStream inputStream = httpConn.getInputStream();
/* 57 */       String saveFilePath = saveDir + File.separator + fileName;
/*    */       
/*    */ 
/* 60 */       FileOutputStream outputStream = new FileOutputStream(saveFilePath);
/*    */       
/* 62 */       int bytesRead = -1;
/* 63 */       byte[] buffer = new byte['က'];
/* 64 */       while ((bytesRead = inputStream.read(buffer)) != -1) {
/* 65 */         outputStream.write(buffer, 0, bytesRead);
/*    */       }
/*    */       
/* 68 */       outputStream.close();
/* 69 */       inputStream.close();
/*    */       
/* 71 */       System.out.println("File downloaded");
/*    */     } else {
/* 73 */       System.out.println("No file to download. Server replied HTTP code: " + responseCode);
/*    */     }
/* 75 */     httpConn.disconnect();
/*    */   }
/*    */ }


/* Location:              C:\Users\N005\Desktop\N005.jar!\fr\n005\gui\HttpDownloadUtility.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */