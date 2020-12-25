package com.wyx.busconfigconsumer.controller;

import com.wyx.busconfigconsumer.bean.Depart;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@RefreshScope
@RestController
@RequestMapping("/consumer/depart")
public class SomeController {
    @Resource
    private RestTemplate restTemplate;
    @Value("${prefix}")
    private String prefix;

    private static final String SERVICE_PROVIDER = "http://abcmsc-provider-depart";
    @PostMapping("/save")
    public boolean saveHandler(@RequestBody Depart depart) {

        String url = SERVICE_PROVIDER + "/provider/depart/save";
        return restTemplate.postForObject(url, depart, Boolean.class);
    }

    @DeleteMapping("/del/{id}")
    public void deleteHandler(@PathVariable("id") int id) {
        String url = SERVICE_PROVIDER + "/provider/depart/del/" + id;
        restTemplate.delete(url);
    }

    @PutMapping("/update")
    public void updateHandler(@RequestBody Depart depart) {
        String url = SERVICE_PROVIDER + "/provider/depart/update";
        restTemplate.put(url, depart);
    }

    @GetMapping("/get/{id}")
    public Depart getByIdHandler(@PathVariable("id") int id) {
        String url = SERVICE_PROVIDER + "/provider/depart/get/" + id;
        Depart forObject = restTemplate.getForObject(url, Depart.class);
        forObject.setName(prefix + forObject.getName());
        return forObject;
    }

    @GetMapping("/list")
    public List<Depart> listHandler() {
        String url = SERVICE_PROVIDER + "/provider/depart/list";
        return restTemplate.getForObject(url, List.class);
    }
}
