package com.leo.flowrestrict.bean;

import java.util.List;

import lombok.Data;
import lombok.ToString;

/**
 * Created by leo on 2020/7/22.
 * Description:
 */
@Data
@ToString
public class ApplicationYml {
    private Profile spring;

    private Server server;

    @Data
    public static class Server {
        private long port;
    }
    @Data
    public static class Profile {
        private Active profiles;

        @Data
        public static class Active {
            private String active;
        }
    }
}
