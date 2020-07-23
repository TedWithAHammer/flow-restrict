package com.leo.flowrestrict.Response;

import lombok.Data;

/**
 * Created by leo on 2020/7/23.
 * Description:
 */
@Data
public class RestResp<T> extends RestBaseResp {

    private T data;

    public RestResp(String errCode, String errMsg, T data) {
        super(errCode, errMsg);
        this.data = data;
    }

    public RestResp(T data) {
        super("00000", "SUCCESS");
        this.data = data;
    }

}
