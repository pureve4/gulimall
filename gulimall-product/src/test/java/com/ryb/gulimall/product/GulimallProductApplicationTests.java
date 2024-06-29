package com.ryb.gulimall.product;


import com.ryb.gulimall.product.entity.BrandEntity;
import com.ryb.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileNotFoundException;


@SpringBootTest
class GulimallProductApplicationTests {


    @Autowired
    BrandService brandService;

//    @Autowired
//    OSSClient ossClient;

    @Test
    void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setName("华为");
//        brandService.save(brandEntity);
//        System.out.println("1111");

        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(1L);
        brandEntity.setDescript("华为");
        brandService.updateById(brandEntity);
        System.out.println(1111);
    }

    @Test
    public void testUpload() throws FileNotFoundException {


    }




}
