package com.solr.test;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * Created by MonkeyHu on 2017/10/4.
 */
public class SolrFirst {

    //添加文档
    @Test
    public void addDocument() throws Exception {
        SolrServer solrServer = new HttpSolrServer("http://47.93.35.101:8080/solr");
        //创建一个文档对象
        SolrInputDocument document = new SolrInputDocument();
        //第一个参数 是域的名称（必须在schema.xml中定义），   第二个是域的值
        document.addField("id", "solr001");
        document.addField("brand_name", "淘宝");
        document.addField("brand_info", "购物");

        //把这个文档添加到索引库
        solrServer.add(document);
        solrServer.commit();
    }


    //删除文档(根据id删除)
    @Test
    public void deleteDocumentByID() throws Exception {
        SolrServer solrServer = new HttpSolrServer("http://47.93.35.101:8080/solr");
        //直接调用删除的方法
        solrServer.deleteById("solr001");
        solrServer.commit();
    }

    //删除文档(根据查询删除)
    @Test
    public void deleteDocumentByQuery() throws Exception {
        SolrServer solrServer = new HttpSolrServer("http://47.93.35.101:8080/solr");
        //直接调用删除的方法
        solrServer.deleteByQuery("*:*");
        solrServer.commit();
    }


    //简单查询
    //查询索引库
    @Test
    public void queryIndexSimple() throws Exception {
        SolrServer solrServer = new HttpSolrServer("http://47.93.35.101:8080/solr");

        //创建一个查询对象
        SolrQuery query = new SolrQuery();
        //添加查询条件
        query.set("q", "*:*");
        //执行查询
        QueryResponse queryResponse = solrServer.query(query);
        //遍历结果     取文档列表
        SolrDocumentList results = queryResponse.getResults();
        System.out.println("查询结果总数量："+results.getNumFound());
        for (SolrDocument solrDocument : results) {
            System.out.println(solrDocument.get("id"));
            System.out.println(solrDocument.get("brand_name"));
            System.out.println(solrDocument.get("brand_info"));
            System.out.println(solrDocument.get("brand_type"));
        }
    }


    //复杂查询  查询索引库
    @Test
    public void queryIndexFuza() throws Exception{
        SolrServer solrServer = new HttpSolrServer("http://47.93.35.101:8080/solr");
        //创建一个查询对象
        SolrQuery query = new SolrQuery();
        //添加查询条件
        query.setQuery("购物");
        //过滤条件
        query.addFilterQuery("brand_type:购物");
        //排序条件
        query.setSort("id", SolrQuery.ORDER.asc);
        //分页条件
        query.setStart(0);
        query.setRows(15);
        //设置返回结果中的域列表
//        query.setFields("id","brand_name");
        //设置默认搜索域
        query.set("df","brand_keywords");
        //设置高亮
        query.setHighlight(true);
        //设置高亮显示的域
        query.addHighlightField("brand_info");
        //设置高亮显示前缀
        query.setHighlightSimplePre("<em>");
        //设置高亮显示后缀
        query.setHighlightSimplePost("</em>");
        //执行查询
        QueryResponse queryResponse = solrServer.query(query);
        //遍历结果     取文档列表
        SolrDocumentList results = queryResponse.getResults();
        System.out.println("查询结果总数量："+results.getNumFound());
        for (SolrDocument solrDocument : results) {
            System.out.println("brand_id : "+solrDocument.get("id"));
            //取高亮结果
            Map<String,Map<String,List<String>>> highlighting = queryResponse.getHighlighting();
            List<String> list = highlighting.get(solrDocument.get("id")).get("brand_name");
            String brandName = "";
            if (list != null && list.size() >0){
                brandName = list.get(0);
            }else{
                brandName = (String) solrDocument.get("brand_name");
            }
            System.out.println("brandName : "+brandName);
            System.out.println("brand_info : "+solrDocument.get("brand_info"));
            System.out.println("brand_type : "+solrDocument.get("brand_type"));

            System.out.println("=====================================================");
        }
    }
}