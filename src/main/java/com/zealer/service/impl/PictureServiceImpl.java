package com.zealer.service.impl;

import com.zealer.entity.Picture;
import com.zealer.entity.PictureExample;
import com.zealer.mapping.PictureMapper;
import com.zealer.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PictureServiceImpl implements PictureService {

    @Autowired
    private PictureMapper pictureMapper;
    @Override
    public List<Picture> getAllPicture() {
        PictureExample pictureExample = new PictureExample();
        return pictureMapper.selectByExample(pictureExample);
    }
}
