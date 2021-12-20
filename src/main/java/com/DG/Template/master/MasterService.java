//package com.DG.Template.master;
//
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class MasterService {
//    public static Map<Object, Object> getDataSourceHashMap(){
//
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/emp1");
//        dataSource.setUsername("root");
//        dataSource.setPassword("2001");
//
//        DriverManagerDataSource dataSource1 = new DriverManagerDataSource();
//        dataSource1.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        dataSource1.setUrl("jdbc:mysql://localhost:3306/emp2");
//        dataSource.setUsername("root");
//        dataSource.setPassword("2001");
//
//        HashMap hashMap = new HashMap();
//        hashMap.put("tenantId1", dataSource);
//        hashMap.put("tenantId2", dataSource1);
//        return hashMap;
//    }
//}
