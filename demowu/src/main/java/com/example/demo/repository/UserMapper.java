package com.example.demo.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.UserSearchRequest;
import com.example.demo.entity.User;

import java.util.List;

/**
 * ���[�U�[��� Mapper
 */
@Mapper
public interface UserMapper {
    /**
     * ���[�U�[��񌟍�
     * @param user �����p���N�G�X�g�f�[�^
     * @return ���[�U�[���
     */
    User search(UserSearchRequest user);

    List<User> searchAll();
}