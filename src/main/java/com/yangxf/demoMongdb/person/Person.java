/**
 * FileName: Person
 * Author:   linwd
 * Date:     2021/3/13 20:28
 * Description: 个人基本信息实体类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.yangxf.demoMongdb.person;

import org.springframework.data.annotation.Id;

/**
 * 〈一句话功能简述〉<br> 
 * 〈个人基本信息实体类〉
 *
 * @author linwd
 * @create 2021/3/13
 * @since 1.0.0
 */
public class Person {
    @Id
    private String id;

    private String name;

    private String idNumber;

    private Integer age;

    public Person() {
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

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", age=" + age +
                '}';
    }
}
