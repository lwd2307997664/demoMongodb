/**
 * FileName: BookController
 * Author:   linwd
 * Date:     2021/3/15 21:51
 * Description: 通过MongoTemplate注入完成对mongodb的操作
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.yangxf.demoMongdb.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * 〈一句话功能简述〉<br> 
 * 〈通过MongoTemplate注入完成对mongodb的操作〉
 *
 * @author linwd
 * @create 2021/3/15
 * @since 1.0.0
 */
@RestController
public class BookController {


    @Autowired
    private MongoTemplate mongoTemplate;

    @GetMapping("/another")
    public String another(){
        List <Book> list=new ArrayList <>();
        Book book=new Book();
        book.setName("三国");
        book.setAuthor("张三");
        list.add(book);
        Book book1=new Book();
        book1.setName("西游记");
        book1.setAuthor("张三");
        list.add(book1);
        mongoTemplate.insertAll(list);
//        查所有
        List<Book> bookListAll = mongoTemplate.findAll(Book.class);
//        根据条件分页--从第10条开始，limit限制查询10条数据
        Query query = Query.query(Criteria.where("name").is("三国"))
                .skip(10)
                .limit(1);
        List<Book> bookList = mongoTemplate.find(query, Book.class);
        return bookList.toString();
    }

}
