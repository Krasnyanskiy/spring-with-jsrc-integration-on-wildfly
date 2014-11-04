JSRC intagration with Spring
============================

To run your Spring application on WildFly 8.1 Application Server you can consider this source. It is important to add proper exclusions to you WildFly Deployment Structure Descriptor:

```java
<jboss-deployment-structure>
    <deployment>
        <exclusions>
            <module name="javaee.api" />
            <module name="javax.ws.rs.api"/>
            <module name="org.codehaus.jackson.jackson-core-asl" />
            <module name="org.jboss.resteasy.resteasy-atom-provider" />
            <module name="org.jboss.resteasy.resteasy-cdi" />
            <module name="org.jboss.resteasy.resteasy-crypto" />
            <module name="org.jboss.resteasy.resteasy-jackson-provider" />
            <module name="org.jboss.resteasy.resteasy-jaxb-provider" />
            <module name="org.jboss.resteasy.resteasy-jaxrs" />
            <module name="org.jboss.resteasy.resteasy-jettison-provider" />
            <module name="org.jboss.resteasy.resteasy-jsapi" />
            <module name="org.jboss.resteasy.resteasy-json-p-provider" />
            <module name="org.jboss.resteasy.resteasy-multipart-provider" />
            <module name="org.jboss.resteasy.resteasy-validator-provider-11" />
            <module name="org.jboss.resteasy.resteasy-yaml-provider" />
        </exclusions>
    </deployment>
</jboss-deployment-structure>
```
Also you need to include to your pom file
```java
<dependency>
    <groupId>org.glassfish.jersey.containers</groupId>
    <artifactId>jersey-container-servlet</artifactId>
    <version>2.13</version>
</dependency>
<dependency>
    <groupId>org.glassfish.jersey.containers.glassfish</groupId>
    <artifactId>jersey-gf-cdi</artifactId>
    <version>2.13</version>
</dependency>
```
