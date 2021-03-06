import com.netflix.zuul.context.RequestContext
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import com.netflix.zuul.ZuulFilter;

import javax.servlet.http.HttpServletRequest

class PostFilter extends ZuulFilter{
    Logger logger = LoggerFactory.getLogger(PostFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1000;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext cxt = RequestContext.getCurrentContext();
        HttpServletRequest request = cxt.getRequest();
        logger.info("this is a post filter: send {} request to {}", request.getMethod(), request.getRequestURL().toString());
        return null;
    }
}