package com.wyx.sleuthconsumer078080.controller;

import com.wyx.sleuthconsumer078080.bean.Depart;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/consumer/depart")
public class SomeController {
    @Resource
    private RestTemplate restTemplate;

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
        log.info("调用consumer的getByIdHandler()方法");
        String url = SERVICE_PROVIDER + "/provider/depart/get/" + id;
        return restTemplate.getForObject(url, Depart.class);
    }

    @GetMapping("/list")
    public List<Depart> listHandler() {
        String url = SERVICE_PROVIDER + "/provider/depart/list";
        return restTemplate.getForObject(url, List.class);
    }
}
