package com.example.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import com.example.form.HelloWorldForm;

public class HelloWorldAction extends Action {
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response) {
        HelloWorldForm helloForm = (HelloWorldForm) form;
        helloForm.setMessage("Hello, Struts 1!");
        return mapping.findForward("success");
    }
}
