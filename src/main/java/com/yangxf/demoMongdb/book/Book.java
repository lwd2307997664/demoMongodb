/**
 * FileName: Book
 * Author:   linwd
 * Date:     2021/3/15 21:49
 * Description: 书籍对象
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.yangxf.demoMongdb.book;

import org.springframework.data.annotation.Id;

/**
 * 〈一句话功能简述〉<br> 
 * 〈书籍对象〉
 *
 * @author linwd
 * @create 2021/3/15
 * @since 1.0.0
 */
public class Book {

    @Id
    private String id;

    private String name;

    private String author;

    public Book() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
