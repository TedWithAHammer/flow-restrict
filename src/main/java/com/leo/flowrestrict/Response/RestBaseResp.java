package com.leo.flowrestrict.Response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * Created by leo on 2020/7/20.
 * Description:
 */
@Data
@ToString
@AllArgsConstructor
public class RestBaseResp {
    public String errCode;
    public String errMsg;

    public static RestBaseResp OK = new RestBaseResp("00000", "SUCCESS");
    public static RestBaseResp FAILED = new RestBaseResp("10001", "FAILED");

}
