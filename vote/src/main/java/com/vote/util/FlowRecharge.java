package com.vote.util;




import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 流量充值
 */

/**
 * Created by MonkeyHu on 2017/8/5.
 */
public class FlowRecharge {

    //编码格式。发送编码格式统一用UTF-8
    private static String ENCODING = "UTF-8";
    private static String apikey = "7dc03105dd65e2ac4da9181ef2c1ca4d";

    /**
     * 流量充值
     * @param mobile
     * @return
     * @throws IOException
     * @throws URISyntaxException
     */
    public static String recharge(String mobile ,Integer awardId)throws IOException,URISyntaxException{

        String sn = null;
        if (awardId==10003){
            sn="1008605";
        }else{
            if (awardId==10004){
                sn="1008603";
            }else{
                if (awardId==10005){
                    sn="1008602";
                }else{
                    if (awardId==10006){
                        sn="1008601";
                    }
                }
            }
        }
        Map<String, String> params = new HashMap<String, String>();//请求参数集合
        params.put("apikey", apikey);
        params.put("sn", sn);
        params.put("mobile", mobile);
        return post("https://flow.yunpian.com/v2/flow/recharge.json",params);//请自行使用post方式请求,可使用Apache HttpClient
    }


    /**
     * 调用接口
     * @param url
     * @param paramsMap
     * @return
     */
    public static String post(String url, Map<String, String> paramsMap) {
        CloseableHttpClient client = HttpClients.createDefault();
        String responseText = "";
        CloseableHttpResponse response = null;
        try {
            HttpPost method = new HttpPost(url);
            if (paramsMap != null) {
                List<NameValuePair> paramList = new ArrayList<NameValuePair>();
                for (Map.Entry<String, String> param : paramsMap.entrySet()) {
                    NameValuePair pair = new BasicNameValuePair(param.getKey(), param.getValue());
                    paramList.add(pair);
                }
                method.setEntity(new UrlEncodedFormEntity(paramList, ENCODING));
            }
            response = client.execute(method);
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                responseText = EntityUtils.toString(entity, ENCODING);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                response.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return responseText;
    }
}
