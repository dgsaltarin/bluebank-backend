package com.dgsaltarin.backend.persistence;

import com.dgsaltarin.backend.domain.Users;
import com.dgsaltarin.backend.persistence.crud.UsersCrudRepository;
import com.dgsaltarin.backend.persistence.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UsersRepository {

    private UsersCrudRepository usersCrudRepository;
    private UsersMapper usersMapper;

    @Autowired
    public UsersRepository(UsersCrudRepository usersCrudRepository, UsersMapper usersMapper) {
        this.usersMapper = usersMapper;
        this.usersCrudRepository = usersCrudRepository;
    }

    public Users createUser(Users user) {
        return usersMapper.toUser(usersCrudRepository.save(usersMapper.toUserEntity(user)));
    }
}
