package fi.vm.sade.cas.oppija;

import net.unicon.cas.client.configuration.EnableCasClient;
import org.jasig.cas.client.session.SingleSignOutFilter;
import org.jasig.cas.client.session.SingleSignOutHttpSessionListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableCasClient
public class CasOppijaClientExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(CasOppijaClientExampleApplication.class, args);
    }

    @Bean
    public FilterRegistrationBean<SingleSignOutFilter> singleSignOutFilter(Environment environment) {
        SingleSignOutFilter filter = new SingleSignOutFilter();
        filter.setIgnoreInitConfiguration(true);
        filter.setCasServerUrlPrefix(environment.getRequiredProperty("cas.server-url-prefix"));

        FilterRegistrationBean<SingleSignOutFilter> bean = new FilterRegistrationBean<>(filter);
        bean.setOrder(0);
        return bean;
    }

    @Bean
    public ServletListenerRegistrationBean<SingleSignOutHttpSessionListener> singleSignOutHttpSessionListener() {
        return new ServletListenerRegistrationBean<>(new SingleSignOutHttpSessionListener());
    }

}
