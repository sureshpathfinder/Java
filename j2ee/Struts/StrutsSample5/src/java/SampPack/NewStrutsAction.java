/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SampPack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author MYPC
 */
public class NewStrutsAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
         //  Cast ActionForm object to SubmitForm type
    SampleStrutsActionForm f = (SampleStrutsActionForm) form;

    //  Retrieve the value of lastname field
    String lastName = f.getName();

    //  Translate the lastname to upper case and save it Request scope
    request.setAttribute("name", lastName.toUpperCase());
   
   
        return mapping.findForward(SUCCESS);
    }
}
