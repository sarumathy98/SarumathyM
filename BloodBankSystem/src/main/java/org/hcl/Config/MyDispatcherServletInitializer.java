package org.hcl.Config;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyDispatcherServletInitializer  extends AbstractAnnotationConfigDispatcherServletInitializer { 
	    @Override
		protected Class<?>[] getRootConfigClasses() {
			// TODO Auto-generated method stub
			return new Class[] {AppContext.class};
		}
	    @Override
		protected Class<?>[] getServletConfigClasses() {
			return new Class[] {mvcConfig.class};
		}
	    @Override
		protected String[] getServletMappings() {
			return new String[] {"/"};
		}

	}



