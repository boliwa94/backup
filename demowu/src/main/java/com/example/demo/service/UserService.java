package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dto.UserSearchRequest;
import com.example.demo.entity.User;
import com.example.demo.repository.UserMapper;

import java.util.List;

/**
 * ���[�U�[��� Service
 */
@Service
public class UserService {
    /**
     * ���[�U�[��� Mapper
     */
    @Autowired
    private UserMapper userMapper;

    /**
     * ���[�U�[��񌟍�
     * �@�@�@* @param userSearchRequest ���N�G�X�g�f�[�^
     *
     * @return ��������
     */
    public User search(UserSearchRequest userSearchRequest) {
        return userMapper.search(userSearchRequest);
    }


    public List<User> searchAll() {
        return userMapper.searchAll();
    }
}

