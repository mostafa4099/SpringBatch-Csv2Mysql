package com.mostafa.util;

import com.mostafa.entity.User;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class UserProcessor implements ItemProcessor<User, User> {

    /**
     * Process data with specified condition (if any)
     * @param user
     * @return process user
     * @throws Exception
     */
    @Override
    public User process(User user) throws Exception {
//        if(user.getCountry().equals("United States")) {
//            return user;
//        }else{
//            return null;
//        }
        return user;
    }
}
