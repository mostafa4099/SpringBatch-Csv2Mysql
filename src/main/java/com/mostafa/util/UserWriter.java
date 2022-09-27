package com.mostafa.util;

import com.mostafa.entity.User;
import com.mostafa.repository.UserRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.data.RepositoryItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File com.mostafa.util.UserWriter.java: SpringBatch-Csv2Mysql
 * @CreationDate 9/27/2022 4:08 PM
 */
@Component
public class UserWriter implements ItemWriter<User> {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void write(List<? extends User> list) throws Exception {
        userRepository.saveAll(list);
    }
}
