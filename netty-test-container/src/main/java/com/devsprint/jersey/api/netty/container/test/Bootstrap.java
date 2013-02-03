package com.devsprint.jersey.api.netty.container.test;

import com.devsprint.jersey.api.container.netty.NettyServer;
import com.devsprint.jersey.api.container.netty.NettyServerFactory;
import com.sun.jersey.api.core.ClassNamesResourceConfig;

import javax.ws.rs.core.UriBuilder;
import java.net.URI;

/**
 * Created with IntelliJ IDEA.
 * User: olupas
 * Date: 2/3/13
 * Time: 10:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class Bootstrap {


    protected static URI getBaseURI() {
           return UriBuilder.fromUri("http://localhost/").port(9998).build();
       }
    public static void main(String[] args) {

        ClassNamesResourceConfig resourceConfig = new ClassNamesResourceConfig(ProbeResource.class);
        NettyServer server = NettyServerFactory.create(resourceConfig, getBaseURI());
        server.startServer();

    }
}
