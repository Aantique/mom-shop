package com.mom.shop.controller;


import com.mom.shop.common.resp.Result;
import com.mom.shop.common.utils.StringUtil;
import com.mom.shop.mbg.entity.Attribute;
import com.mom.shop.service.AttributeService;
import com.mom.shop.vo.AttributeVo;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Clozer
 * @since 2022-04-15 11:08:40
 */
@RestController
@RequestMapping("/attribute")
public class AttributeController {

    @Resource
    private AttributeService attributeService;

    @PostMapping("/saveList")
    @ResponseBody
    public Result saveAttrs(@RequestBody List<Attribute> attributes) {
        return Result.success(attributeService.saveBatch(attributes));
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public Result delete(@PathVariable Integer id) {
        return Result.success(attributeService.removeById(id));
    }

    @GetMapping("/list")
    @ResponseBody
    public Result<List<Attribute>> list() {
        return Result.success(attributeService.list());
    }

    @PostMapping("/listById")
    @ResponseBody
    public Result<List<AttributeVo>> listById(@RequestParam String ids) {
        List<Integer> idList = StringUtil.removeSpaceAndSplit(ids)
                .stream().map(Integer::parseInt).collect(Collectors.toList());
        List<AttributeVo> attributeVos = new ArrayList<>();
        attributeService.listByIds(idList).forEach(attr -> {
            attributeVos.add(AttributeVo.builder()
                    .id(attr.getId()).name(attr.getName())
                    .inputList(StringUtil.removeSpaceAndSplit(attr.getInputList()))
                    .build());

        });
        return Result.success(attributeVos);
    }


}

