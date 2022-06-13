package com.example.demo.entity;

import java.util.Date;
import lombok.Data;
/**
 * ���[�U�[��� Entity
 */
@Data
public class User {
    /**
     * ID
     */
    private Long id;
    /**
     * ���O
     */
    private String name;
    /**
     * �Z��
     */
    private String address;
    /**
     * �d�b�ԍ�
     */
    private String phone;
    /**
     * �X�V����
     */
    private Date updateDate;
    /**
     * �o�^����
     */
    private Date createDate;
    /**
     * �폜����
     */
    private Date deleteDate;
}
