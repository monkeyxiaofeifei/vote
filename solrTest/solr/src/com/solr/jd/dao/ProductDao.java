package com.solr.jd.dao;

import com.solr.jd.model.ResultModel;
import org.apache.solr.client.solrj.SolrQuery;



/**
 * 商品dao
 * <p>Title: ProductDao</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.com</p> 
 * @author	传智.入云龙
 * @date	2015-6-23下午5:12:24
 * @version 1.0
 */
public interface ProductDao {

	ResultModel queryProduct(SolrQuery query) throws Exception;
}
