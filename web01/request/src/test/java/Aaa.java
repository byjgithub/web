/**
 * @Package PACKAGE_NAME
 * @author 小白
 * @date 2020/3/20 0020 22:42
 * @version V1.0
 * @Copyright © 2018-2019 中金慈云健康科技（北京）有限公司
 */

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.InputStream;

/**
 * 〈 演示 ClassLoader 类加载器 和 Class 获取资源路径 〉
 *
 * @author Administrator
 * @create 2020/3/20 0020
 * @since 1.0.0
 */
public class Aaa extends HttpServlet {
    /**
     * 使用类加载器来加载类路径下的资源
     * @throws IOException
     */

    @Test
    public void testClassLoader() throws IOException {
        // 1. 获得类加载器 ClassLoader
        ClassLoader loader = Aaa.class.getClassLoader();
        // 2. 将项目中资源读取到流中（相对于classes）
        InputStream ras = loader.getResourceAsStream("wenjian/classLoader.txt");
        System.out.println(IOUtils.toString(ras));
    }

    /**
     * 使用 Class 来加载类路径下的资源
     * @throws IOException
     */
    @Test
    public void testClass() throws IOException {
        // 1. 获得反射对象
        Class c = Aaa.class;
        // 2. 将项目中资源读取到流中（以/ 开头，相对于classes）
        InputStream ras = c.getResourceAsStream("/wenjian/classLoader.txt");
        System.out.println(IOUtils.toString(ras));
    }
    /**
     * 使用 Class 来加载类路径下的资源
     * @throws IOException
     */
    @Test
    public void testClass2() throws IOException {
        // 1. 获得反射对象
        Class c = Aaa.class;
        // 2. 将项目中资源读取到流中（不以 / 开头，相对于当前.class 文件）
        InputStream ras = c.getResourceAsStream("wenjian/classLoader.txt");
        System.out.println(IOUtils.toString(ras));
    }
}
