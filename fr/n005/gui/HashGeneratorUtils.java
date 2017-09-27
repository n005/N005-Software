/*    */ package fr.n005.gui;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.UnsupportedEncodingException;
/*    */ import java.security.MessageDigest;
/*    */ import java.security.NoSuchAlgorithmException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class HashGeneratorUtils
/*    */ {
/*    */   public static String generateMD5(String message)
/*    */     throws HashGenerationException
/*    */   {
/* 21 */     return hashString(message, "MD5");
/*    */   }
/*    */   
/*    */   public static String generateSHA1(String message) throws HashGenerationException {
/* 25 */     return hashString(message, "SHA-1");
/*    */   }
/*    */   
/*    */   public static String generateSHA256(String message) throws HashGenerationException {
/* 29 */     return hashString(message, "SHA-256");
/*    */   }
/*    */   
/*    */   public static String generateMD5(File file) throws HashGenerationException {
/* 33 */     return hashFile(file, "MD5");
/*    */   }
/*    */   
/*    */   public static String generateSHA1(File file) throws HashGenerationException {
/* 37 */     return hashFile(file, "SHA-1");
/*    */   }
/*    */   
/*    */   public static String generateSHA256(File file) throws HashGenerationException {
/* 41 */     return hashFile(file, "SHA-256");
/*    */   }
/*    */   
/*    */   private static String hashString(String message, String algorithm) throws HashGenerationException
/*    */   {
/*    */     try
/*    */     {
/* 48 */       MessageDigest digest = MessageDigest.getInstance(algorithm);
/* 49 */       byte[] hashedBytes = digest.digest(message.getBytes("UTF-8"));
/*    */       
/* 51 */       return convertByteArrayToHexString(hashedBytes);
/*    */     } catch (NoSuchAlgorithmException|UnsupportedEncodingException ex) {
/* 53 */       throw new HashGenerationException(
/* 54 */         "Could not generate hash from String", ex);
/*    */     }
/*    */   }
/*    */   
/*    */   /* Error */
/*    */   private static String hashFile(File file, String algorithm)
/*    */     throws HashGenerationException
/*    */   {
/*    */     // Byte code:
/*    */     //   0: aconst_null
/*    */     //   1: astore_2
/*    */     //   2: aconst_null
/*    */     //   3: astore_3
/*    */     //   4: new 80	java/io/FileInputStream
/*    */     //   7: dup
/*    */     //   8: aload_0
/*    */     //   9: invokespecial 82	java/io/FileInputStream:<init>	(Ljava/io/File;)V
/*    */     //   12: astore 4
/*    */     //   14: aload_1
/*    */     //   15: invokestatic 40	java/security/MessageDigest:getInstance	(Ljava/lang/String;)Ljava/security/MessageDigest;
/*    */     //   18: astore 5
/*    */     //   20: sipush 1024
/*    */     //   23: newarray <illegal type>
/*    */     //   25: astore 6
/*    */     //   27: iconst_m1
/*    */     //   28: istore 7
/*    */     //   30: goto +13 -> 43
/*    */     //   33: aload 5
/*    */     //   35: aload 6
/*    */     //   37: iconst_0
/*    */     //   38: iload 7
/*    */     //   40: invokevirtual 85	java/security/MessageDigest:update	([BII)V
/*    */     //   43: aload 4
/*    */     //   45: aload 6
/*    */     //   47: invokevirtual 89	java/io/FileInputStream:read	([B)I
/*    */     //   50: dup
/*    */     //   51: istore 7
/*    */     //   53: iconst_m1
/*    */     //   54: if_icmpne -21 -> 33
/*    */     //   57: aload 5
/*    */     //   59: invokevirtual 93	java/security/MessageDigest:digest	()[B
/*    */     //   62: astore 8
/*    */     //   64: aload 8
/*    */     //   66: invokestatic 58	fr/n005/gui/HashGeneratorUtils:convertByteArrayToHexString	([B)Ljava/lang/String;
/*    */     //   69: aload 4
/*    */     //   71: ifnull +8 -> 79
/*    */     //   74: aload 4
/*    */     //   76: invokevirtual 96	java/io/FileInputStream:close	()V
/*    */     //   79: areturn
/*    */     //   80: astore_2
/*    */     //   81: aload 4
/*    */     //   83: ifnull +8 -> 91
/*    */     //   86: aload 4
/*    */     //   88: invokevirtual 96	java/io/FileInputStream:close	()V
/*    */     //   91: aload_2
/*    */     //   92: athrow
/*    */     //   93: astore_3
/*    */     //   94: aload_2
/*    */     //   95: ifnonnull +8 -> 103
/*    */     //   98: aload_3
/*    */     //   99: astore_2
/*    */     //   100: goto +13 -> 113
/*    */     //   103: aload_2
/*    */     //   104: aload_3
/*    */     //   105: if_acmpeq +8 -> 113
/*    */     //   108: aload_2
/*    */     //   109: aload_3
/*    */     //   110: invokevirtual 99	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
/*    */     //   113: aload_2
/*    */     //   114: athrow
/*    */     //   115: astore_2
/*    */     //   116: new 17	fr/n005/gui/HashGenerationException
/*    */     //   119: dup
/*    */     //   120: ldc 105
/*    */     //   122: aload_2
/*    */     //   123: invokespecial 64	fr/n005/gui/HashGenerationException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   126: athrow
/*    */     // Line number table:
/*    */     //   Java source line #60	-> byte code offset #0
/*    */     //   Java source line #61	-> byte code offset #14
/*    */     //   Java source line #63	-> byte code offset #20
/*    */     //   Java source line #64	-> byte code offset #27
/*    */     //   Java source line #66	-> byte code offset #30
/*    */     //   Java source line #67	-> byte code offset #33
/*    */     //   Java source line #66	-> byte code offset #43
/*    */     //   Java source line #70	-> byte code offset #57
/*    */     //   Java source line #72	-> byte code offset #64
/*    */     //   Java source line #73	-> byte code offset #69
/*    */     //   Java source line #72	-> byte code offset #79
/*    */     //   Java source line #73	-> byte code offset #81
/*    */     //   Java source line #74	-> byte code offset #116
/*    */     //   Java source line #75	-> byte code offset #120
/*    */     //   Java source line #74	-> byte code offset #123
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	127	0	file	File
/*    */     //   0	127	1	algorithm	String
/*    */     //   1	1	2	localObject1	Object
/*    */     //   80	15	2	localObject2	Object
/*    */     //   99	15	2	localObject3	Object
/*    */     //   115	8	2	ex	Exception
/*    */     //   3	1	3	localObject4	Object
/*    */     //   93	17	3	localThrowable	Throwable
/*    */     //   12	75	4	inputStream	java.io.FileInputStream
/*    */     //   18	40	5	digest	MessageDigest
/*    */     //   25	21	6	bytesBuffer	byte[]
/*    */     //   28	24	7	bytesRead	int
/*    */     //   62	3	8	hashedBytes	byte[]
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   14	69	80	finally
/*    */     //   79	80	80	finally
/*    */     //   4	93	93	finally
/*    */     //   0	79	115	java/security/NoSuchAlgorithmException
/*    */     //   0	79	115	java/io/IOException
/*    */     //   80	115	115	java/security/NoSuchAlgorithmException
/*    */     //   80	115	115	java/io/IOException
/*    */   }
/*    */   
/*    */   private static String convertByteArrayToHexString(byte[] arrayBytes)
/*    */   {
/* 80 */     StringBuffer stringBuffer = new StringBuffer();
/* 81 */     for (int i = 0; i < arrayBytes.length; i++) {
/* 82 */       stringBuffer.append(Integer.toString((arrayBytes[i] & 0xFF) + 256, 16)
/* 83 */         .substring(1));
/*    */     }
/* 85 */     return stringBuffer.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\N005\Desktop\N005.jar!\fr\n005\gui\HashGeneratorUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */