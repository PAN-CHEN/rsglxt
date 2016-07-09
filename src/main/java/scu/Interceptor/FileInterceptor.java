package scu.Interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import scu.model.Emplinfo;
import scu.repository.EmplinfoRepository;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by lijiankuan on 16/7/9.
 */
public class FileInterceptor extends HandlerInterceptorAdapter {
    @Autowired
    private EmplinfoRepository emplinfoRepository;

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {


        if (request.getSession().getAttribute("login") != null) {
            Emplinfo emplinfo = emplinfoRepository.findOne((int)request.getSession().getAttribute("emplno"));
            if(emplinfo.getFileno().equals(request.getRequestURI())){
                return true;
            }
        }

        response.sendRedirect("/login?next=".concat(request.getRequestURI()));
        return false;
    }
}
