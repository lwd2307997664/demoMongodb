/**
 * FileName: PersonRepository
 * Author:   linwd
 * Date:     2021/3/13 20:31
 * Description: 个人仓储
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.yangxf.demoMongdb.person;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈个人仓储〉
 *
 * @author linwd
 * @create 2021/3/13
 * @since 1.0.0
 */
@Repository
public interface PersonRepository extends MongoRepository<Person,String> {
    List <Person> findByNameEquals(String name);
}
