package cn.murphy.controller;

import cn.murphy.entity.ProductInfo;
import cn.murphy.mapper.ProductInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by smlz on 2019/11/17.
 */
@RestController
public class ProductInfoController {


    @Autowired
    private ProductInfoMapper productInfoMapper;

    @RequestMapping("/selectProductInfoById/{productNo}")
    public Object selectProductInfoById(@PathVariable("productNo") String productNo) {

        ProductInfo productInfo = productInfoMapper.selectProductInfoById(productNo);
        return productInfo;
    }
}
