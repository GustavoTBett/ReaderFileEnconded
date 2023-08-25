package com.gustavo.readerenconding;

import java.io.IOException;

/**
 *
 * @author gustavo
 */
public class ReaderEnconding {
    
    private static String fileUrl;

    public static void main(String[] args) throws IOException {
        fileUrl = "C:\\Users\\gustavo\\Documents\\NeoCode_Estabelecimentos\\dados\\qualificacoes\\F.K03200$Z.D30812.QUALSCSV";
        
        PrintContent.printContent(GetTheEncode.getTheEncode(fileUrl), fileUrl);
    }
}
