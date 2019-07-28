package com.remotes.design;

import org.junit.Test;

import java.io.File;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

/**
 * @author yuan.chen
 * @email chen.yuan135@chinaredstar.com
 * @Date 2019-07-20
 */
public class IoTest {


    @Test
    public void fileTest(){
        File file = new File("/Users/chenyuan/Documents/project/myself/java-design-patterns/src/test/java/com/remotes/design/ficcle");
        System.out.println(file.exists());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.mkdirs());
        System.out.println(file.exists());
    }

    @Test
    public void t2(){
        Long milliSecond = LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli();
        // 次日早上8点
        Long milliSecond2 = LocalDate.now().plusDays(1).atStartOfDay().toInstant(ZoneOffset.of("+8")).toEpochMilli()+28800000;

        System.out.println(milliSecond);
        System.out.println(milliSecond2);
        System.out.println(milliSecond2-milliSecond);

    }

}
