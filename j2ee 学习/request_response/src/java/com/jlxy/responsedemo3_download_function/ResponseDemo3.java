/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jlxy.responsedemo3_download_function;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import static java.lang.System.in;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.catalina.connector.OutputBuffer;

/**
 *
 * @author 16221
 */
public class ResponseDemo3 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 中文名称  下载不了
        String path_chinese = this.getServletContext().getRealPath("/download/日本.jpg");
        String path_english = this.getServletContext().getRealPath("/download/1.jpg");

//        // 如果下载 的文件名是  中文，则文件名需要经过  URL 编码
//        String filename = path_chinese.substring(path_chinese.lastIndexOf("\\") + 1);
       // download(path_chinese, response);
        

       download_chinese(path_chinese, response);
       // download_english(path_english, response);

    }

    public void download_chinese(String path, HttpServletResponse response){
        try {
            String filename = path.substring(path.lastIndexOf("\\") + 1);
            // 如果下载 的文件名是  中文，则文件名需要经过  URL 编码
            response.setHeader("content-disposition", "attachment;filename=" + URLEncoder.encode(filename, "UTF-8"));
            
            download(path, response);
            
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(ResponseDemo3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void download_english(String path, HttpServletResponse response){
         String filename = path.substring(path.lastIndexOf("\\") + 1);
        
          response.setHeader("content-disposition", "attachment;filename=" + filename);
        download(path, response);
    }
    public void download(String path, HttpServletResponse response) {
        try {

            InputStream in = null;
            OutputStream out = null;

            
                in = new FileInputStream(path);

                int len = 0;
                byte buffer[] = new byte[1024];

                out = response.getOutputStream();

                while ((len = in.read(buffer)) > 0) {
                    out.write(buffer, 0, len);

                }
            } catch (IOException ex) {
                Logger.getLogger(ResponseDemo3.class.getName()).log(Level.SEVERE, null, ex);
            }
         finally {
            if (in != null) {
                try {
                    in.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
