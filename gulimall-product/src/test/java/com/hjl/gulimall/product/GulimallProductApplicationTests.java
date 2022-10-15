package com.hjl.gulimall.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hjl.gulimall.product.entity.BrandEntity;
import com.hjl.gulimall.product.service.BrandService;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        //        brandEntity.setDescript("AAAAAAAAAA");
        //        brandEntity.setName("苹果");
        //        brandService.save(brandEntity);

        brandEntity.setBrandId(1L);
        brandEntity.setDescript("BBBBBBBBBBBB");
        brandService.updateById(brandEntity);

    }

}
