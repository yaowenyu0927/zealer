package com.zealer.controller;

import com.zealer.entity.Picture;
import com.zealer.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PictureController {
    @Autowired
    private PictureService pictureService;

    @RequestMapping("/all")
    @ResponseBody
    @CrossOrigin(origins = "*")
    public List<Picture> picture(){
        return pictureService.getAllPicture();
    }
}
