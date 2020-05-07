package com.smgoo.querycmd.controller;

import com.fasterxml.jackson.core.sym.Name;
import com.smgoo.querycmd.mapper.OracleTestMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    private OracleTestMapper mapper;

    @RequestMapping(value = "/")
    public String main(@RequestParam(required = false, defaultValue = "") String uid, Model model) throws Exception {
        String name = "";

        if (uid.equals("")) {
            name = "아이디 없음";
        } else {
            name = mapper.getUname(uid); // db 조회결과를 view에 보낸다.
        }

        if (name == null) {
            name = "해당하는 아이디가 없습니다.";
        }

        model.addAttribute("name", name);

        return "index";
    }
}
