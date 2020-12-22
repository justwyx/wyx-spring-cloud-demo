package com.wyx.consumer.service;

import com.wyx.consumer.bean.Depart;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// fallback用于指定当前Feign接口的服务降级类
@FeignClient(value = "abcmsc-provider-depart", fallback= DepartFallback.class)
@RequestMapping("/provider/depart")
public interface DepartService {
    @PostMapping("/save")
    boolean saveDepart(@RequestBody Depart depart);

    @DeleteMapping("/del/{id}")
    boolean removeDepartById(@PathVariable("id") Integer id);

    @PutMapping("/update")
    boolean modifyDepart(@RequestBody Depart depart);

    @GetMapping("/get/{id}")
    Depart getDepartById(@PathVariable("id") Integer id);

    @GetMapping("/list")
    List<Depart> listAllDeparts();
}
