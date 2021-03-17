/**
 * FileName: PersonMongodbController
 * Author:   linwd
 * Date:     2021/3/13 20:35
 * Description: 简单的存储mongodb数据控制器
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.yangxf.demoMongdb.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈简单的存储mongodb数据控制器〉
 *
 * @author linwd
 * @create 2021/3/13
 * @since 1.0.0
 */
@RestController
public class PersonMongodbController {

    @Autowired
    private  PersonRepository personRepository;

    @GetMapping("/mongodbDemo")
    public void mongodbDemo(){
        Person person=new Person();
        person.setId(String.valueOf(System.currentTimeMillis()));
        person.setName("测试");
        person.setIdNumber("210381197701031220");
        person.setAge(18);

        personRepository.insert(person);
        List<Person> result=personRepository.findByNameEquals("测试");
        System.out.println(result);



    }
}
