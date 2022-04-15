package com.mom.shop.controller;


import com.mom.shop.common.req.PageReq;
import com.mom.shop.common.resp.Result;
import com.mom.shop.mbg.entity.Category;
import com.mom.shop.service.AttributeService;
import com.mom.shop.service.CategoryService;
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
@RequestMapping("/category")
public class CategoryController {

    @Resource
    private CategoryService categoryService;
    @Resource
    private AttributeService attributeService;

    @GetMapping(value = "list")
    @ResponseBody
    public Result<List<Category>> list(){
        return Result.success(categoryService.list());
    }

    @PostMapping("listByPage")
    @ResponseBody
    public Result listByPage(@RequestBody PageReq pageReq){
        return Result.success(categoryService.listByPage(pageReq));
    }

    @GetMapping("delete/{id}")
    @ResponseBody
    public Result delete(@PathVariable Integer id){
        return Result.success(categoryService.removeById(id));
    }

    @GetMapping("getById/{id}")
    @ResponseBody
    public Result getById(@PathVariable Integer id){
        return Result.success(categoryService.getById(id));
    }

    @PostMapping("save")
    @ResponseBody
    public Result save(@RequestBody Category category){
        return Result.success(categoryService.save(category));
    }

    @PostMapping("update")
    @ResponseBody
    public Result update(@RequestBody Category category){
        return Result.success(categoryService.updateById(category));
    }

}

