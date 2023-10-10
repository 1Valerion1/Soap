package com.example.soapservice.config;


import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
class WebSoapConfig extends WsConfigurerAdapter {
    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, "/ws/*");
    }
    @Bean(name="items")
    public DefaultWsdl11Definition defaultWsdl11Definition2(XsdSchema xsdSchema){
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("ItemsPort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace("http://example.com/soapservice/models");
        wsdl11Definition.setSchema(xsdSchema);
        return wsdl11Definition;
    }
    @Bean(name="countries")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema countriesSchema){
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("CountriesPort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace("http://example.com/soapservice/models");
        wsdl11Definition.setSchema(countriesSchema);
        return wsdl11Definition;
    }
    @Bean(name="movies")
    public DefaultWsdl11Definition defaultWsdl11Definition3(XsdSchema moviesSchema){
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("MoviesPort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace("http://example.com/soapservice/models");
        wsdl11Definition.setSchema(moviesSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema countriesSchema() {
        return new SimpleXsdSchema(new ClassPathResource("countries.xsd"));
    }
    @Bean
    public XsdSchema xsdSchema(){
        return new SimpleXsdSchema(new ClassPathResource("items.xsd"));
    }
    @Bean
    public XsdSchema moviesSchema(){
        return new SimpleXsdSchema(new ClassPathResource("movies.xsd"));
    }
}
