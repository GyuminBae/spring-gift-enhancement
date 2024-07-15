package gift.advice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    private final LoggedInUserArgumentResolver loggedInUserArgumentResolver;

    @Autowired
    public WebMvcConfig(LoggedInUserArgumentResolver loggedInUserArgumentResolver) {
        this.loggedInUserArgumentResolver = loggedInUserArgumentResolver;
    }

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
        resolvers.add(loggedInUserArgumentResolver);
    }
}
