package gh.funthomas424242;

import javax.servlet.*;
import java.io.IOException;
import com.flexive.shared.*;

public class SampleServlet implements Servlet {
    private ServletConfig servletConfig;

    public void init(ServletConfig servletConfig) throws ServletException {
        this.servletConfig = servletConfig;
    }

    public ServletConfig getServletConfig() {
        return servletConfig;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("SampleServlet called - flexive version: " + FxSharedUtils.getFlexiveEditionFull());
    }

    public String getServletInfo() {
        return getClass().getName();
    }

    public void destroy() {

    }

}
