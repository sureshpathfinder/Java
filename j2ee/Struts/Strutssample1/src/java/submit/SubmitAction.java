package submit;

import javax.servlet.http.*;
import org.apache.struts.action.*;

public final class SubmitAction extends Action {

  // The execute() method is where you provide your business logic
    @Override
  public ActionForward execute(ActionMapping mapping,
                               ActionForm form,
                               HttpServletRequest request,
                               HttpServletResponse response) {

    //  Cast ActionForm object to SubmitForm type
    SubmitForm f = (SubmitForm) form;

    //  Retrieve the value of lastname field
    String lastName = f.getLastName();

    //  Translate the lastname to upper case and save it Request scope
    request.setAttribute("lastName", lastName.toUpperCase());
   
    //  Create and return ActionForward object with "success" outcome
    return (mapping.findForward("success"));
  }
}
