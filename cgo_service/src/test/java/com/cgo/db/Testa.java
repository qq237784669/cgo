package com.cgo.db;


import com.cgo.db.entity.Aa;
import com.cgo.db.mapper.AaMapper;
import com.cgo.service.DbStart;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DbStart.class)
public class Testa {


    @Autowired
    AaMapper aaMapper;


    @Test
    public void aa(){
        List<Aa> aas = aaMapper.selectList(null);
        System.out.println(aas);
    }

}
