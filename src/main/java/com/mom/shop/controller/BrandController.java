package com.mom.shop.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.mom.shop.common.req.PageReq;
import com.mom.shop.common.resp.Result;
import com.mom.shop.mbg.entity.Brand;
import com.mom.shop.service.BrandService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Clozer
 * @since 2022-04-15 11:08:40
 */
@RestController
@RequestMapping("/brand")
public class BrandController {

    @Resource
    private BrandService brandService;

    @GetMapping(value = "delete/{id}")
    @ResponseBody
    public Result delete(@PathVariable Integer id){
        return Result.success(brandService.removeById(id));
    }


    @PostMapping(value = "save")
    @ResponseBody
    public Result save(@RequestBody Brand brand){
        return Result.success(brandService.save(brand));
    }

    @PostMapping(value = "update")
    @ResponseBody
    public Result update(@RequestBody Brand brand){
        return Result.success(brandService.updateById(brand));
    }

    @PostMapping(value = "listByPage")
    @ResponseBody
    public Result<IPage<Brand>> listByPage(@RequestBody PageReq pageReq){
        return Result.success(brandService.listByPage(pageReq));
    }

    @GetMapping(value = "list")
    @ResponseBody
    public Result<List<Brand>> list(){
        return Result.success(brandService.list());
    }

}

