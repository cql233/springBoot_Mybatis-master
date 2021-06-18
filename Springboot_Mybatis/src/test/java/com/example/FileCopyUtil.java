package com.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 〈〉
 *
 * @author cql
 * @create 2021/5/18
 * @since 1.0.0
 */
public class FileCopyUtil {
    public static void main(String[] args) {
        String path="F:\\TestCsvDirectory\\file\\merchant_JCB20210222_202105181";
        String xml=".xml";
        for(int i=10002;i<15001;i++){
            System.out.println(i-10002);
            String lastPath=path+i+xml;
            copyFile("F:\\TestCsvDirectory\\file\\merchant_JCB20210222_20210518110001.xml",lastPath);
        }
    }

    public static void copyLogFile(String srcPath, String destDir, String pdate, String peirodname) {
        File file = new File(srcPath);
        if (!file.exists()) {
            System.out.println("源目录不存在!");
            return;
        }
        if (file.isFile()) {
            copyFile(srcPath, destDir);
        } else if (file.isDirectory()) {
            copyDirectory(srcPath, destDir, pdate, peirodname);
        }
        //备份之后，删除源文件
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f : files) {
                f.delete();
            }
            file.delete();
        }}
        private static void copyFile(String srcPath, String destDir) {
            // 获取待复制文件的文件名
            String fileName = srcPath
                    .substring(srcPath.lastIndexOf(File.separator));
//            String destPath = destDir + fileName;
            File destFile = new File(destDir);
            if (destFile.exists() && destFile.isFile()) { // 该路径下已经有一个同名文件
                return;
            }
//            File destFileDir = new File(destDir);
//            destFileDir.mkdirs();
            try {
                BufferedWriter bw = null;
                BufferedReader br = null;
                br = new BufferedReader(new FileReader(srcPath));
                bw = new BufferedWriter(new FileWriter(destFile));
                String dataline;
                while ((dataline = br.readLine()) != null) {
                    bw.write(dataline);
                    bw.newLine();
                    bw.flush();
                }
                br.close();
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }}
    private static String getDirName(String dir) {
        if (dir.endsWith(File.separator)) { // 如果文件夹路径以"//"结尾，则先去除末尾的"//"
            dir = dir.substring(0, dir.lastIndexOf(File.separator));
        }
        return dir.substring(dir.lastIndexOf(File.separator) + 1);
    }
    private static void copyDirectory(String srcPath, String destDir, String pdate, String peirodname) {
        File srcFile = new File(srcPath);
        // 获得待复制的文件夹的名字，比如待复制的文件夹为"D://dir"则获取的名字为"dir"
        String dirName = getDirName(srcPath);
        // 目标文件夹的完整路径  D://dir20190509_1019
        String destPath = destDir + File.separator + dirName + "_" + pdate + "_" + peirodname.replace(":", "");
        System.out.println("目标文件夹的完整路径为：" + destPath);
        File destDirFile = new File(destPath);
        if (!destDirFile.exists()) {
            destDirFile.mkdirs();
        }
        File[] fileList = srcFile.listFiles();
        if (fileList.length != 0) {
            for (File temp : fileList) {
                if (temp.isFile()) {
                    copyFile(temp.getAbsolutePath(), destPath);
                } else if (temp.isDirectory()) {
                    copyDirectory(temp.getAbsolutePath(), destPath, pdate, peirodname);
                }
            }
        }
    }

}