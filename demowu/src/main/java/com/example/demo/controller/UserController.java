package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dto.UserSearchRequest;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

import java.util.List;

/**
 * ���[�U�[��� Controller
 */
@Controller
public class UserController {
  /**
   * ���[�U�[��� Service
   */
  @Autowired
  UserService userService;

  /**
   * ���[�U�[��񌟍���ʂ�\��
   * @param model Model
   * @return ���[�U�[���ꗗ���
   */
  @GetMapping(value = "/user/search")
  public String displaySearch(Model model) {
    return "user/search";
  }

  /**
   * ���[�U�[��񌟍�
   * @param userSearchRequest ���N�G�X�g�f�[�^
   * @param model Model
   * @return ���[�U�[���ꗗ���
   */
  @RequestMapping(value = "/user/id_search", method = RequestMethod.GET)
  public String search(@ModelAttribute UserSearchRequest userSearchRequest, Model model) {
    User user = userService.search(userSearchRequest);
    model.addAttribute("userinfo", user);
    return "user/search";
  }
  @RequestMapping(value = "/user/all_search", method = RequestMethod.GET)
  public String searchAll(Model model){
    List<User> users = userService.searchAll();
    model.addAttribute("usersinfo", users);
    model.addAttribute("firstPageFlag", true);
    return "user/search";
  }

}