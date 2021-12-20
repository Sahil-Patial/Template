//package com.DG.Template.routing;
//
//import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
//import org.springframework.web.context.request.RequestContextHolder;
//import org.springframework.web.context.request.ServletRequestAttributes;
//
//public class CustomRoutingDataSource extends AbstractRoutingDataSource {
//
//    @Override
//    protected Object determineCurrentLookupKey(){
//        ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
//
//        if(attr != null){
//            String tenantId = attr.getRequest().getParameter("tenantId");
//            return tenantId;
//        }
//        else{
//            return "tenantId2";
//        }
//    }
//
//}
