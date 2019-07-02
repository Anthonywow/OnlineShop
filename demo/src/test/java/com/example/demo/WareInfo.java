package com.example.demo;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

import com.example.demo.dao.WareinfoMapper;
import com.example.demo.entity.User;
import com.example.demo.entity.Wareinfo;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.example.demo.dao")
public class WareInfo {
    @Autowired
    WareinfoMapper wareinfoMapper;
    @Test
    public void test() throws  IOException {
        String url = "https://search.jd.com/Search?keyword=百草味&enc=utf-8";//第二页商品
        //String url1 = "https://item.jd.com/100005502446.html";
        //网址分析
        /*keyword:关键词（京东搜索框输入的信息）
         * enc：编码方式（可改动:默认UTF-8）
         * psort=3 //搜索方式  默认按综合查询 不给psort值
         * page=分业（不考虑动态加载时按照基数分业，每一页30条，这里就不演示动态加载）
         * 注意：受京东商品个性化影响，准确率无法保障
         * */
        Document doc = Jsoup.connect(url).maxBodySize(0).get();
        Wareinfo wareInfo = new Wareinfo();
//        User user = new User();
//        user.setUsername(username);
//        user.setPassword(password);
//        userMapper.insert(user);
        //doc获取整个页面的所有数据
        Elements ulList = doc.select("ul[class='gl-warp clearfix']");
        Elements liList = ulList.select("li[class='gl-item']");
        // Elements items = doc.select("div[id='choose-attr-2']").select("div[class='item']");
        //循环liList的数据
        for (Element list : liList) {
            System.out.println("价格：" + list.select("div[class=p-price]").select("i").text());
            wareInfo.setPrice(list.select("div[class=p-price]").select("i").text());
            System.out.println("简介:"+list.select("div[class='p-name p-name-type-2']").select("em").text());//打印商品标题到控制台
            wareInfo.setTitle(list.select("div[class='p-name p-name-type-2']").select("em").text());
            String reUrl = list.select("div[class='p-img']").select("a").attr("abs:href");
            Document reDoc = Jsoup.connect(reUrl).maxBodySize(0).get();
            Elements items = reDoc.select("div[id='choose-attr-2']").select("div[class='item']");

            System.out.println("厂商：" + reDoc.select("div[class='head']").select("a").text().split(" ")[0]);

            int i = 1;
            for(Element item : items) {
                System.out.println("规格" + (i++) + ":" + item.attr("abs:data-value").split("/")[3]);
            }
            Elements name = reDoc.select("div[class='item ellipsis']");
            System.out.println("名字：" + name.text());
            Elements imgs = reDoc.select("ul[class='lh']").select("img");
            int j = 0;
            for(Element img : imgs) {
                if(j==0){
                    String imgUrl = img.attr("abs:src").replace("n5", "n0");
                    String fileName ="../../static/img/"+imgUrl.substring(imgUrl.lastIndexOf('/') + 1, imgUrl.length());
                    downImages("D:\\img\\" , img.attr("abs:src").replace("n5", "n1"));
                    wareInfo.setPicSrc(fileName);
                    wareinfoMapper.insert(wareInfo);
                }
                System.out.println("图片" + (j++) + ":" + img.attr("abs:src").replace("n5", "n1"));
            }
        }
    }


    public static void downImages(String filePath, String imgUrl) {
        File dir = new File(filePath);
        if(!dir.exists()) {
            dir.mkdirs();
        }
        // 截取图片文件名
        String fileName = imgUrl.substring(imgUrl.lastIndexOf('/') + 1, imgUrl.length());

        try {
            //文件名里面可能有中文或者空格，所以这里需要处理。但空格又会被URLEncoder转义为加号
            String urlTail = URLEncoder.encode(fileName, "UTF-8");
            //因此要将加号转化为UTF-8的格式%20
            imgUrl = imgUrl.substring(0, imgUrl.lastIndexOf('/') + 1) + urlTail.replaceAll("\\+", "\\%20");
        }catch(UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        //写出的路径
        File file = new File(filePath + File.separator + fileName);

        try {
            //获取图片URL
            URL url = new URL(imgUrl);
            //获得连接
            URLConnection connection = url.openConnection();
            //设置10秒的响应时间
            connection.setConnectTimeout(10 * 1000);
            //获得输入流
            InputStream in = connection.getInputStream();
            //获得输出流
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file));
            //构建和缓冲区
            byte[] buf = new byte[1024];
            int size;
            //写入到文件
            while(-1 != (size = in.read(buf))) {
                out.write(buf, 0, size);
            }
            out.close();
            in.close();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

}
