package com.remotes.design;

import org.junit.Test;

import java.io.File;

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


    public class StaticDemo1 {


    }
}
