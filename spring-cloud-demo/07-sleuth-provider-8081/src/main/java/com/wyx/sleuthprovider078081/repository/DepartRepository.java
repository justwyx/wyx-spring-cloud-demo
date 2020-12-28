package com.wyx.sleuthprovider078081.repository;

import com.wyx.sleuthprovider078081.bean.Depart;
import org.springframework.data.jpa.repository.JpaRepository;

// 第一个泛型是，当前Repository所操作的对象的类型
// 第二个泛型是，当前Repository所操作的对象的id类型
public interface DepartRepository extends JpaRepository<Depart, Integer> {
}
