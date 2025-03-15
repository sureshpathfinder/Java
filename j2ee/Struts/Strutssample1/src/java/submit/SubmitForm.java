package submit;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.*;

public final class SubmitForm extends ActionForm {

  /* Last Name */
  private String lastName = "Your last name"; // default value
  public String getLastName() {
    return (this.lastName);
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /* Address */
  private String address = null;
  public String getAddress() {
    return (this.address);
  }
  public void setAddress(String address) {
    this.address = address;
  }

  /* Sex */
  private String sex = null;
  public String getSex() {
    return (this.sex);
  }
  public void setSex(String sex) {
    this.sex = sex;
  }

  /* Married status */
  private String married = null;
  public String getMarried() {
    return (this.married);
  }
  public void setMarried(String married) {
    this.married = married;
  }

  /* Age */
  private String age = null;
  public String getAge() {
    return (this.age);
  }
  public void setAge(String age) {
    this.age = age;
  }

  public ActionErrors validate(ActionMapping mapping,
         HttpServletRequest request) {

    // Check for mandatory data
    ActionErrors errors = new ActionErrors();
    if (lastName == null || lastName.equals("")) { 
      errors.add("Last Name", new ActionError("error.lastName"));
    }
    if (address == null || address.equals("")) { 
      errors.add("Address", new ActionError("error.address"));
    }
    if (sex == null || sex.equals("")) { 
      errors.add("Sex", new ActionError("error.sex"));
    }
    if (age == null || age.equals("")) { 
      errors.add("Age", new ActionError("error.age"));
    }
    return errors;
  }

}

